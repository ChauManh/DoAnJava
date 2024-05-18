/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.NhanVien;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DANG GIA BAO
 */
public class NhanVienDAO implements DAOInterface<NhanVien> {
    public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }
    @Override
    public int insert(NhanVien t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO nhan_vien (id_nhan_vien, ten_nhan_vien, gioi_tinh, chuc_vu, ngay_sinh, email, sdt)"
                    + " VALUES('"+t.getIdNhanVien()+"' , '"+t.getTenNhanVien()+"' , '"+t.getGioiTinh()+"', '"+t.getChucVu()+"', '"+t.getNgaySinh()+"', '"+t.getEmail()+"', '"+t.getSdt()+"');";
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
    public int update(NhanVien t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE nhan_vien"
                    + " SET"
                    + " ten_nhan_vien = '" + t.getTenNhanVien() + "',"
                    + " gioi_tinh = '" + t.getGioiTinh() + "',"
                    + " chuc_vu = '" + t.getChucVu() + "',"
                    + " ngay_sinh = '" + t.getNgaySinh() + "',"
                    + " email = '" + t.getEmail() + "',"
                    + " sdt = '" + t.getSdt() + "'"
                    + " WHERE id_nhan_vien = '" + t.getIdNhanVien() + "'";
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
    public int delete(NhanVien t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM nhan_vien WHERE id_nhan_vien = '" + t.getIdNhanVien() + "'";
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
    public ArrayList<NhanVien> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien selectById(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NhanVien> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
