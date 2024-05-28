package com.raven.form;

import com.raven.dao.NhanVienDAO;
import com.raven.model.StatusType;
import com.raven.model.TableActionEvent;
import com.raven.models.NhanVien;
import com.raven.swing.ScrollBar;
import com.raven.swing.TableActionCellEditor;
import com.raven.swing.TableActionCellRender;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Form_Employee extends javax.swing.JPanel {

    private ArrayList<NhanVien> listNhanVien = null;
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
        //Lay du lieu toan bo nhan vien tu dba
        listNhanVien = NhanVienDAO.getInstance().selectAll();
        //Hien thi nhan vien len table
        for (int i = 0; i < listNhanVien.size(); i++) {
            table.addRow(new Object[]{listNhanVien.get(i).getIdNhanVien(), listNhanVien.get(i).getTenNhanVien(), listNhanVien.get(i).getGioiTinh(), listNhanVien.get(i).getChucVu()});
        }

        TableActionEvent evt = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
            }

            @Override
            public void onDelete(int row) {
                if (table.isEditing()) {
                    table.getCellEditor().stopCellEditing();
                }

                // Hiển thị bảng xác nhận
                int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "Bạn có chắc chắn muốn xóa nhân viên này không?",
                        "Xác nhận xóa",
                        JOptionPane.OK_CANCEL_OPTION
                );

                if (confirm == JOptionPane.OK_OPTION) {
                    // Nếu người dùng chọn OK, tiến hành xóa
                    NhanVienDAO.getInstance().delete(getInfoByID(row));
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(row);
                } else {
                }
            }

            @Override
            public void onView(int row) {
                showInformation(row);
            }
        };
        table.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(evt));
//        setTable();        
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
        ngaySinhText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ngayVaoLamText = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sdtText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonSearch = new com.raven.swing.MyButton();
        buttonAdd = new com.raven.swing.MyButton();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Nhân viên", "Tên nhân viên", "Giới tính", "Chức vụ", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

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

        idText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Họ và tên: ");

        jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel.setText("Giới tính:");

        sexText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Chức vụ:");

        roleText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Ngày sinh:");

        ngaySinhText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ngày vào làm:");

        ngayVaoLamText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Số điện thoại:");

        sdtText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
                            .addComponent(sdtText)
                            .addComponent(ngaySinhText)
                            .addComponent(ngayVaoLamText)))
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
                    .addComponent(ngaySinhText))
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameText)
                    .addComponent(jLabel12)
                    .addComponent(ngayVaoLamText))
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(sexText)
                    .addComponent(jLabel13)
                    .addComponent(sdtText))
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
            ngaySinhText.setText(listNhanVien.get(selectedRow).getNgaySinh().toString());
            sdtText.setText(listNhanVien.get(selectedRow).getSdt());
            ngayVaoLamText.setText(listNhanVien.get(selectedRow).getNgayVaoLam().toString());
        }
    }

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        DefaultTableModel ob = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(header.searchText.getText()));
        if (buttonSearch.getText().equals("Tìm kiếm") && header.searchText.getText().equals("")) {
            buttonSearch.setText("Tìm kiếm");
        } else if (buttonSearch.getText().equals("Tìm kiếm")) {
            buttonSearch.setText("Hủy");
            header.searchText.setText("");
        } else if (buttonSearch.getText().equals("Hủy")) {
            buttonSearch.setText("Tìm kiếm");
        }
    }//GEN-LAST:event_buttonSearchActionPerformed
    //Cập nhật lại bảng sau khi thêm một nhân viên
    public void addTable(NhanVien nv) {
        table.addRow(new Object[]{nv.getIdNhanVien(), nv.getTenNhanVien(), nv.getGioiTinh(), nv.getChucVu()});
    }
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        fAddEmployee = new Form_addEmployee(this);
    }//GEN-LAST:event_buttonAddActionPerformed

    public NhanVien getInfoByID(int row) {
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getIdNhanVien().equals(table.getValueAt(row, 0))) {
                return listNhanVien.get(i);
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.MyButton buttonAdd;
    private com.raven.swing.MyButton buttonSearch;
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
    private javax.swing.JLabel ngaySinhText;
    private javax.swing.JLabel ngayVaoLamText;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelBorder panelBorder2;
    private javax.swing.JLabel roleText;
    private javax.swing.JLabel sdtText;
    private javax.swing.JLabel sexText;
    private javax.swing.JScrollPane spTable;
    public com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
