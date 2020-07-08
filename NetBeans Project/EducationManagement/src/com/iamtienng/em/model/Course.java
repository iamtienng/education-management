package com.iamtienng.em.model;

import java.sql.Date;

/**
 *
 * @author iamtienng
 */
public class Course {

    private int id_course;
    private String name_course;
    private String description;
    private Date start_date;
    private Date end_date;
    private boolean status_course;

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getName_course() {
        return name_course;
    }

    public void setName_course(String name_course) {
        this.name_course = name_course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public boolean isStatus_course() {
        return status_course;
    }

    public void setStatus_course(boolean status_course) {
        this.status_course = status_course;
    }

}
