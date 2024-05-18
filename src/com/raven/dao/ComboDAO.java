/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.Combo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DANG GIA BAO
 */
public class ComboDAO implements DAOInterface<Combo> {
    public static ComboDAO getInstance() {
        return new ComboDAO();
    }
    @Override
    public int insert(Combo t) {
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO combo (ten_combo, chi_tiet_combo, gia)"
                    + " VALUES('"+t.getTenCombo()+"' , '"+t.getChiTietCombo()+"' , "+t.getGia()+" );";
            int ketQua = st.executeUpdate(sql);
            System.out.println("Da thuc thi: " + sql);
            System.out.println("Co " + ketQua + " dong bi thay doi.");
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Combo t) {
        return 0;
    }

    @Override
    public int delete(Combo t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Combo selectById(Combo t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
