/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.form;
import com.raven.dao.NgayChieuSuatChieuPhimPhongDAO;
import com.raven.dao.SuatChieuDAO;
import com.raven.models.NgayChieuSuatChieuPhimPhong;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.raven.models.Phim;
import com.raven.models.SuatChieu;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.net.URI;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author DANG GIA BAO
 */
public class Form_MovieDetails extends javax.swing.JFrame {
    private Phim p;
    private ArrayList<SuatChieu> listSC = SuatChieuDAO.getInstance().selectAll();
    private ArrayList<NgayChieuSuatChieuPhimPhong> listShowTime = new ArrayList<>();
    private Form_ChooseSeat formChooseSeat;
    public Form_MovieDetails(Phim p, String theLoaiPhim) {
        initComponents();
        this.p = p;
        listShowTime = NgayChieuSuatChieuPhimPhongDAO.getInstance().selectByCondition(""+p.getIdPhim());
        this.setLocationRelativeTo(null);
        textTenPhim2.setText("<html>"+p.getTenPhim()+"</html>");
        textTheLoai.setText("<html>"+theLoaiPhim+"</html>");
        textKhoiChieu.setText(p.getNgayPhatHanh().toString());
        textNoiDungPhim.setText("<html>"+p.getMoTaPhim()+"</html>");
        textDaoDien.setText(p.getTenDaoDien());
        textDoTuoiChoPhep.setText(p.getDoTuoiChoPhep());
        poster.setData(p.getPoster());
        LocalDate today = LocalDate.now();
        btnHomNay.setText(today.toString());
        LocalDate tomorrow = today.plusDays(1);
        btnNgayMai.setText(tomorrow.toString());
        LocalDate theDayAfterTomorrow = tomorrow.plusDays(1);
        btnNgayKia.setText(theDayAfterTomorrow.toString());
        btnTrailer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String trailerURL = p.getTrailer(); 
                try {
                    Desktop.getDesktop().browse(URI.create(trailerURL));
                } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi khi mở trailer!");
                }
            }
        });
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        textTenPhim2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textTheLoai = new javax.swing.JLabel();
        textDoTuoiChoPhep = new javax.swing.JLabel();
        textDaoDien = new javax.swing.JLabel();
        textKhoiChieu = new javax.swing.JLabel();
        textNoiDungPhim = new javax.swing.JLabel();
        btnTrailer = new javax.swing.JButton();
        poster = new com.raven.component.ImagePanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnHomNay = new com.raven.swing.MyButton();
        btnNgayMai = new com.raven.swing.MyButton();
        btnNgayKia = new com.raven.swing.MyButton();
        myButton1 = new com.raven.swing.MyButton();
        showTimePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        textTenPhim2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTenPhim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textTenPhim2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thể loại:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Độ tuổi cho phép:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Đạo diễn:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Khởi chiếu:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nội dung phim:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        textTheLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        textDoTuoiChoPhep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        textDaoDien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textDaoDien.setText(" ");

        textKhoiChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textKhoiChieu.setText(" ");

        textNoiDungPhim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNoiDungPhim.setText(" ");
        textNoiDungPhim.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnTrailer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTrailer.setText("Xem Trailer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDoTuoiChoPhep, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDaoDien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textKhoiChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNoiDungPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTrailer)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDoTuoiChoPhep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDaoDien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textKhoiChieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textNoiDungPhim, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout posterLayout = new javax.swing.GroupLayout(poster);
        poster.setLayout(posterLayout);
        posterLayout.setHorizontalGroup(
            posterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );
        posterLayout.setVerticalGroup(
            posterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ngày chiếu");

        btnHomNay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomNayActionPerformed(evt);
            }
        });

        btnNgayMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgayMaiActionPerformed(evt);
            }
        });

        btnNgayKia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgayKiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnNgayMai, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnNgayKia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNgayMai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNgayKia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        myButton1.setText("Trở lại");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        showTimePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout showTimePanelLayout = new javax.swing.GroupLayout(showTimePanel);
        showTimePanel.setLayout(showTimePanelLayout);
        showTimePanelLayout.setHorizontalGroup(
            showTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        showTimePanelLayout.setVerticalGroup(
            showTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(poster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(showTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_myButton1ActionPerformed

    private void btnHomNayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomNayActionPerformed
        ArrayList<NgayChieuSuatChieuPhimPhong> listSuatChieu = new ArrayList<>();
        for(int i = 0; i < listShowTime.size(); i++) {
            if(listShowTime.get(i).getNgayChieu().toString().equals(btnHomNay.getText()) && listShowTime.get(i).getIdPhim() == p.getIdPhim()) {
                for(int j = 0; j < listSC.size(); j++) {
                    if(listSC.get(j).getIdSuatChieu() == listShowTime.get(i).getIdSuatChieu()) {
                        listSuatChieu.add(listShowTime.get(i));
                    }
                }
            }
        }
        GridLayout gridLayout = new GridLayout(1, 15, 10, 10);
        showTimePanel.setLayout(gridLayout);
        for(int i = 0; i < listSuatChieu.size(); i++) {
            int j = i;
            JButton btnSuatChieu = new JButton();
            btnSuatChieu.setText(listSC.get(listSuatChieu.get(i).getIdSuatChieu()).getSuatChieu().toString());
            btnSuatChieu.setSize(80, 40);
            btnSuatChieu.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    formChooseSeat = new Form_ChooseSeat(listSuatChieu.get(j).getIdPhong(), listSuatChieu.get(j), p);
                }
            });
            showTimePanel.add(btnSuatChieu);    
        }
        showTimePanel.revalidate();
    }//GEN-LAST:event_btnHomNayActionPerformed

    private void btnNgayMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgayMaiActionPerformed
        ArrayList<Time> listSuatChieu = new ArrayList<>();
        for(int i = 0; i < listShowTime.size(); i++) {
            if(listShowTime.get(i).getNgayChieu().toString().equals(btnNgayMai.getText()) && listShowTime.get(i).getIdPhim() == p.getIdPhim()) {
                for(int j = 0; j < listSC.size(); j++) {
                    if(listSC.get(j).getIdSuatChieu() == listShowTime.get(i).getIdSuatChieu()) {
                        listSuatChieu.add(listSC.get(listShowTime.get(i).getIdSuatChieu()).getSuatChieu());
                    }
                }
            }
        }
        GridLayout gridLayout = new GridLayout(1, 15, 10, 10);
        showTimePanel.setLayout(gridLayout);
        for(int i = 0; i < listSuatChieu.size(); i++) {
            JButton btnSuatChieu = new JButton();
            btnSuatChieu.setText(listSuatChieu.get(i).toString());
            btnSuatChieu.setSize(80, 40);
            showTimePanel.add(btnSuatChieu);    
        }
        showTimePanel.revalidate();
    }//GEN-LAST:event_btnNgayMaiActionPerformed

    private void btnNgayKiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgayKiaActionPerformed
        ArrayList<Time> listSuatChieu = new ArrayList<>();
        for(int i = 0; i < listShowTime.size(); i++) {
            if(listShowTime.get(i).getNgayChieu().toString().equals(btnNgayKia.getText()) && listShowTime.get(i).getIdPhim() == p.getIdPhim()) {
                for(int j = 0; j < listSC.size(); j++) {
                    if(listSC.get(j).getIdSuatChieu() == listShowTime.get(i).getIdSuatChieu()) {
                        listSuatChieu.add(listSC.get(listShowTime.get(i).getIdSuatChieu()).getSuatChieu());
                    }
                }
            }
        }
        GridLayout gridLayout = new GridLayout(1, 15, 10, 10);
        showTimePanel.setLayout(gridLayout);
        for(int i = 0; i < listSuatChieu.size(); i++) {
            JButton btnSuatChieu = new JButton();
            btnSuatChieu.setText(listSuatChieu.get(i).toString());
            btnSuatChieu.setSize(80, 40);
            showTimePanel.add(btnSuatChieu);    
        }
        showTimePanel.revalidate();    }//GEN-LAST:event_btnNgayKiaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.MyButton btnHomNay;
    private com.raven.swing.MyButton btnNgayKia;
    private com.raven.swing.MyButton btnNgayMai;
    private javax.swing.JButton btnTrailer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private com.raven.swing.MyButton myButton1;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.component.ImagePanel poster;
    private javax.swing.JPanel showTimePanel;
    private javax.swing.JLabel textDaoDien;
    private javax.swing.JLabel textDoTuoiChoPhep;
    private javax.swing.JLabel textKhoiChieu;
    private javax.swing.JLabel textNoiDungPhim;
    private javax.swing.JLabel textTenPhim2;
    private javax.swing.JLabel textTheLoai;
    // End of variables declaration//GEN-END:variables
}
