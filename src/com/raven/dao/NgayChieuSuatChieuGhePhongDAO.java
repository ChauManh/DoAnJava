/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.NgayChieuSuatChieuGhePhong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DANG GIA BAO
 */
public class NgayChieuSuatChieuGhePhongDAO implements DAOInterface<NgayChieuSuatChieuGhePhong> {
    public static NgayChieuSuatChieuGhePhongDAO getInstance() {
        return new NgayChieuSuatChieuGhePhongDAO();
    }
    @Override
    public int insert(NgayChieuSuatChieuGhePhong t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO ngaychieu_suatchieu_ghe_phong (id_ghe, id_phong, id_ngaychieu_suatchieu, tinh_trang)"
                    +" VALUES"    
                    +"("+t.getIdGhe()
                    +", '"+t.getIdPhong()
                    +"', "+t.getIdNgayChieuSuatChieu()
                    +", 0"
                    +" );";
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
    public int update(NgayChieuSuatChieuGhePhong t) {
                int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE ngaychieu_suatchieu_ghe_phong"
                    +" SET"    
                    +" tinh_trang = 1"
                    +" WHERE id_ghe = "+t.getIdGhe();
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
    public int delete(NgayChieuSuatChieuGhePhong t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NgayChieuSuatChieuGhePhong> selectAll() {
        ArrayList<NgayChieuSuatChieuGhePhong> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ngaychieu_suatchieu_ghe_phong";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idGhe = rs.getInt("id_ghe");
                String idPhong = rs.getString("id_phong");
                int idNgayChieuSuatChieu = rs.getInt("id_ngaychieu_suatchieu");
                int tinhTrang = rs.getInt("tinh_trang");
                NgayChieuSuatChieuGhePhong n =  new NgayChieuSuatChieuGhePhong(idGhe, idPhong, idNgayChieuSuatChieu, tinhTrang);
                ketQua.add(n);
            }
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;    }

    @Override
    public NgayChieuSuatChieuGhePhong selectById(NgayChieuSuatChieuGhePhong t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NgayChieuSuatChieuGhePhong> selectByCondition(String condition) {
        ArrayList<NgayChieuSuatChieuGhePhong> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ngaychieu_suatchieu_ghe_phong WHERE  "+ condition;
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idGhe = rs.getInt("id_ghe");
                String idPhong = rs.getString("id_phong");
                int idNgayChieuSuatChieu = rs.getInt("id_ngaychieu_suatchieu");
                int tinhTrang = rs.getInt("tinh_trang");
                NgayChieuSuatChieuGhePhong n =  new NgayChieuSuatChieuGhePhong(idGhe, idPhong, idNgayChieuSuatChieu, tinhTrang);
                ketQua.add(n);
            }
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua; 
    }
    
}
