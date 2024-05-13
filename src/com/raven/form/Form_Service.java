
package com.raven.form;

import com.raven.model.StatusType;
import com.raven.model.TableActionEvent;
import com.raven.swing.ScrollBar;
import com.raven.swing.TableActionCellEditor;
import com.raven.swing.TableActionCellRender;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Form_Service extends javax.swing.JPanel {


    public Form_Service() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        spTable2.setVerticalScrollBar(new ScrollBar());
        spTable2.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable2.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);

        Color color = new Color((Color.decode("#DAE2F8").getRed() + Color.decode("#D6A4A4").getRed()) / 2, 
        (Color.decode("#DAE2F8").getGreen() + Color.decode("#D6A4A4").getGreen()) / 2, 
        (Color.decode("#DAE2F8").getBlue() + Color.decode("#D6A4A4").getBlue()) / 2);
        this.setBackground(color);
                
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                if (tableMovie.isEditing()) {
                    tableMovie.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) tableMovie.getModel();
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
            tableMovie.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
            tableMovie.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
            tableMovie.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                setHorizontalAlignment(SwingConstants.RIGHT);
                return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            }
        });
        
        tableMovie.addRow(new Object[]{"1", "Lật mặt 7: Một Điều Ước", "16+", "26/04/2024",StatusType.Released});
        tableMovie.addRow(new Object[]{"2", "Trạng Tí Phiêu Lưu Ký", "PG", "30/04/2024", StatusType.Released});
        tableMovie.addRow(new Object[]{"3", "Bố Già", "16+", "01/05/2024", StatusType.Released});
        tableMovie.addRow(new Object[]{"4", "Thiên Thần Hộ Mệnh", "13+", "012/05/2024", StatusType.UnRelease});
        tableMovie.addRow(new Object[]{"5", "Tình Yêu Và Tham Vọng", "18+", "10/05/2024", StatusType.UnRelease});
        tableMovie.addRow(new Object[]{"6", "Vây hãm: Kẻ trừng phạt", "18+", "26/04/2024",StatusType.Released});
        tableMovie.addRow(new Object[]{"7", "Tarot", "18+", "10/05/2024", StatusType.UnRelease});
        tableMovie.addRow(new Object[]{"8", "Cái giá của hạnh phúc", "18+", "19/04/2024", StatusType.Released});
        tableMovie.addRow(new Object[]{"9", "Nắm đấm trời ban", "16+", "03/05/2024", StatusType.Released});
        tableMovie.addRow(new Object[]{"10", "Tình Yêu Và Tham Vọng", "18+", "10/05/2024", StatusType.UnRelease});
        tableMovie.addRow(new Object[]{"11", "Trạng Tí Phiêu Lưu Ký", "PG", "30/04/2024", StatusType.Released});
        tableMovie.addRow(new Object[]{"12", "Bố Già", "16+", "01/05/2024", StatusType.Released});
        tableMovie.addRow(new Object[]{"13", "Thiên Thần Hộ Mệnh", "13+", "12/05/2024", StatusType.UnRelease});
        tableMovie.addRow(new Object[]{"14", "Tình Yêu Và Tham Vọng", "18+", "10/05/2024", StatusType.UnRelease});
        
        tableCombo.addRow(new Object[]{"1", "Combo 1", "2 nước ngọt, 1 bắp", "70.000"});
        tableCombo.addRow(new Object[]{"2", "Combo 2", "1 nước ngọt, 2 bắp", "80.000"});
        tableCombo.addRow(new Object[]{"3", "Combo 3", "3 nước ngọt, 1 bắp", "90.000"});
        tableCombo.addRow(new Object[]{"4", "Combo 4", "2 nước ngọt, 2 bắp", "100.000"});
        tableCombo.addRow(new Object[]{"5", "Combo 5", "1 nước ngọt, 3 bắp", "110.000"});
        tableCombo.addRow(new Object[]{"1", "Combo 1", "2 nước ngọt, 1 bắp", "70.000"});
        tableCombo.addRow(new Object[]{"2", "Combo 2", "1 nước ngọt, 2 bắp", "80.000"});
        tableCombo.addRow(new Object[]{"3", "Combo 3", "3 nước ngọt, 1 bắp", "90.000"});
        tableCombo.addRow(new Object[]{"4", "Combo 4", "2 nước ngọt, 2 bắp", "100.000"});
        tableCombo.addRow(new Object[]{"5", "Combo 5", "1 nước ngọt, 3 bắp", "110.000"});
        tableCombo.addRow(new Object[]{"1", "Combo 1", "2 nước ngọt, 1 bắp", "70.000"});
        tableCombo.addRow(new Object[]{"2", "Combo 2", "1 nước ngọt, 2 bắp", "80.000"});
        tableCombo.addRow(new Object[]{"3", "Combo 3", "3 nước ngọt, 1 bắp", "90.000"});
        tableCombo.addRow(new Object[]{"4", "Combo 4", "2 nước ngọt, 2 bắp", "100.000"});
        tableCombo.addRow(new Object[]{"5", "Combo 5", "1 nước ngọt, 3 bắp", "110.000"});
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTable = new javax.swing.JScrollPane();
        tableMovie = new com.raven.swing.Table();
        spTable2 = new javax.swing.JScrollPane();
        tableCombo = new com.raven.swing.Table();
        buttonAddMovie = new com.raven.swing.Button();
        buttonAddCombo = new com.raven.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Phim", "Tên phim", "Độ tuổi cho phép", "Ngày phát hành", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(tableMovie);

        tableCombo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Combo", "Tên Combo", "Chi tiết Combo", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable2.setViewportView(tableCombo);

        buttonAddMovie.setText("Thêm phim");
        buttonAddMovie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAddMovie.setPreferredSize(new java.awt.Dimension(88, 45));
        buttonAddMovie.setRadius(50);
        buttonAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddMovieActionPerformed(evt);
            }
        });

        buttonAddCombo.setText("Thêm Combo");
        buttonAddCombo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAddCombo.setRadius(50);
        buttonAddCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Danh sách Combo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 127, 127));
        jLabel2.setText("Danh sách Phim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(spTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAddMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAddCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAddCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddMovieActionPerformed
        System.out.println("Form add phim");
    }//GEN-LAST:event_buttonAddMovieActionPerformed

    private void buttonAddComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddComboActionPerformed
        System.out.println("Form add Combo");
    }//GEN-LAST:event_buttonAddComboActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button buttonAddCombo;
    private com.raven.swing.Button buttonAddMovie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JScrollPane spTable2;
    private com.raven.swing.Table tableCombo;
    private com.raven.swing.Table tableMovie;
    // End of variables declaration//GEN-END:variables
}
