/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

/**
 *
 * @author DANG GIA BAO
 */
public class Ve {
    private int idVe;
    private int idPhim;
    private int idSuatChieu;
    private String idPhong;
    private String idGhe;
    private double giaVe;
    private String trangThai;
    
    public Ve() {
        
    }

    public Ve(int idVe, int idPhim, int idSuatChieu, String idPhong, String idGhe, double giaVe, String trangThai) {
        this.idVe = idVe;
        this.idPhim = idPhim;
        this.idSuatChieu = idSuatChieu;
        this.idPhong = idPhong;
        this.idGhe = idGhe;
        this.giaVe = giaVe;
        this.trangThai = trangThai;
    }

    public int getIdVe() {
        return idVe;
    }

    public void setIdVe(int idVe) {
        this.idVe = idVe;
    }

    public int getIdPhim() {
        return idPhim;
    }

    public void setIdPhim(int idPhim) {
        this.idPhim = idPhim;
    }

    public int getIdSuatChieu() {
        return idSuatChieu;
    }

    public void setIdSuatChieu(int idSuatChieu) {
        this.idSuatChieu = idSuatChieu;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public String getIdGhe() {
        return idGhe;
    }

    public void setIdGhe(String idGhe) {
        this.idGhe = idGhe;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
