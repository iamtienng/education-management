package com.iamtienng.em.service;

import com.iamtienng.em.model.Student;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public interface StudentService {

    public List<Student> getList();

    public int createOrUpdate(Student student);

}
