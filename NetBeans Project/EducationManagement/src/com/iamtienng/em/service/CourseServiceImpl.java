package com.iamtienng.em.service;

import com.iamtienng.em.dao.CourseDAO;
import com.iamtienng.em.dao.CourseDAOImpl;
import com.iamtienng.em.model.Course;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public class CourseServiceImpl implements CourseService {

    private CourseDAO courseDAO = null;

    public CourseServiceImpl() {
        courseDAO = new CourseDAOImpl();
    }

    @Override
    public List<Course> getList() {
        return courseDAO.getList();
    }

    @Override
    public int createOrUpdate(Course course) {
        return courseDAO.createOrUpdate(course);
    }

}
