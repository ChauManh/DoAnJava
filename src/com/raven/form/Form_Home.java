
package com.raven.form;

import com.raven.model.Model_Banner;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        Color color = new Color((Color.decode("#DAE2F8").getRed() + Color.decode("#D6A4A4").getRed()) / 2, 
        (Color.decode("#DAE2F8").getGreen() + Color.decode("#D6A4A4").getGreen()) / 2, 
        (Color.decode("#DAE2F8").getBlue() + Color.decode("#D6A4A4").getBlue()) / 2);
        this.setBackground(color);
        jPanel1.setBackground(color);
        banner3.setData(new Model_Banner(new ImageIcon(getClass().getResource("/com/raven/img/poster_latmat.png")), "Lật mặt 7: Một Điều Ước", "9.7/10 (14.4K đánh giá)", "Gia đình, Tỉnh cảm, Hài"));
        banner1.setData(new Model_Banner(new ImageIcon(getClass().getResource("/com/raven/img/poster_vayham.png")), "Vây hãm: Kẻ trừng phạt", "9.7/10 (1.8K đánh giá)", "Hình sự, Chính kịch, Hành động"));
        banner2.setData(new Model_Banner(new ImageIcon(getClass().getResource("/com/raven/img/poster_tarot.png")), "Tarot", "7.4/10 (138 đánh giá)", "Kinh dị, Gay cấn"));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        banner2 = new com.raven.component.Banner();
        banner3 = new com.raven.component.Banner();
        banner1 = new com.raven.component.Banner();

        setBackground(new java.awt.Color(229, 229, 229));
        setForeground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(965, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Phim nổi bật");

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 10, 0));
        jPanel1.add(banner2);
        jPanel1.add(banner3);
        jPanel1.add(banner1);

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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Banner banner1;
    private com.raven.component.Banner banner2;
    private com.raven.component.Banner banner3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
