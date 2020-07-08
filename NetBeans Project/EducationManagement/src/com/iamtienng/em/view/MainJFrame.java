package com.iamtienng.em.view;

import com.iamtienng.em.bean.BeanList;
import com.iamtienng.em.controller.ScreenChangeController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();

        setTitle("Education Management");

        ScreenChangeController controller = new ScreenChangeController(jpnView);
        controller.setView(jpnMainFeed, jlbMainFeed);

        List<BeanList> listItem = new ArrayList<>();
        listItem.add(new BeanList("TrangChu", jpnMainFeed, jlbMainFeed));
        listItem.add(new BeanList("HocVien", jpnStudent, jlbStudent));
        listItem.add(new BeanList("KhoaHoc", jpnCourse, jlbCourse));
        listItem.add(new BeanList("LopHoc", jpnClass, jlbClass));
        listItem.add(new BeanList("ThongKe", jpnStatic, jlbStatic));

        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnMainFeed = new javax.swing.JPanel();
        jlbMainFeed = new javax.swing.JLabel();
        jpnStudent = new javax.swing.JPanel();
        jlbStudent = new javax.swing.JLabel();
        jpnCourse = new javax.swing.JPanel();
        jlbCourse = new javax.swing.JLabel();
        jpnClass = new javax.swing.JPanel();
        jlbClass = new javax.swing.JLabel();
        jpnStatic = new javax.swing.JPanel();
        jlbStatic = new javax.swing.JLabel();
        jlbiamtienng = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(82, 83, 81));

        jPanel4.setBackground(new java.awt.Color(232, 64, 60));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/baseline_supervised_user_circle_black_18dp.png"))); // NOI18N
        jLabel1.setText("Education Management");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jpnMainFeed.setBackground(new java.awt.Color(76, 157, 80));

        jlbMainFeed.setBackground(new java.awt.Color(255, 255, 255));
        jlbMainFeed.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbMainFeed.setForeground(new java.awt.Color(255, 255, 255));
        jlbMainFeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/baseline_today_black_18dp.png"))); // NOI18N
        jlbMainFeed.setText("Main Feed");

        javax.swing.GroupLayout jpnMainFeedLayout = new javax.swing.GroupLayout(jpnMainFeed);
        jpnMainFeed.setLayout(jpnMainFeedLayout);
        jpnMainFeedLayout.setHorizontalGroup(
            jpnMainFeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainFeedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMainFeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMainFeedLayout.setVerticalGroup(
            jpnMainFeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainFeedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMainFeed, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnStudent.setBackground(new java.awt.Color(76, 157, 80));

        jlbStudent.setBackground(new java.awt.Color(255, 255, 255));
        jlbStudent.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbStudent.setForeground(new java.awt.Color(255, 255, 255));
        jlbStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/baseline_account_circle_black_18dp.png"))); // NOI18N
        jlbStudent.setText("Student Management");

        javax.swing.GroupLayout jpnStudentLayout = new javax.swing.GroupLayout(jpnStudent);
        jpnStudent.setLayout(jpnStudentLayout);
        jpnStudentLayout.setHorizontalGroup(
            jpnStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStudentLayout.setVerticalGroup(
            jpnStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnCourse.setBackground(new java.awt.Color(76, 157, 80));

        jlbCourse.setBackground(new java.awt.Color(255, 255, 255));
        jlbCourse.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbCourse.setForeground(new java.awt.Color(255, 255, 255));
        jlbCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/baseline_dns_black_18dp.png"))); // NOI18N
        jlbCourse.setText("Course Management");

        javax.swing.GroupLayout jpnCourseLayout = new javax.swing.GroupLayout(jpnCourse);
        jpnCourse.setLayout(jpnCourseLayout);
        jpnCourseLayout.setHorizontalGroup(
            jpnCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnCourseLayout.setVerticalGroup(
            jpnCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnClass.setBackground(new java.awt.Color(76, 157, 80));

        jlbClass.setBackground(new java.awt.Color(255, 255, 255));
        jlbClass.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbClass.setForeground(new java.awt.Color(255, 255, 255));
        jlbClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/baseline_class_black_18dp.png"))); // NOI18N
        jlbClass.setText("Class Management");

        javax.swing.GroupLayout jpnClassLayout = new javax.swing.GroupLayout(jpnClass);
        jpnClass.setLayout(jpnClassLayout);
        jpnClassLayout.setHorizontalGroup(
            jpnClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnClassLayout.setVerticalGroup(
            jpnClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbClass, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnStatic.setBackground(new java.awt.Color(76, 157, 80));

        jlbStatic.setBackground(new java.awt.Color(255, 255, 255));
        jlbStatic.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbStatic.setForeground(new java.awt.Color(255, 255, 255));
        jlbStatic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/baseline_pie_chart_black_18dp.png"))); // NOI18N
        jlbStatic.setText("Static Data");

        javax.swing.GroupLayout jpnStaticLayout = new javax.swing.GroupLayout(jpnStatic);
        jpnStatic.setLayout(jpnStaticLayout);
        jpnStaticLayout.setHorizontalGroup(
            jpnStaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaticLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStatic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStaticLayout.setVerticalGroup(
            jpnStaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaticLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStatic, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jlbiamtienng.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlbiamtienng.setForeground(new java.awt.Color(255, 255, 255));
        jlbiamtienng.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbiamtienng.setText("© iamtienng");

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlbiamtienng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnMainFeed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnStatic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnMainFeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnStatic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jlbiamtienng)
                .addContainerGap())
        );

        jpnView.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbClass;
    private javax.swing.JLabel jlbCourse;
    private javax.swing.JLabel jlbMainFeed;
    private javax.swing.JLabel jlbStatic;
    private javax.swing.JLabel jlbStudent;
    private javax.swing.JLabel jlbiamtienng;
    private javax.swing.JPanel jpnClass;
    private javax.swing.JPanel jpnCourse;
    private javax.swing.JPanel jpnMainFeed;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnStatic;
    private javax.swing.JPanel jpnStudent;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}