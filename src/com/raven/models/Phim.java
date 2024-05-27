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
    private String tenDaoDien;
    private String moTaPhim;
    private String poster;
    private String trailer;
    private String doTuoiChoPhep;
    private Date ngayPhatHanh;


    public Phim() {
        
    }

    public Phim(int idPhim, String tenPhim, String tenDaoDien, String moTaPhim, String poster, String trailer, String doTuoiChoPhep, Date ngayPhatHanh) {
        this.idPhim = idPhim;
        this.tenPhim = tenPhim;
        this.tenDaoDien = tenDaoDien;
        this.moTaPhim = moTaPhim;
        this.poster = poster;
        this.trailer = trailer;
        this.doTuoiChoPhep = doTuoiChoPhep;
        this.ngayPhatHanh = ngayPhatHanh;
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

    public String getDoTuoiChoPhep() {
        return doTuoiChoPhep;
    }

    public void setDoTuoiChoPhep(String doTuoiChoPhep) {
        this.doTuoiChoPhep = doTuoiChoPhep;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
