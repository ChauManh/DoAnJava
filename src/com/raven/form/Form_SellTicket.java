
package com.raven.form;

import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Form_SellTicket extends javax.swing.JPanel {


    public Form_SellTicket() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        
        Color color = new Color((Color.decode("#DAE2F8").getRed() + Color.decode("#D6A4A4").getRed()) / 2, 
        (Color.decode("#DAE2F8").getGreen() + Color.decode("#D6A4A4").getGreen()) / 2, 
        (Color.decode("#DAE2F8").getBlue() + Color.decode("#D6A4A4").getBlue()) / 2);
        this.setBackground(color);
                
        table.addRow(new Object[]{"1", "Lật mặt 7: Một Điều Ước", "16+", "26/04/2024",StatusType.Released});
        table.addRow(new Object[]{"2", "Trạng Tí Phiêu Lưu Ký", "PG", "30/04/2024", StatusType.Released});
        table.addRow(new Object[]{"3", "Bố Già", "16+", "01/05/2024", StatusType.Released});
        table.addRow(new Object[]{"4", "Thiên Thần Hộ Mệnh", "13+", "012/05/2024", StatusType.UnRelease});
        table.addRow(new Object[]{"5", "Tình Yêu Và Tham Vọng", "18+", "10/05/2024", StatusType.UnRelease});
        table.addRow(new Object[]{"6", "Vây hãm: Kẻ trừng phạt", "18+", "26/04/2024",StatusType.Released});
        table.addRow(new Object[]{"7", "Tarot", "18+", "10/05/2024", StatusType.UnRelease});
        table.addRow(new Object[]{"8", "Cái giá của hạnh phúc", "18+", "19/04/2024", StatusType.Released});
        table.addRow(new Object[]{"9", "Nắm đấm trời ban", "16+", "03/05/2024", StatusType.Released});
        table.addRow(new Object[]{"10", "Tình Yêu Và Tham Vọng", "18+", "10/05/2024", StatusType.UnRelease});
        table.addRow(new Object[]{"11", "Trạng Tí Phiêu Lưu Ký", "PG", "30/04/2024", StatusType.Released});
        table.addRow(new Object[]{"12", "Bố Già", "16+", "01/05/2024", StatusType.Released});
        table.addRow(new Object[]{"13", "Thiên Thần Hộ Mệnh", "13+", "12/05/2024", StatusType.UnRelease});
        table.addRow(new Object[]{"14", "Tình Yêu Và Tham Vọng", "18+", "10/05/2024", StatusType.UnRelease});
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        header = new com.raven.component.Header();
        buttonSearch = new com.raven.swing.Button();
        buttonBill = new com.raven.swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Danh sách phim");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Phim", "Tên phim", "Độ tuổi cho phép", "Ngày phát hành", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.setPreferredSize(new java.awt.Dimension(689, 45));

        buttonSearch.setText("Tìm kiếm");
        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSearch.setRadius(50);
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonBill.setText("Hóa đơn");
        buttonBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBill.setRadius(20);
        buttonBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        DefaultTableModel ob =(DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(header.searchText.getText()));
        if (buttonSearch.getText().equals("Tìm kiếm") && header.searchText.getText().equals(""))
        {
            buttonSearch.setText("Tìm kiếm");
        }
        else if (buttonSearch.getText().equals("Tìm kiếm"))
        {
            buttonSearch.setText("Hủy");
            header.searchText.setText("");
        }
        else if (buttonSearch.getText().equals("Hủy"))
        {
            buttonSearch.setText("Tìm kiếm");
        }
          }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBillActionPerformed
//        fBill = new Form_Bill();
//        fBill.setVisible(true);
    }//GEN-LAST:event_buttonBillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button buttonBill;
    private com.raven.swing.Button buttonSearch;
    private com.raven.component.Header header;
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
