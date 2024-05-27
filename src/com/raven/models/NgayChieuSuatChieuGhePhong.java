/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

/**
 *
 * @author DANG GIA BAO
 */
public class NgayChieuSuatChieuGhePhong {
    private int idGhe;
    private String idPhong;
    private int idNgayChieuSuatChieu;
    private int tinhTrang;

    public NgayChieuSuatChieuGhePhong(int idGhe, String idPhong, int idNgayChieuSuatChieu, int tinhTrang) {
        this.idGhe = idGhe;
        this.idPhong = idPhong;
        this.idNgayChieuSuatChieu = idNgayChieuSuatChieu;
        this.tinhTrang = tinhTrang;
    }

    public NgayChieuSuatChieuGhePhong(int idGhe, String idPhong, int idNgayChieuSuatChieu) {
        this.idGhe = idGhe;
        this.idPhong = idPhong;
        this.idNgayChieuSuatChieu = idNgayChieuSuatChieu;
    }

    public int getIdGhe() {
        return idGhe;
    }

    public void setIdGhe(int idGhe) {
        this.idGhe = idGhe;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public int getIdNgayChieuSuatChieu() {
        return idNgayChieuSuatChieu;
    }

    public void setIdNgayChieuSuatChieu(int idNgayChieuSuatChieu) {
        this.idNgayChieuSuatChieu = idNgayChieuSuatChieu;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
