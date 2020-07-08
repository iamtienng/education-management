package com.iamtienng.em.dao;

import com.iamtienng.em.model.Course;
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
public class CourseDAOImpl implements CourseDAO {

    @Override
    public List<Course> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM course;";
        List<Course> list = new ArrayList<>();
        try {

            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setId_course(rs.getInt("id_course"));
                course.setName_course(rs.getString("name_course"));
                course.setDescription(rs.getString("description"));
                course.setStart_date(rs.getDate("start_date"));
                course.setEnd_date(rs.getDate("end_date"));
                course.setStatus_course(rs.getBoolean("status_course"));
                list.add(course);
            }
            ps.close();
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int createOrUpdate(Course course) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO course(id_course, name_course, description, start_date, end_date, status_course) VALUES(?, ? , ?, ?, ?, ?) ON DUPLICATE KEY UPDATE name_course = VALUES(name_course), description = VALUES(description), start_date = VALUES(start_date), end_date = VALUES(end_date), status_course = VALUES(status_course);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, course.getId_course());
            ps.setString(2, course.getName_course());
            ps.setString(3, course.getDescription());
            ps.setDate(4, new Date(course.getStart_date().getTime()));
            ps.setDate(5, new Date(course.getEnd_date().getTime()));
            ps.setBoolean(6, course.isStatus_course());
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
            ex.printStackTrace();
        }
        return 0;
    }
}
