/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.TheLoai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DANG GIA BAO
 */
public class TheLoaiDAO implements DAOInterface<TheLoai> {
    public static TheLoaiDAO getInstance() {
        return new TheLoaiDAO();
    }
    @Override
    public int insert(TheLoai t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(TheLoai t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(TheLoai t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TheLoai> selectAll() {
        ArrayList<TheLoai> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM the_loai";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idTheLoai = rs.getInt("id_the_loai");
                String theLoai = rs.getString("the_loai");
                TheLoai tl = new TheLoai(idTheLoai, theLoai);
                ketQua.add(tl);
            }
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public TheLoai selectById(TheLoai t) {
        TheLoai ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM the_loai WHERE id_the_loai = " + t.getIdTheLoai();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idTheLoai = rs.getInt("id_the_loai");
                String theLoai = rs.getString("the_loai");
                ketQua = new TheLoai(idTheLoai, theLoai);
            }
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<TheLoai> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
