/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.Phim;
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
public class PhimDAO implements DAOInterface<Phim> {
    public static PhimDAO getInstance() {
        return new PhimDAO();
    }
    @Override
    public int insert(Phim t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO phim (id_phim, ten_phim, ten_dao_dien, mo_ta_phim, poster, trailer, do_tuoi_cho_phep, ngay_phat_hanh)"
                    +" VALUES"    
                    +"("+t.getIdPhim()
                    + ", '"+t.getTenPhim()
                    +"', '"+t.getTenDaoDien()
                    +"', '"+t.getMoTaPhim()
                    +"', '"+t.getPoster()
                    +"', '"+t.getTrailer()
                    +"', "+t.getDoTuoiChoPhep()
                    +", '"+t.getNgayPhatHanh()+"' );";
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
    public int update(Phim t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE phim"
                    + " SET"
                    + " ten_phim = '" + t.getTenPhim() + "',"
                    + " ten_dao_dien = '" + t.getTenDaoDien() + "',"
                    + " mo_ta_phim = '" + t.getMoTaPhim() + "',"
                    + " poster = '" + t.getPoster() + "',"
                    + " trailer = '" + t.getTrailer() + "',"
                    + " do_tuoi_cho_phep = " + t.getDoTuoiChoPhep() + ","
                    + " ngay_phat_hanh = '" + t.getNgayPhatHanh()+ "',"
                    + " WHERE id_phim = " + t.getIdPhim();
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
    public int delete(Phim t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM phim"
                    + " WHERE id_phim = " + t.getIdPhim();
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
    public ArrayList<Phim> selectAll() {
        ArrayList<Phim> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phim";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idPhim = rs.getInt("id_phim");
                String tenPhim = rs.getString("ten_phim");
                String tenDaoDien = rs.getString("ten_dao_dien");
                String moTaPhim = rs.getString("mo_ta_phim");
                String poster = rs.getString("poster");
                String trailer = rs.getString("trailer");
                String doTuoiChoPhep = rs.getString("do_tuoi_cho_phep");
                Date ngayPhatHanh = rs.getDate("ngay_phat_hanh");
                Phim p = new Phim(idPhim, tenPhim, tenDaoDien, moTaPhim, poster, trailer, doTuoiChoPhep, ngayPhatHanh);
                ketQua.add(p);
            }
            JDBCUtil.closeConnection(con);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Phim selectById(Phim t) {
        Phim ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phim WHERE id_phim = " + t.getIdPhim();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idPhim = rs.getInt("id_phim");
                String tenPhim = rs.getString("ten_name");
                String tenDaoDien = rs.getString("ten_dao_dien");
                String moTaPhim = rs.getString("mo_ta_phim");
                String poster = rs.getString("poster");
                String trailer = rs.getString("trailer");
                String doTuoiChoPhep = rs.getString("do_tuoi_cho_phep");
                Date ngayPhatHanh = rs.getDate("ngay_phat_hanh");              
                ketQua = new Phim(idPhim, tenPhim, tenDaoDien, moTaPhim, poster, trailer, doTuoiChoPhep, ngayPhatHanh);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Phim> selectByCondition(String condition) {
        ArrayList<Phim> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phim WHERE " + condition;
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idPhim = rs.getInt("id_phim");
                String tenPhim = rs.getString("ten_name");
                String tenDaoDien = rs.getString("ten_dao_dien");
                String moTaPhim = rs.getString("mo_ta_phim");
                String poster = rs.getString("poster");
                String trailer = rs.getString("trailer");
                String doTuoiChoPhep = rs.getString("do_tuoi_cho_phep");
                Date ngayPhatHanh = rs.getDate("ngay_phat_hanh");
                Phim p = new Phim(idPhim, tenPhim, tenDaoDien, moTaPhim, poster, trailer, doTuoiChoPhep, ngayPhatHanh);
                ketQua.add(p);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
}