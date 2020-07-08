package com.iamtienng.em.model;

import java.sql.Date;
import java.io.Serializable;

/**
 *
 * @author iamtienng
 */
public class Class {

    private int id_class;
    private Course id_course;
    private Student id_student;
    private Date subscribe_date;
    private boolean status;

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public Course getId_course() {
        return id_course;
    }

    public void setId_course(Course id_course) {
        this.id_course = id_course;
    }

    public Student getId_student() {
        return id_student;
    }

    public void setId_student(Student id_student) {
        this.id_student = id_student;
    }

    public Date getSubscribe_date() {
        return subscribe_date;
    }

    public void setSubscribe_date(Date subscribe_date) {
        this.subscribe_date = subscribe_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
