package com.iamtienng.em.service;

import com.iamtienng.em.model.Course;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public interface CourseService {

    public List<Course> getList();

    public int createOrUpdate(Course course);

}
