/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

import java.sql.Date;

/**
 *
 * @author DANG GIA BAO
 */
public class Phim {
    private int idPhim;
    private String tenPhim;
    private int idTheLoai;
    private String tenDaoDien;
    private String moTaPhim;
    private String poster;
    private String trailer;
    private int doTuoiChoPhep;
    private Date ngayPhatHanh;
    private double diemDanhGia;
    private int luotDanhGia;

    public Phim() {
        
    }
    
    public Phim(int idPhim, String tenPhim, int idTheLoai, String tenDaoDien, String moTaPhim, String poster, String trailer, int doTuoiChoPhep, Date ngayPhatHanh, double diemDanhGia, int luotDanhGia) {
        this.idPhim = idPhim;
        this.tenPhim = tenPhim;
        this.idTheLoai = idTheLoai;
        this.tenDaoDien = tenDaoDien;
        this.moTaPhim = moTaPhim;
        this.poster = poster;
        this.trailer = trailer;
        this.doTuoiChoPhep = doTuoiChoPhep;
        this.ngayPhatHanh = ngayPhatHanh;
        this.diemDanhGia = diemDanhGia;
        this.luotDanhGia = luotDanhGia;
    }

    public int getIdPhim() {
        return idPhim;
    }

    public void setIdPhim(int idPhim) {
        this.idPhim = idPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(int idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public String getTenDaoDien() {
        return tenDaoDien;
    }

    public void setTenDaoDien(String tenDaoDien) {
        this.tenDaoDien = tenDaoDien;
    }

    public String getMoTaPhim() {
        return moTaPhim;
    }

    public void setMoTaPhim(String moTaPhim) {
        this.moTaPhim = moTaPhim;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public int getDoTuoiChoPhep() {
        return doTuoiChoPhep;
    }

    public void setDoTuoiChoPhep(int doTuoiChoPhep) {
        this.doTuoiChoPhep = doTuoiChoPhep;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public double getDiemDanhGia() {
        return diemDanhGia;
    }

    public void setDiemDanhGia(double diemDanhGia) {
        this.diemDanhGia = diemDanhGia;
    }

    public int getLuotDanhGia() {
        return luotDanhGia;
    }

    public void setLuotDanhGia(int luotDanhGia) {
        this.luotDanhGia = luotDanhGia;
    }  
}
