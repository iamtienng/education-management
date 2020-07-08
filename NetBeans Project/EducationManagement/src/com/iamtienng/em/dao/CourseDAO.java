package com.iamtienng.em.dao;

import com.iamtienng.em.model.Course;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public interface CourseDAO {

    public List<Course> getList();

    public int createOrUpdate(Course course);
}
