/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.TheLoaiPhim;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DANG GIA BAO
 */
public class TheLoaiPhimDAO implements DAOInterface<TheLoaiPhim> {
    public static TheLoaiPhimDAO getInstance() {
        return new TheLoaiPhimDAO();
    }
    @Override
    public int insert(TheLoaiPhim t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO phim_the_loai (id_phim, id_the_loai)"
                    + " VALUES("+t.getIdPhim()+", "+t.getIdTheLoai()+" );";
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
    public int update(TheLoaiPhim t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE phim_the_loai"
                    + " SET"
                    + " id_the_loai = " + t.getIdTheLoai() + " WHERE id_phim = " + t.getIdPhim();
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
    public int delete(TheLoaiPhim t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE from phim_the_loai"
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
    public ArrayList<TheLoaiPhim> selectAll() {
        ArrayList<TheLoaiPhim> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM phim_the_loai";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idPhim = rs.getInt("id_phim");
                int idTheLoai = rs.getInt("id_the_loai");
                TheLoaiPhim tlp = new TheLoaiPhim(idPhim, idTheLoai);
                ketQua.add(tlp);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;    
    }

    @Override
    public TheLoaiPhim selectById(TheLoaiPhim t) {
        TheLoaiPhim ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM phim_the_loai WHERE id_phim = " + t.getIdPhim();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idPhim = rs.getInt("id_phim");
                int idTheLoai = rs.getInt("id_the_loai");
                ketQua = new TheLoaiPhim(idPhim, idTheLoai);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<TheLoaiPhim> selectByCondition(String condition) {
        ArrayList<TheLoaiPhim> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM phim_the_loai WHERE id_phim = " + condition;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                int idPhim = rs.getInt("id_phim");
                int idTheLoai = rs.getInt("id_the_loai");
                TheLoaiPhim tlp = new TheLoaiPhim(idPhim, idTheLoai);
                ketQua.add(tlp);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
}
