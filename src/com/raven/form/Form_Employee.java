
package com.raven.form;

import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Form_Employee extends javax.swing.JPanel {

    private Form_addEmployee fAddEmployee;
        
    public Form_Employee() {
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
        
        table.addRow(new Object[]{"1", "Châu Đức Mạnh", "Nam", "Quản lý"});
        table.addRow(new Object[]{"2", "Nguyễn Thị Hoa", "Nữ", "Nhân viên"});
        table.addRow(new Object[]{"3", "Lê Văn Tuấn", "Nam", "Kỹ sư"});
        table.addRow(new Object[]{"4", "Trần Thị Mai", "Nữ", "Kế toán"});
        table.addRow(new Object[]{"5", "Phạm Minh Hiếu", "Nam", "Bảo vệ"});
        table.addRow(new Object[]{"6", "Đỗ Thị Thu Hà", "Nữ", "Tiếp tân"});
        
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return; // Ignore selection changes during adjustment
                }
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    showInformation(selectedRow); // Gọi showInformation với selectedRow hợp lệ
                }
            }
        });
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new com.raven.component.Header();
        panelBorder1 = new com.raven.swing.PanelBorder();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        panelBorder2 = new com.raven.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        idText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        sexText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        roleText = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstworkText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numberText = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        numberText1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonSearch = new com.raven.swing.MyButton();
        buttonAdd = new com.raven.swing.MyButton();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Nhân viên", "Tên nhân viên", "Giới tính", "Chức vụ"
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

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID Nhân viên:");

        nameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameText.setText("Châu Đức Mạnh");

        idText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idText.setText("1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Họ và tên: ");

        jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel.setText("Giới tính:");

        sexText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sexText.setText("Nam");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Chức vụ:");

        roleText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roleText.setText("Quản lý");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Ngày sinh:");

        firstworkText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstworkText.setText("11/08/2004");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ngày vào làm:");

        numberText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numberText.setText("10/05/2024");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Số điện thoại:");

        numberText1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numberText1.setText("0367485383");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel)
                            .addComponent(jLabel8))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idText)
                            .addComponent(sexText)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(225, 225, 225)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addGap(41, 41, 41))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(46, 46, 46)))
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberText1)
                            .addComponent(firstworkText)
                            .addComponent(numberText)))
                    .addComponent(roleText))
                .addGap(133, 133, 133))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(firstworkText))
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameText)
                    .addComponent(jLabel12)
                    .addComponent(numberText))
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(sexText)
                    .addComponent(jLabel13)
                    .addComponent(numberText1))
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(roleText))
                .addGap(11, 11, 11))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Thông tin nhân viên");

        buttonSearch.setText("Tìm kiếm");
        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSearch.setRadius(50);
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonAdd.setText("Thêm nhân viên");
        buttonAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAdd.setRadius(50);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(916, 916, 916))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void showInformation(int selectedRow) {
        if (selectedRow >= 0 && selectedRow < table.getRowCount()) {
            DefaultTableModel model_table = (DefaultTableModel) table.getModel();
            idText.setText(model_table.getValueAt(selectedRow, 0) + "");
            nameText.setText(model_table.getValueAt(selectedRow, 1) + "");
            sexText.setText(model_table.getValueAt(selectedRow, 2) + "");
            roleText.setText(model_table.getValueAt(selectedRow, 3) + "");
        }
    }
    
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

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        fAddEmployee = new Form_addEmployee();
    }//GEN-LAST:event_buttonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.MyButton buttonAdd;
    private com.raven.swing.MyButton buttonSearch;
    private javax.swing.JLabel firstworkText;
    private com.raven.component.Header header;
    private javax.swing.JLabel idText;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel numberText;
    private javax.swing.JLabel numberText1;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelBorder panelBorder2;
    private javax.swing.JLabel roleText;
    private javax.swing.JLabel sexText;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
