package com.iamtienng.em.dao;

import com.iamtienng.em.model.Student;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public interface StudentDAO {

    public List<Student> getList();

    public int createOrUpdate(Student student);

}
