/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DANG GIA BAO
 */
public class TaiKhoanDAO implements DAOInterface<TaiKhoan> {
    public static TaiKhoanDAO getInstance() {
        return new TaiKhoanDAO();
    }
    @Override
    public int insert(TaiKhoan t) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO tai_khoan VALUES(?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getTenTaiKhoan());
            st.setString(2, t.getMatKhau());
            st.setString(3, t.getEmail());
            st.execute();
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(TaiKhoan t) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE tai_khoan "
                    + "SET mat_khau = '" + t.getMatKhau() + "' WHERE ten_tai_khoan = '" + t.getTenTaiKhoan() + "' AND email = '" + t.getEmail() + "';";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getTenTaiKhoan());
            st.setString(2, t.getMatKhau());
            st.setString(3, t.getEmail());
            st.execute();
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(TaiKhoan t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TaiKhoan> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TaiKhoan selectById(TaiKhoan t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TaiKhoan> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
