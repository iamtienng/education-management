package com.iamtienng.em.controller;

import com.iamtienng.em.model.Course;
import com.iamtienng.em.service.CourseService;
import com.iamtienng.em.service.CourseServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author iamtienng
 */
public class CourseController {

    private JButton btnSubmit;
    private JTextField jtfIDCourse;
    private JTextField jtfNameCourse;
    private JDateChooser jdcStartDate;
    private JDateChooser jdcEndDate;
    private JCheckBox jcbStatusCourse;
    private JTextArea jtaDescription;
    private JLabel jlbMsg;

    private Course course = null;

    private CourseService courseService = null;

    public CourseController(JButton btnSubmit, JTextField jtfIDCourse,
            JTextField jtfNameCourse, JDateChooser jdcStartDate,
            JDateChooser jdcEndDate, JCheckBox jcbStatusCourse,
            JTextArea jtaDescription, JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfIDCourse = jtfIDCourse;
        this.jtfNameCourse = jtfNameCourse;
        this.jdcStartDate = jdcStartDate;
        this.jdcEndDate = jdcEndDate;
        this.jcbStatusCourse = jcbStatusCourse;
        this.jtaDescription = jtaDescription;
        this.jlbMsg = jlbMsg;

        this.courseService = new CourseServiceImpl();
    }

    public void setView(Course course) {
        this.course = course;
        //set data course
        jtfIDCourse.setText("#" + course.getId_course());
        jtfNameCourse.setText(course.getName_course());
        jdcStartDate.setDate(course.getStart_date());
        jdcEndDate.setDate(course.getEnd_date());
        jtaDescription.setText(course.getDescription());
        jcbStatusCourse.setSelected(course.isStatus_course());
        setEvent();
    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jtfNameCourse.getText().length() == 0 || jdcStartDate.getDate() == null) {
                    jlbMsg.setText("Please fill the data!");
                } else {
                    course.setName_course(jtfNameCourse.getText());
                    course.setDescription(jtaDescription.getText());
                    course.setStart_date(covertDateToDateSql((Date) jdcStartDate.getDate()));
                    course.setEnd_date(covertDateToDateSql((Date) jdcEndDate.getDate()));
                    course.setStatus_course(jcbStatusCourse.isSelected());
                    int lastId = courseService.createOrUpdate(course);
                    if (lastId > 0) {
                        course.setId_course(lastId);
                        jtfIDCourse.setText("#" + lastId);
                        jlbMsg.setText("Successfully update course info!");
                    }
                }
            }

        });
    }

    public java.sql.Date covertDateToDateSql(Date d) {
        return new java.sql.Date(d.getTime());
    }

}
