/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.NgayChieuSuatChieuPhimPhong;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DANG GIA BAO
 */
public class NgayChieuSuatChieuPhimPhongDAO implements DAOInterface<NgayChieuSuatChieuPhimPhong> {
    public static NgayChieuSuatChieuPhimPhongDAO getInstance() {
        return new NgayChieuSuatChieuPhimPhongDAO();
    }
    @Override
    public int insert(NgayChieuSuatChieuPhimPhong t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO ngaychieu_suatchieu_phim_phong (ngay_chieu, id_suat_chieu, id_phim, id_phong)"
                    + " VALUES('"+t.getNgayChieu()+"' , "+t.getIdSuatChieu()+" , "+t.getIdPhim()+", '"+t.getIdPhong()+"');";
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
    public int update(NgayChieuSuatChieuPhimPhong t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(NgayChieuSuatChieuPhimPhong t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NgayChieuSuatChieuPhimPhong> selectAll() {
        ArrayList<NgayChieuSuatChieuPhimPhong> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ngaychieu_suatchieu_phim_phong";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idNgayChieuSuatChieu = rs.getInt("id_ngaychieu_suatchieu");
                Date ngayChieu = rs.getDate("ngay_chieu");
                int idSuatChieu = rs.getInt("id_suat_chieu");
                int idPhim = rs.getInt("id_phim");
                String idPhong = rs.getString("id_phong");
                NgayChieuSuatChieuPhimPhong n =  new NgayChieuSuatChieuPhimPhong(idNgayChieuSuatChieu, ngayChieu, idSuatChieu, idPhim, idPhong);
                ketQua.add(n);
            }
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public NgayChieuSuatChieuPhimPhong selectById(NgayChieuSuatChieuPhimPhong t) {
        NgayChieuSuatChieuPhimPhong ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ngaychieu_suatchieu_phim_phong WHERE id_phong = '" + t.getIdPhong() + "' AND id_suat_chieu = " + t.getIdSuatChieu() + " AND id_phim = " + t.getIdPhim() + " AND ngay_chieu = '" + t.getNgayChieu() + "'";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idNgayChieuSuatChieu = rs.getInt("id_ngaychieu_suatchieu");
                Date ngayChieu = rs.getDate("ngay_chieu");
                int idSuatChieu = rs.getInt("id_suat_chieu");
                int idPhim = rs.getInt("id_phim");
                String idPhong = rs.getString("id_phong");
                ketQua = new NgayChieuSuatChieuPhimPhong(idNgayChieuSuatChieu, ngayChieu, idSuatChieu, idPhim, idPhong);
            }
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;    }

    @Override
    public ArrayList<NgayChieuSuatChieuPhimPhong> selectByCondition(String condition) {
        ArrayList<NgayChieuSuatChieuPhimPhong> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ngaychieu_suatchieu_phim_phong WHERE id_phim = " + condition;
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idNgayChieuSuatChieu = rs.getInt("id_ngaychieu_suatchieu");
                Date ngayChieu = rs.getDate("ngay_chieu");
                int idSuatChieu = rs.getInt("id_suat_chieu");
                int idPhim = rs.getInt("id_phim");
                String idPhong = rs.getString("id_phong");
                NgayChieuSuatChieuPhimPhong p = new NgayChieuSuatChieuPhimPhong(idNgayChieuSuatChieu, ngayChieu, idSuatChieu, idPhim, idPhong);
                ketQua.add(p);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
}
