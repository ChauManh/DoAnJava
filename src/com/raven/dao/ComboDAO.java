/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.Combo;
import java.sql.Connection;
import java.sql.ResultSet;
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
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO combo (id_combo, ten_combo, chi_tiet_combo, gia)"
                    + " VALUES('"+t.getTenCombo()+"' , '"+t.getChiTietCombo()+"' , "+t.getGia()+" );";
            ketQua = st.executeUpdate(sql);
            System.out.println("Da thuc thi: " + sql);
            System.out.println("Co " + ketQua + " dong bi thay doi.");
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(Combo t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE combo" 
                    + " SET"
                    + " ten_combo = '" + t.getTenCombo() + "',"
                    + " chi_tiet_combo = '" + t.getChiTietCombo() + "',"
                    + " gia = " + t.getGia()
                    + " WHERE id_combo = " + t.getIdCombo();
            ketQua = st.executeUpdate(sql);
            System.out.println("Da thuc thi: " + sql);
            System.out.println("Co " + ketQua + " dong bi thay doi.");
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(Combo t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM combo" 
                    + " WHERE id_combo = " + t.getIdCombo();
            ketQua = st.executeUpdate(sql);
            System.out.println("Da thuc thi: " + sql);
            System.out.println("Co " + ketQua + " dong bi thay doi.");
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Combo> selectAll() {
        ArrayList<Combo> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM combo";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idCombo = rs.getInt("id_combo");
                String tenCombo = rs.getString("ten_combo");
                String chiTietCombo = rs.getString("chi_tiet_combo");
                double gia = rs.getDouble("gia");
                Combo cb = new Combo(idCombo, tenCombo, chiTietCombo, gia);
                ketQua.add(cb);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Combo selectById(Combo t) {
        Combo ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM combo WHERE combo_id = " + t.getIdCombo();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idCombo = rs.getInt("id_combo");
                String tenCombo = rs.getString("ten_combo");
                String chiTietCombo = rs.getString("chi_tiet_combo");
                double gia = rs.getDouble("gia");
                ketQua = new Combo(idCombo, tenCombo, chiTietCombo, gia);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;    }

    @Override
    public ArrayList<Combo> selectByCondition(String condition) {
        ArrayList<Combo> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM combo WHERE " + condition;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idCombo = rs.getInt("id_combo");
                String tenCombo = rs.getString("ten_combo");
                String chiTietCombo = rs.getString("chi_tiet_combo");
                double gia = rs.getDouble("gia");
                Combo cb = new Combo(idCombo, tenCombo, chiTietCombo, gia);
                ketQua.add(cb);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;        
    }
}
