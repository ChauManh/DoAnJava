
package com.raven.form;

import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Form_Revenue extends javax.swing.JPanel {

    public Form_Revenue() {
        initComponents();
       
        Color color = new Color((Color.decode("#DAE2F8").getRed() + Color.decode("#D6A4A4").getRed()) / 2, 
        (Color.decode("#DAE2F8").getGreen() + Color.decode("#D6A4A4").getGreen()) / 2, 
        (Color.decode("#DAE2F8").getBlue() + Color.decode("#D6A4A4").getBlue()) / 2);
        this.setBackground(color);
        jPanel1.setBackground(color);
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/movie.png")), "Doanh thu phim", "$200000", "10/05/2024"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/combo.png")), "Doanh thu Combo", "$15000", "10/05/2024"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/total.png")), "Tổng doanh thu", "$300000", "10/05/2024"));
        
        table.addRow(new Object[]{"01/05/2024", "145.000.000", "55.000.000", "200.000.000"});
        table.addRow(new Object[]{"02/05/2024", "160.000.000", "60.000.000", "220.000.000"});
        table.addRow(new Object[]{"03/05/2024", "170.000.000", "65.000.000", "235.000.000"});
        table.addRow(new Object[]{"04/05/2024", "180.000.000", "70.000.000", "250.000.000"});
        table.addRow(new Object[]{"05/05/2024", "190.000.000", "75.000.000", "265.000.000"});
        table.addRow(new Object[]{"06/05/2024", "200.000.000", "80.000.000", "280.000.000"});
        table.addRow(new Object[]{"07/05/2024", "210.000.000", "85.000.000", "295.000.000"});
        table.addRow(new Object[]{"08/05/2024", "220.000.000", "90.000.000", "310.000.000"});
        table.addRow(new Object[]{"09/05/2024", "230.000.000", "95.000.000", "325.000.000"});
        table.addRow(new Object[]{"10/05/2024", "240.000.000", "100.000.000", "340.000.000"});

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        jPanel1.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        jPanel1.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        jPanel1.add(card3);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày", "Doanh thu phim", "Doanh thu Combo", "Tổng doanh thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        jLabel1.setBackground(new java.awt.Color(127, 127, 127));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Bảng doanh thu hàng ngày");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spTable)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
