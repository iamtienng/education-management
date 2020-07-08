package com.iamtienng.em.dao;

import com.iamtienng.em.model.Student;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<Student> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM student;";
        List<Student> list = new ArrayList<>();
        try {

            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId_student(rs.getInt("id_student"));
                student.setName_student(rs.getString("name_student"));
                student.setBirthday(rs.getDate("birthday"));
                student.setPhone_number(rs.getString("phone_number"));
                student.setGender(rs.getBoolean("gender"));
                student.setAddress(rs.getString("address"));
                student.setStatus(rs.getBoolean("status"));
                list.add(student);
            }
            ps.close();
            cons.close();
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public int createOrUpdate(Student student) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO student(id_student, name_student, birthday, gender, phone_number, address, status) VALUES(?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE name_student = VALUES(name_student), birthday = VALUES(birthday), gender = VALUES(gender), phone_number = VALUES(phone_number), address = VALUES(address), status = VALUES(status);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, student.getId_student());
            ps.setString(2, student.getName_student());
            ps.setDate(3, new Date(student.getBirthday().getTime()));
            ps.setBoolean(4, student.isGender());
            ps.setString(5, student.getPhone_number());
            ps.setString(6, student.getAddress());
            ps.setBoolean(7, student.isStatus());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (SQLException ex) {
        }
        return 0;
    }
}
