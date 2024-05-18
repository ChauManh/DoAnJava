/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

/**
 *
 * @author DANG GIA BAO
 */
public class Phong {
    private String idPhong;
    private int soGhe;
    private String tinhTrangPhong;
    
    public Phong() {
        
    }

    public Phong(String idPhong, int soGhe, String tinhTrangPhong) {
        this.idPhong = idPhong;
        this.soGhe = soGhe;
        this.tinhTrangPhong = tinhTrangPhong;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getTinhTrangPhong() {
        return tinhTrangPhong;
    }

    public void setTinhTrangPhong(String tinhTrangPhong) {
        this.tinhTrangPhong = tinhTrangPhong;
    }
    
}
