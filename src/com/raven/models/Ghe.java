/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

/**
 *
 * @author DANG GIA BAO
 */
public class Ghe {
    private String idGhe;
    private String loaiGhe;
    private double gia;
    private String tinhTrangGhe;
    private String idPhong;
    public Ghe() {
        
    }

    public Ghe(String idGhe, String loaiGhe, double gia, String tinhTrangGhe, String idPhong) {
        this.idGhe = idGhe;
        this.loaiGhe = loaiGhe;
        this.gia = gia;
        this.tinhTrangGhe = tinhTrangGhe;
        this.idPhong = idPhong;
    }

    public String getIdGhe() {
        return idGhe;
    }

    public void setIdGhe(String idGhe) {
        this.idGhe = idGhe;
    }

    public String getLoaiGhe() {
        return loaiGhe;
    }

    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTinhTrangGhe() {
        return tinhTrangGhe;
    }

    public void setTinhTrangGhe(String tinhTrangGhe) {
        this.tinhTrangGhe = tinhTrangGhe;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }
    
}
