/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.database.JDBCUtil;
import com.raven.models.Phim;
import java.sql.Connection;
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
            String sql = "INSERT INTO phim (id_phim, ten_phim, ten_dao_dien, mo_ta_phim, poster, trailer, do_tuoi_cho_phep, ngay_phat_hanh, diem_danh_gia, luot_danh_gia)"
                    +" VALUES"
                    +"('"+t.getTenPhim()
                    +"', '"+t.getTenDaoDien()
                    +"', '"+t.getMoTaPhim()
                    +"', '"+t.getPoster()
                    +"', '"+t.getTrailer()
                    +"', "+t.getDoTuoiChoPhep()
                    +", '"+t.getNgayPhatHanh()
                    +"', "+t.getDiemDanhGia()
                    +", "+t.getLuotDanhGia()+" );";
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
                    + " diem_danh_gia = " + t.getDiemDanhGia() + ","
                    + " luot_danh_gia = " + t.getLuotDanhGia()
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Phim> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Phim selectById(Phim t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Phim> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
