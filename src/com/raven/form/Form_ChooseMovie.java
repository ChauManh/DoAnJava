
package com.raven.form;

import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Form_ChooseMovie extends javax.swing.JFrame {


    public Form_ChooseMovie(String name, String price) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        
        nameMovie.setText(name);
        textPrice.setText(price.replace(".", ""));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameMovie = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        buttonGhe4 = new com.raven.swing.ButtonGhe();
        buttonGhe5 = new com.raven.swing.ButtonGhe();
        buttonGhe6 = new com.raven.swing.ButtonGhe();
        buttonGhe7 = new com.raven.swing.ButtonGhe();
        buttonGhe8 = new com.raven.swing.ButtonGhe();
        buttonGhe9 = new com.raven.swing.ButtonGhe();
        buttonGhe10 = new com.raven.swing.ButtonGhe();
        buttonGhe12 = new com.raven.swing.ButtonGhe();
        buttonGhe13 = new com.raven.swing.ButtonGhe();
        buttonGhe11 = new com.raven.swing.ButtonGhe();
        buttonGhe14 = new com.raven.swing.ButtonGhe();
        buttonGhe15 = new com.raven.swing.ButtonGhe();
        buttonGhe16 = new com.raven.swing.ButtonGhe();
        buttonGhe17 = new com.raven.swing.ButtonGhe();
        buttonGhe18 = new com.raven.swing.ButtonGhe();
        buttonGhe19 = new com.raven.swing.ButtonGhe();
        buttonGhe20 = new com.raven.swing.ButtonGhe();
        buttonGhe21 = new com.raven.swing.ButtonGhe();
        buttonGhe22 = new com.raven.swing.ButtonGhe();
        buttonGhe23 = new com.raven.swing.ButtonGhe();
        buttonGhe24 = new com.raven.swing.ButtonGhe();
        buttonGhe25 = new com.raven.swing.ButtonGhe();
        buttonGhe26 = new com.raven.swing.ButtonGhe();
        buttonGhe27 = new com.raven.swing.ButtonGhe();
        buttonGhe28 = new com.raven.swing.ButtonGhe();
        buttonGhe29 = new com.raven.swing.ButtonGhe();
        buttonGhe30 = new com.raven.swing.ButtonGhe();
        buttonGhe31 = new com.raven.swing.ButtonGhe();
        buttonGhe32 = new com.raven.swing.ButtonGhe();
        buttonGhe33 = new com.raven.swing.ButtonGhe();
        buttonGhe34 = new com.raven.swing.ButtonGhe();
        buttonGhe35 = new com.raven.swing.ButtonGhe();
        buttonGhe36 = new com.raven.swing.ButtonGhe();
        buttonGhe37 = new com.raven.swing.ButtonGhe();
        buttonGhe38 = new com.raven.swing.ButtonGhe();
        buttonGhe39 = new com.raven.swing.ButtonGhe();
        buttonGhe40 = new com.raven.swing.ButtonGhe();
        buttonGhe41 = new com.raven.swing.ButtonGhe();
        buttonGhe42 = new com.raven.swing.ButtonGhe();
        buttonGhe43 = new com.raven.swing.ButtonGhe();
        buttonGhe44 = new com.raven.swing.ButtonGhe();
        buttonGhe45 = new com.raven.swing.ButtonGhe();
        buttonGhe46 = new com.raven.swing.ButtonGhe();
        buttonGhe47 = new com.raven.swing.ButtonGhe();
        buttonGhe48 = new com.raven.swing.ButtonGhe();
        buttonGhe49 = new com.raven.swing.ButtonGhe();
        buttonGhe50 = new com.raven.swing.ButtonGhe();
        buttonGhe51 = new com.raven.swing.ButtonGhe();
        buttonGhe52 = new com.raven.swing.ButtonGhe();
        buttonGhe53 = new com.raven.swing.ButtonGhe();
        buttonGhe54 = new com.raven.swing.ButtonGhe();
        buttonGhe55 = new com.raven.swing.ButtonGhe();
        buttonGhe56 = new com.raven.swing.ButtonGhe();
        buttonGhe57 = new com.raven.swing.ButtonGhe();
        buttonGhe58 = new com.raven.swing.ButtonGhe();
        buttonGhe59 = new com.raven.swing.ButtonGhe();
        buttonGhe60 = new com.raven.swing.ButtonGhe();
        buttonGhe61 = new com.raven.swing.ButtonGhe();
        buttonGhe62 = new com.raven.swing.ButtonGhe();
        buttonGhe63 = new com.raven.swing.ButtonGhe();
        buttonGhe64 = new com.raven.swing.ButtonGhe();
        buttonGhe65 = new com.raven.swing.ButtonGhe();
        buttonGhe66 = new com.raven.swing.ButtonGhe();
        buttonGhe67 = new com.raven.swing.ButtonGhe();
        buttonGhe68 = new com.raven.swing.ButtonGhe();
        buttonGhe69 = new com.raven.swing.ButtonGhe();
        buttonGhe70 = new com.raven.swing.ButtonGhe();
        buttonGhe71 = new com.raven.swing.ButtonGhe();
        buttonGhe72 = new com.raven.swing.ButtonGhe();
        buttonGhe73 = new com.raven.swing.ButtonGhe();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.Table();
        jLabel11 = new javax.swing.JLabel();
        textTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textPrice = new javax.swing.JLabel();
        cmdDone = new com.raven.swing.MyButton();
        cmdCancel = new com.raven.swing.MyButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(178, 178, 178), 2));

        jLabel1.setBackground(new java.awt.Color(127, 127, 127));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Đặt vé");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tên phim:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ghi chú màu ghế:");

        nameMovie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("MÀN HÌNH");

        buttonGhe4.setText("A01");
        buttonGhe4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe5.setText("A02");
        buttonGhe5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe6.setText("A03");
        buttonGhe6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe7.setText("A04");
        buttonGhe7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe8.setText("A05");
        buttonGhe8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe9.setText("A06");
        buttonGhe9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe10.setText("A07");
        buttonGhe10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe12.setText("A09");
        buttonGhe12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe13.setText("A10");
        buttonGhe13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe11.setText("B01");
        buttonGhe11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe11ActionPerformed(evt);
            }
        });

        buttonGhe14.setText("B02");
        buttonGhe14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe15.setText("B03");
        buttonGhe15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe16.setText("B05");
        buttonGhe16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe17.setText("B04");
        buttonGhe17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe18.setText("B06");
        buttonGhe18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe19.setText("B07");
        buttonGhe19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe20.setText("B09");
        buttonGhe20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe21.setText("B10");
        buttonGhe21.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe22.setText("C01");
        buttonGhe22.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe22ActionPerformed(evt);
            }
        });

        buttonGhe23.setText("C02");
        buttonGhe23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe23ActionPerformed(evt);
            }
        });

        buttonGhe24.setText("C04");
        buttonGhe24.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe24ActionPerformed(evt);
            }
        });

        buttonGhe25.setText("C03");
        buttonGhe25.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe25ActionPerformed(evt);
            }
        });

        buttonGhe26.setText("C06");
        buttonGhe26.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe26ActionPerformed(evt);
            }
        });

        buttonGhe27.setText("C07");
        buttonGhe27.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe27ActionPerformed(evt);
            }
        });

        buttonGhe28.setText("C05");
        buttonGhe28.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe28ActionPerformed(evt);
            }
        });

        buttonGhe29.setText("C10");
        buttonGhe29.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe29ActionPerformed(evt);
            }
        });

        buttonGhe30.setText("C09");
        buttonGhe30.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe30ActionPerformed(evt);
            }
        });

        buttonGhe31.setText("D01");
        buttonGhe31.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe31ActionPerformed(evt);
            }
        });

        buttonGhe32.setText("F01");
        buttonGhe32.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe32ActionPerformed(evt);
            }
        });

        buttonGhe33.setText("E01");
        buttonGhe33.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe33ActionPerformed(evt);
            }
        });

        buttonGhe34.setText("A08");
        buttonGhe34.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe35.setText("B08");
        buttonGhe35.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe36.setText("C08");
        buttonGhe36.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        buttonGhe37.setText("G01");
        buttonGhe37.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe37ActionPerformed(evt);
            }
        });

        buttonGhe38.setText("D02");
        buttonGhe38.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe38ActionPerformed(evt);
            }
        });

        buttonGhe39.setText("D03");
        buttonGhe39.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe39ActionPerformed(evt);
            }
        });

        buttonGhe40.setText("D04");
        buttonGhe40.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe40ActionPerformed(evt);
            }
        });

        buttonGhe41.setText("D06");
        buttonGhe41.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe41ActionPerformed(evt);
            }
        });

        buttonGhe42.setText("D05");
        buttonGhe42.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe42ActionPerformed(evt);
            }
        });

        buttonGhe43.setText("D07");
        buttonGhe43.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe43ActionPerformed(evt);
            }
        });

        buttonGhe44.setText("D09");
        buttonGhe44.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe44ActionPerformed(evt);
            }
        });

        buttonGhe45.setText("D10");
        buttonGhe45.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe45ActionPerformed(evt);
            }
        });

        buttonGhe46.setText("D08");
        buttonGhe46.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe46ActionPerformed(evt);
            }
        });

        buttonGhe47.setText("F02");
        buttonGhe47.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe47ActionPerformed(evt);
            }
        });

        buttonGhe48.setText("G02");
        buttonGhe48.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe48ActionPerformed(evt);
            }
        });

        buttonGhe49.setText("E02");
        buttonGhe49.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe49ActionPerformed(evt);
            }
        });

        buttonGhe50.setText("E03");
        buttonGhe50.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe50ActionPerformed(evt);
            }
        });

        buttonGhe51.setText("E05");
        buttonGhe51.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe51ActionPerformed(evt);
            }
        });

        buttonGhe52.setText("E04");
        buttonGhe52.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe52ActionPerformed(evt);
            }
        });

        buttonGhe53.setText("E06");
        buttonGhe53.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe53ActionPerformed(evt);
            }
        });

        buttonGhe54.setText("E07");
        buttonGhe54.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe54ActionPerformed(evt);
            }
        });

        buttonGhe55.setText("E08");
        buttonGhe55.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe55ActionPerformed(evt);
            }
        });

        buttonGhe56.setText("E09");
        buttonGhe56.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe56ActionPerformed(evt);
            }
        });

        buttonGhe57.setText("E10");
        buttonGhe57.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe57ActionPerformed(evt);
            }
        });

        buttonGhe58.setText("F03");
        buttonGhe58.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe58ActionPerformed(evt);
            }
        });

        buttonGhe59.setText("F05");
        buttonGhe59.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe59ActionPerformed(evt);
            }
        });

        buttonGhe60.setText("F06");
        buttonGhe60.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe60ActionPerformed(evt);
            }
        });

        buttonGhe61.setText("F04");
        buttonGhe61.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe61ActionPerformed(evt);
            }
        });

        buttonGhe62.setText("F08");
        buttonGhe62.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe62ActionPerformed(evt);
            }
        });

        buttonGhe63.setText("F07");
        buttonGhe63.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe63ActionPerformed(evt);
            }
        });

        buttonGhe64.setText("F09");
        buttonGhe64.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe64ActionPerformed(evt);
            }
        });

        buttonGhe65.setText("F10");
        buttonGhe65.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe65ActionPerformed(evt);
            }
        });

        buttonGhe66.setText("G03");
        buttonGhe66.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe66ActionPerformed(evt);
            }
        });

        buttonGhe67.setText("G05");
        buttonGhe67.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe67ActionPerformed(evt);
            }
        });

        buttonGhe68.setText("G04");
        buttonGhe68.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe68ActionPerformed(evt);
            }
        });

        buttonGhe69.setText("G06");
        buttonGhe69.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe69ActionPerformed(evt);
            }
        });

        buttonGhe70.setText("G07");
        buttonGhe70.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe70ActionPerformed(evt);
            }
        });

        buttonGhe71.setText("G08");
        buttonGhe71.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe71ActionPerformed(evt);
            }
        });

        buttonGhe72.setText("G09");
        buttonGhe72.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe72ActionPerformed(evt);
            }
        });

        buttonGhe73.setText("G10");
        buttonGhe73.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonGhe73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhe73ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonGhe31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonGhe38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(buttonGhe15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonGhe25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonGhe39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonGhe50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonGhe58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonGhe66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonGhe24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonGhe28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonGhe17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonGhe16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonGhe40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonGhe42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonGhe52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonGhe51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonGhe61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonGhe59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonGhe68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonGhe67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGhe22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGhe37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGhe33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGhe32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGhe9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(buttonGhe34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGhe18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonGhe35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonGhe20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonGhe71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonGhe62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonGhe55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonGhe46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buttonGhe26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGhe27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonGhe36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonGhe30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonGhe44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonGhe56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonGhe64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonGhe72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonGhe13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonGhe21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonGhe29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(buttonGhe45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonGhe57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(buttonGhe65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonGhe73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGhe4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGhe11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGhe22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGhe31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGhe33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGhe32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGhe37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGhe73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Đỏ: Còn");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Xàm: Đã bán");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Cam: Đang chọn");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Giá vé:");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Số ghế", "Giá vé"
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Tổng tiền:");

        textTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textTotal.setText("0");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ngày chiếu:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Suất chiếu:");

        textPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(410, 410, 410))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(nameMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(112, 112, 112)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nameMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cmdDone.setText("Hoàn thành");
        cmdDone.setRadius(50);
        cmdDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDoneActionPerformed(evt);
            }
        });

        cmdCancel.setText("Hủy");
        cmdCancel.setBorderColor(new java.awt.Color(219, 32, 32));
        cmdCancel.setColorClick(new java.awt.Color(245, 97, 97));
        cmdCancel.setColorOver(new java.awt.Color(225, 191, 191));
        cmdCancel.setRadius(50);
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(cmdDone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(cmdDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
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

    
    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cmdCancelActionPerformed

    private void cmdDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDoneActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_cmdDoneActionPerformed

    private void buttonGhe11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe11ActionPerformed

    private void buttonGhe22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe22ActionPerformed

    private void buttonGhe23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe23ActionPerformed

    private void buttonGhe24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe24ActionPerformed

    private void buttonGhe25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe25ActionPerformed

    private void buttonGhe26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe26ActionPerformed

    private void buttonGhe27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe27ActionPerformed

    private void buttonGhe28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe28ActionPerformed

    private void buttonGhe29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe29ActionPerformed

    private void buttonGhe30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe30ActionPerformed

    private void buttonGhe31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe31ActionPerformed

    private void buttonGhe32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe32ActionPerformed

    private void buttonGhe33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe33ActionPerformed

    private void buttonGhe37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe37ActionPerformed

    private void buttonGhe38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe38ActionPerformed

    private void buttonGhe39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe39ActionPerformed

    private void buttonGhe40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe40ActionPerformed

    private void buttonGhe41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe41ActionPerformed

    private void buttonGhe42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe42ActionPerformed

    private void buttonGhe43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe43ActionPerformed

    private void buttonGhe44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe44ActionPerformed

    private void buttonGhe45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe45ActionPerformed

    private void buttonGhe46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe46ActionPerformed

    private void buttonGhe47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe47ActionPerformed

    private void buttonGhe48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe48ActionPerformed

    private void buttonGhe49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe49ActionPerformed

    private void buttonGhe50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe50ActionPerformed

    private void buttonGhe51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe51ActionPerformed

    private void buttonGhe52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe52ActionPerformed

    private void buttonGhe53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe53ActionPerformed

    private void buttonGhe54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe54ActionPerformed

    private void buttonGhe55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe55ActionPerformed

    private void buttonGhe56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe56ActionPerformed

    private void buttonGhe57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe57ActionPerformed

    private void buttonGhe58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe58ActionPerformed

    private void buttonGhe59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe59ActionPerformed

    private void buttonGhe60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe60ActionPerformed

    private void buttonGhe61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe61ActionPerformed

    private void buttonGhe62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe62ActionPerformed

    private void buttonGhe63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe63ActionPerformed

    private void buttonGhe64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe64ActionPerformed

    private void buttonGhe65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe65ActionPerformed

    private void buttonGhe66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe66ActionPerformed

    private void buttonGhe67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe67ActionPerformed

    private void buttonGhe68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe68ActionPerformed

    private void buttonGhe69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe69ActionPerformed

    private void buttonGhe70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe70ActionPerformed

    private void buttonGhe71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe71ActionPerformed

    private void buttonGhe72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe72ActionPerformed

    private void buttonGhe73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhe73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGhe73ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.ButtonGhe buttonGhe10;
    private com.raven.swing.ButtonGhe buttonGhe11;
    private com.raven.swing.ButtonGhe buttonGhe12;
    private com.raven.swing.ButtonGhe buttonGhe13;
    private com.raven.swing.ButtonGhe buttonGhe14;
    private com.raven.swing.ButtonGhe buttonGhe15;
    private com.raven.swing.ButtonGhe buttonGhe16;
    private com.raven.swing.ButtonGhe buttonGhe17;
    private com.raven.swing.ButtonGhe buttonGhe18;
    private com.raven.swing.ButtonGhe buttonGhe19;
    private com.raven.swing.ButtonGhe buttonGhe20;
    private com.raven.swing.ButtonGhe buttonGhe21;
    private com.raven.swing.ButtonGhe buttonGhe22;
    private com.raven.swing.ButtonGhe buttonGhe23;
    private com.raven.swing.ButtonGhe buttonGhe24;
    private com.raven.swing.ButtonGhe buttonGhe25;
    private com.raven.swing.ButtonGhe buttonGhe26;
    private com.raven.swing.ButtonGhe buttonGhe27;
    private com.raven.swing.ButtonGhe buttonGhe28;
    private com.raven.swing.ButtonGhe buttonGhe29;
    private com.raven.swing.ButtonGhe buttonGhe30;
    private com.raven.swing.ButtonGhe buttonGhe31;
    private com.raven.swing.ButtonGhe buttonGhe32;
    private com.raven.swing.ButtonGhe buttonGhe33;
    private com.raven.swing.ButtonGhe buttonGhe34;
    private com.raven.swing.ButtonGhe buttonGhe35;
    private com.raven.swing.ButtonGhe buttonGhe36;
    private com.raven.swing.ButtonGhe buttonGhe37;
    private com.raven.swing.ButtonGhe buttonGhe38;
    private com.raven.swing.ButtonGhe buttonGhe39;
    private com.raven.swing.ButtonGhe buttonGhe4;
    private com.raven.swing.ButtonGhe buttonGhe40;
    private com.raven.swing.ButtonGhe buttonGhe41;
    private com.raven.swing.ButtonGhe buttonGhe42;
    private com.raven.swing.ButtonGhe buttonGhe43;
    private com.raven.swing.ButtonGhe buttonGhe44;
    private com.raven.swing.ButtonGhe buttonGhe45;
    private com.raven.swing.ButtonGhe buttonGhe46;
    private com.raven.swing.ButtonGhe buttonGhe47;
    private com.raven.swing.ButtonGhe buttonGhe48;
    private com.raven.swing.ButtonGhe buttonGhe49;
    private com.raven.swing.ButtonGhe buttonGhe5;
    private com.raven.swing.ButtonGhe buttonGhe50;
    private com.raven.swing.ButtonGhe buttonGhe51;
    private com.raven.swing.ButtonGhe buttonGhe52;
    private com.raven.swing.ButtonGhe buttonGhe53;
    private com.raven.swing.ButtonGhe buttonGhe54;
    private com.raven.swing.ButtonGhe buttonGhe55;
    private com.raven.swing.ButtonGhe buttonGhe56;
    private com.raven.swing.ButtonGhe buttonGhe57;
    private com.raven.swing.ButtonGhe buttonGhe58;
    private com.raven.swing.ButtonGhe buttonGhe59;
    private com.raven.swing.ButtonGhe buttonGhe6;
    private com.raven.swing.ButtonGhe buttonGhe60;
    private com.raven.swing.ButtonGhe buttonGhe61;
    private com.raven.swing.ButtonGhe buttonGhe62;
    private com.raven.swing.ButtonGhe buttonGhe63;
    private com.raven.swing.ButtonGhe buttonGhe64;
    private com.raven.swing.ButtonGhe buttonGhe65;
    private com.raven.swing.ButtonGhe buttonGhe66;
    private com.raven.swing.ButtonGhe buttonGhe67;
    private com.raven.swing.ButtonGhe buttonGhe68;
    private com.raven.swing.ButtonGhe buttonGhe69;
    private com.raven.swing.ButtonGhe buttonGhe7;
    private com.raven.swing.ButtonGhe buttonGhe70;
    private com.raven.swing.ButtonGhe buttonGhe71;
    private com.raven.swing.ButtonGhe buttonGhe72;
    private com.raven.swing.ButtonGhe buttonGhe73;
    private com.raven.swing.ButtonGhe buttonGhe8;
    private com.raven.swing.ButtonGhe buttonGhe9;
    private com.raven.swing.MyButton cmdCancel;
    private com.raven.swing.MyButton cmdDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel nameMovie;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table1;
    public javax.swing.JLabel textPrice;
    public javax.swing.JLabel textTotal;
    // End of variables declaration//GEN-END:variables
}
