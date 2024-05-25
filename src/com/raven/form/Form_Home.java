package com.raven.form;

import com.raven.dao.PhimDAO;
import com.raven.models.Phim;
import java.awt.Color;
import java.util.ArrayList;


public class Form_Home extends javax.swing.JPanel {
    private ArrayList<Phim> listPhim = null;
    
    public Form_Home() {
        initComponents();
        Color color = new Color((Color.decode("#DAE2F8").getRed() + Color.decode("#D6A4A4").getRed()) / 2, 
        (Color.decode("#DAE2F8").getGreen() + Color.decode("#D6A4A4").getGreen()) / 2, 
        (Color.decode("#DAE2F8").getBlue() + Color.decode("#D6A4A4").getBlue()) / 2);
        this.setBackground(color);
        jPanel1.setBackground(color);
        setBanner();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        posterPanel2 = new com.raven.component.PosterPanel();
        posterPanel3 = new com.raven.component.PosterPanel();
        posterPanel1 = new com.raven.component.PosterPanel();

        setBackground(new java.awt.Color(229, 229, 229));
        setForeground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(965, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Phim nổi bật");

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 10, 0));
        jPanel1.add(posterPanel2);
        jPanel1.add(posterPanel3);
        jPanel1.add(posterPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setBanner(){
        listPhim = PhimDAO.getInstance().selectAll();
        posterPanel1.setData(listPhim.get(listPhim.size()-1).getPoster());
        posterPanel2.setData(listPhim.get(listPhim.size()-2).getPoster());
        posterPanel3.setData(listPhim.get(listPhim.size()-3).getPoster());        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.raven.component.PosterPanel posterPanel1;
    private com.raven.component.PosterPanel posterPanel2;
    private com.raven.component.PosterPanel posterPanel3;
    // End of variables declaration//GEN-END:variables
}
