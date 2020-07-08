package com.iamtienng.em.controller;

import com.iamtienng.em.model.Student;
import com.iamtienng.em.service.StudentService;
import com.iamtienng.em.service.StudentServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author iamtienng
 */
public class StudentController {

    private JButton btnSubmit;
    private JTextField jtfIDStudent;
    private JTextField jtfNameStudent;
    private JDateChooser jdcBirthday;
    private JRadioButton jrbMale;
    private JRadioButton jrbFemale;
    private JTextField jtfPhoneNumber;
    private JTextArea jtaAddress;
    private JCheckBox jcbStatus;
    private JLabel jlbMsg;

    private Student student = null;

    private StudentService studentService = null;

    public StudentController(JButton btnSubmit, JTextField jtfIDStudent,
            JTextField jtfNameStudent, JDateChooser jdcBirthday,
            JRadioButton jrbMale, JRadioButton jrbFemale, JTextField jtfPhoneNumber,
            JTextArea jtaAddress, JCheckBox jcbStatus, JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfIDStudent = jtfIDStudent;
        this.jtfNameStudent = jtfNameStudent;
        this.jdcBirthday = jdcBirthday;
        this.jrbMale = jrbMale;
        this.jrbFemale = jrbFemale;
        this.jtfPhoneNumber = jtfPhoneNumber;
        this.jtaAddress = jtaAddress;
        this.jcbStatus = jcbStatus;
        this.jlbMsg = jlbMsg;

        this.studentService = new StudentServiceImpl();
    }

    public void setView(Student student) {
        this.student = student;
        //set data
        jtfIDStudent.setText("#" + student.getId_student());
        jtfNameStudent.setText(student.getName_student());
        jdcBirthday.setDate(student.getBirthday());
        if (student.isGender()) {
            jrbMale.setSelected(true);
        } else {
            jrbFemale.setSelected(true);
        }
        jtfPhoneNumber.setText(student.getPhone_number());
        jtaAddress.setText(student.getAddress());
        jcbStatus.setSelected(student.isStatus());
        //set event
        setEvent();

    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jtfNameStudent.getText().length() == 0 || jdcBirthday.getDate() == null) {
                    jlbMsg.setText("Please fill the data!");
                } else {
                    student.setName_student(jtfNameStudent.getText());
                    student.setBirthday(covertDateToDateSql((Date) jdcBirthday.getDate()));
                    student.setGender(jrbMale.isSelected());
                    student.setPhone_number(jtfPhoneNumber.getText());
                    student.setAddress(jtaAddress.getText());
                    student.setStatus(jcbStatus.isSelected());
                    int lastId = studentService.createOrUpdate(student);
                    if (lastId > 0) {
                        student.setId_student(lastId);
                        jtfIDStudent.setText("#" + lastId);
                        jlbMsg.setText("Successfully update student info!");
                    }
                }
            }
        });
    }

    public java.sql.Date covertDateToDateSql(Date d) {
        return new java.sql.Date(d.getTime());
    }
}
