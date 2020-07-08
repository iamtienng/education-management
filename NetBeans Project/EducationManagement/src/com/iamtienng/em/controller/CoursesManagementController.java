package com.iamtienng.em.controller;

import com.iamtienng.em.model.Course;
import com.iamtienng.em.service.CourseService;
import com.iamtienng.em.service.CourseServiceImpl;
import com.iamtienng.em.utility.CourseTableModel;
import com.iamtienng.em.view.CourseJFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author iamtienng
 */
public class CoursesManagementController {

    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;

    private CourseService courseService = null;

    private String[] listColumn = {"ID Course", "Serial", "Course Name",
        "Description", "Start Date", "End Date", "Status"};

    private TableRowSorter<TableModel> rowSorter = null;

    public CoursesManagementController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;

        this.courseService = new CourseServiceImpl();
    }

    public void setDateToTable() {
        List<Course> listItem = courseService.getList();
        DefaultTableModel model = new CourseTableModel().setTableCourse(listItem, listColumn);
        JTable table = new JTable(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);

                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);

                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);

                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);

        table.getColumnModel().getColumn(1).setMinWidth(50);
        table.getColumnModel().getColumn(1).setMaxWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);

                    Course course = new Course();
                    course.setId_course((int) model.getValueAt(selectedRowIndex, 0));
                    course.setName_course(model.getValueAt(selectedRowIndex, 2).toString());
                    course.setDescription(model.getValueAt(selectedRowIndex, 3).toString());
                    course.setStart_date((Date) model.getValueAt(selectedRowIndex, 4));
                    course.setEnd_date((Date) model.getValueAt(selectedRowIndex, 5));
                    course.setStatus_course((boolean) model.getValueAt(selectedRowIndex, 6));

                    CourseJFrame frame = new CourseJFrame(course);
                    frame.setTitle("Course Information");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }

        });
        table.getTableHeader().setFont(new Font("Montserrat", Font.BOLD, 12));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        JScrollPane scrollPane = new JScrollPane();

        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1300, 400));

        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
    }

    public void setEvent() {
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CourseJFrame frame = new CourseJFrame(new Course());
                frame.setTitle("Course Information");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
            }

        });
    }
}
