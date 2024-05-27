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
public class NgayChieuSuatChieuPhimPhong {
    private Date ngayChieu;
    private int idSuatChieu;
    private int idPhim;
    private String idPhong;
    private int idNgayChieuSuatChieu;

    public NgayChieuSuatChieuPhimPhong( int idNgayChieuSuatChieu, Date ngayChieu, int idSuatChieu, int idPhim, String idPhong) {
        this.idNgayChieuSuatChieu = idNgayChieuSuatChieu;
        this.ngayChieu = ngayChieu;
        this.idSuatChieu = idSuatChieu;
        this.idPhim = idPhim;
        this.idPhong = idPhong;
    }

    public int getIdNgayChieuSuatChieu() {
        return idNgayChieuSuatChieu;
    }

    public void setIdNgayChieuSuatChieu(int idNgayChieuSuatChieu) {
        this.idNgayChieuSuatChieu = idNgayChieuSuatChieu;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public int getIdSuatChieu() {
        return idSuatChieu;
    }

    public void setIdSuatChieu(int idSuatChieu) {
        this.idSuatChieu = idSuatChieu;
    }

    public int getIdPhim() {
        return idPhim;
    }

    public void setIdPhim(int idPhim) {
        this.idPhim = idPhim;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }
    
}
