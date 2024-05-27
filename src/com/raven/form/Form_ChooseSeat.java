/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.form;
import com.raven.dao.GheDAO;
import com.raven.dao.NgayChieuSuatChieuGhePhongDAO;
import com.raven.dao.PhongDAO;
import com.raven.dao.SuatChieuDAO;
import com.raven.models.Ghe;
import com.raven.models.NgayChieuSuatChieuGhePhong;
import com.raven.models.NgayChieuSuatChieuPhimPhong;
import com.raven.models.Phim;
import com.raven.models.Phong;
import com.raven.models.SuatChieu;
import com.raven.swing.ButtonGhe;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DANG GIA BAO
 */
public class Form_ChooseSeat extends javax.swing.JFrame {
    private Phong phong;
    private NgayChieuSuatChieuPhimPhong ncscpp;
    private ArrayList<NgayChieuSuatChieuGhePhong> listNgayChieuSuatChieu;
    private ArrayList<Ghe> listGhe;
    private ArrayList<SuatChieu> listSC = SuatChieuDAO.getInstance().selectAll();
    public Form_ChooseSeat(String idPhong, NgayChieuSuatChieuPhimPhong ncscpp, Phim p) {
        initComponents();
        this.phong = new Phong(idPhong, 0, null);
        this.phong = PhongDAO.getInstance().selectById(this.phong);
        this.ncscpp = ncscpp;
        textNgayChieu.setText(ncscpp.getNgayChieu().toString());
        textSuatChieu.setText(listSC.get(ncscpp.getIdSuatChieu()).getSuatChieu().toString());
        textTenPhim.setText(p.getTenPhim());
        textPhongChieu.setText(phong.getIdPhong());
        listNgayChieuSuatChieu = NgayChieuSuatChieuGhePhongDAO.getInstance().selectByCondition("id_ngaychieu_suatchieu = " + ncscpp.getIdNgayChieuSuatChieu());
        listGhe = GheDAO.getInstance().selectByCondition(idPhong);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        if(phong.getSoGhe() == 140) {
            listGhe = GheDAO.getInstance().selectByCondition(idPhong);
            GridLayout gridLayout = new GridLayout(14,10,15,15);
            ghe.setLayout(gridLayout);
            for(int i = 0; i < 140; i++) {
                if(listNgayChieuSuatChieu.get(i).getIdGhe()==i && listNgayChieuSuatChieu.get(i).getTinhTrang()==1) {
                    ButtonGhe btnGhe = new ButtonGhe(listGhe.get(i));
                    btnGhe.setText();
                    btnGhe.setPreferredSize(new Dimension(50, 50));
                    btnGhe.setBackground(Color.DARK_GRAY);
                    ghe.add(btnGhe);
                } else {
                    ButtonGhe btnGhe = new ButtonGhe(listGhe.get(i));
                    btnGhe.setText();
                    btnGhe.setPreferredSize(new Dimension(50, 50));
                    btnGhe.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
    //                        if (btnGhe.isClicked() == false) { 
    //                        btnGhe.setBackground(btnGhe.getColorClick());
    //                        btnGhe.setClicked(true);
    //                        insertRow(btnGhe.getGhe());
    //                }
    //                        else {
    //                            btnGhe.setBackground(new Color(220, 50, 55));
    //                            btnGhe.setClicked(false); 
    //                        }
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            if (btnGhe.isClicked() == false) { 
                            btnGhe.setBackground(btnGhe.getColorClick());
                            btnGhe.setClicked(true);
                            insertRow(btnGhe.getGhe());

                    }
                            else {
                                btnGhe.setBackground(new Color(220, 50, 55));
                                btnGhe.setClicked(false); 
                                deleteRow(btnGhe.getGhe());
                            }
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                            btnGhe.setBackground(btnGhe.getColorOver());
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                            if (btnGhe.isClicked() == false)
                            btnGhe.setBackground(btnGhe.getColor());
                            else btnGhe.setBackground(btnGhe.getColorClick());
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {

                        }
                    });
                    ghe.add(btnGhe);
                }
            }
        } else if(phong.getSoGhe() == 120) {
            listGhe = GheDAO.getInstance().selectByCondition(idPhong);
            GridLayout gridLayout = new GridLayout(120, 10, 15, 15);
            ghe.setLayout(gridLayout);
            for(int i = 0; i < 120; i++) {
                ButtonGhe btnGhe = new ButtonGhe(listGhe.get(i));
                btnGhe.setText();
                btnGhe.setPreferredSize(new Dimension(50, 50));
                btnGhe.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
//                        if (btnGhe.isClicked() == false) { 
//                        btnGhe.setBackground(btnGhe.getColorClick());
//                        btnGhe.setClicked(true);
//                        insertRow(btnGhe.getGhe());
//                }
//                        else {
//                            btnGhe.setBackground(new Color(220, 50, 55));
//                            btnGhe.setClicked(false); 
//                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (btnGhe.isClicked() == false) { 
                        btnGhe.setBackground(btnGhe.getColorClick());
                        btnGhe.setClicked(true);
                        insertRow(btnGhe.getGhe());

                }
                        else {
                            btnGhe.setBackground(new Color(220, 50, 55));
                            btnGhe.setClicked(false); 
                            deleteRow(btnGhe.getGhe());
                        }
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        btnGhe.setBackground(btnGhe.getColorOver());
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        if (btnGhe.isClicked() == false)
                        btnGhe.setBackground(btnGhe.getColor());
                        else btnGhe.setBackground(btnGhe.getColorClick());
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        
                    }
                });
                ghe.add(btnGhe);
            }
        } else if(phong.getSoGhe() == 160) {
            listGhe = GheDAO.getInstance().selectByCondition(idPhong);
            GridLayout gridLayout = new GridLayout(120, 10, 15, 15);
            ghe.setLayout(gridLayout);
            for(int i = 0; i < 120; i++) {
                ButtonGhe btnGhe = new ButtonGhe(listGhe.get(i));
                btnGhe.setText();
                btnGhe.setPreferredSize(new Dimension(50, 50));
                btnGhe.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
//                        if (btnGhe.isClicked() == false) { 
//                        btnGhe.setBackground(btnGhe.getColorClick());
//                        btnGhe.setClicked(true);
//                        insertRow(btnGhe.getGhe());
//                }
//                        else {
//                            btnGhe.setBackground(new Color(220, 50, 55));
//                            btnGhe.setClicked(false); 
//                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (btnGhe.isClicked() == false) { 
                        btnGhe.setBackground(btnGhe.getColorClick());
                        btnGhe.setClicked(true);
                        insertRow(btnGhe.getGhe());

                }
                        else {
                            btnGhe.setBackground(new Color(220, 50, 55));
                            btnGhe.setClicked(false); 
                            deleteRow(btnGhe.getGhe());
                        }
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        btnGhe.setBackground(btnGhe.getColorOver());
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        if (btnGhe.isClicked() == false)
                        btnGhe.setBackground(btnGhe.getColor());
                        else btnGhe.setBackground(btnGhe.getColorClick());
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        
                    }
                });
                ghe.add(btnGhe);
            }
        }
    }
    public void insertRow(Ghe g) {
        table1.addRow(new Object[]{g.getIdGhe(), g.getLoaiGhe(), g.getGia()});
    }
    public void deleteRow(Ghe g) {
        int rowCount = table1.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--) {
            Object cellValue = table1.getValueAt(i, 0);
            if(cellValue != null && cellValue == (""+g.getIdGhe())){
                DefaultTableModel tblModel = (DefaultTableModel) table1.getModel();
                tblModel.removeRow(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textTenPhim = new javax.swing.JLabel();
        textPhongChieu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textSuatChieu = new javax.swing.JLabel();
        textNgayChieu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnXacNhan = new com.raven.swing.MyButton();
        btnHuy = new com.raven.swing.MyButton();
        jPanel6 = new javax.swing.JPanel();
        spTable = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.Table();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ghe = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tên phim:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Phòng chiếu:");

        textTenPhim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textTenPhim.setText("a");

        textPhongChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textPhongChieu.setText("a");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Suất chiếu:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ngày chiếu:");

        textSuatChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textSuatChieu.setText("a");

        textNgayChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNgayChieu.setText("a");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPhongChieu, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addGap(228, 228, 228)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSuatChieu, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addGap(413, 413, 413))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNgayChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(394, 394, 394))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textSuatChieu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(textTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textPhongChieu)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textNgayChieu)
                        .addComponent(jLabel4)))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setRadius(50);
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.setBorderColor(new java.awt.Color(219, 32, 32));
        btnHuy.setColorClick(new java.awt.Color(245, 97, 97));
        btnHuy.setColorOver(new java.awt.Color(225, 191, 191));
        btnHuy.setRadius(50);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(273, 273, 273)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 552));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số ghế", "Loại ghế", "Giá ghế"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table1);

        jLabel11.setBackground(new java.awt.Color(220, 50, 55));
        jLabel11.setForeground(new java.awt.Color(220, 50, 55));
        jLabel11.setText("jLabel11");
        jLabel11.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Còn trống");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(255, 165, 0));
        jLabel7.setForeground(new java.awt.Color(255, 165, 0));
        jLabel7.setText("jLabel7");
        jLabel7.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Đang chọn");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setForeground(Color.DARK_GRAY);
        jLabel9.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Đã bán");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.LINE_END);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MÀN HÌNH");

        javax.swing.GroupLayout gheLayout = new javax.swing.GroupLayout(ghe);
        ghe.setLayout(gheLayout);
        gheLayout.setHorizontalGroup(
            gheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1013, Short.MAX_VALUE)
        );
        gheLayout.setVerticalGroup(
            gheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ghe);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel7, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        int n = table1.getRowCount();
        for(int i = 0; i < n; i++) {
            Object value = table1.getValueAt(i, 0);
            for(int j = 0; j < listNgayChieuSuatChieu.size(); j++) {
                if(value.toString().equals((listNgayChieuSuatChieu.get(j).getIdGhe())+"")) {
                    NgayChieuSuatChieuGhePhongDAO.getInstance().update(listNgayChieuSuatChieu.get(j));
                }
            }
        }
        this.dispose();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.MyButton btnHuy;
    private com.raven.swing.MyButton btnXacNhan;
    private javax.swing.JPanel ghe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table1;
    private javax.swing.JLabel textNgayChieu;
    private javax.swing.JLabel textPhongChieu;
    private javax.swing.JLabel textSuatChieu;
    private javax.swing.JLabel textTenPhim;
    // End of variables declaration//GEN-END:variables
}
