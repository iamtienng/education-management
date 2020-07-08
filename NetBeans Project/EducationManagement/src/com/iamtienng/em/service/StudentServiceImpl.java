package com.iamtienng.em.service;

import com.iamtienng.em.dao.StudentDAOImpl;
import com.iamtienng.em.model.Student;
import java.util.List;
import com.iamtienng.em.dao.StudentDAO;

/**
 *
 * @author iamtienng
 */
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO = null;

    public StudentServiceImpl() {
        studentDAO = new StudentDAOImpl();
    }

    @Override
    public List<Student> getList() {
        return studentDAO.getList();
    }

    @Override
    public int createOrUpdate(Student student) {
        return studentDAO.createOrUpdate(student);
    }
}
