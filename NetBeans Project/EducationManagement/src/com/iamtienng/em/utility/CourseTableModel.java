package com.iamtienng.em.utility;

import com.iamtienng.em.model.Course;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iamtienng
 */
public class CourseTableModel {

    public DefaultTableModel setTableCourse(List<Course> listItem, String[] listColumn) {
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 6 ? Boolean.class : String.class;
            }

        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                Course course = listItem.get(i);
                obj = new Object[columns];
                obj[0] = course.getId_course();
                obj[1] = (i + 1);
                obj[2] = course.getName_course();
                obj[3] = course.getDescription();
                obj[4] = course.getStart_date();
                obj[5] = course.getEnd_date();
                obj[6] = course.isStatus_course();
                dtm.addRow(obj);
            }
        }
        return dtm;

    }

}
