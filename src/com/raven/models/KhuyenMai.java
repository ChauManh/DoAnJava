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
public class KhuyenMai {
    private int idKhuyenMai;
    private double mucKhuyenMai;
    private Date ngayKhuyenMai;
    
    public KhuyenMai() {
        
    }

    public KhuyenMai(int idKhuyenMai, double mucKhuyenMai, Date ngayKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
        this.mucKhuyenMai = mucKhuyenMai;
        this.ngayKhuyenMai = ngayKhuyenMai;
    }

    public int getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public void setIdKhuyenMai(int idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public double getMucKhuyenMai() {
        return mucKhuyenMai;
    }

    public void setMucKhuyenMai(double mucKhuyenMai) {
        this.mucKhuyenMai = mucKhuyenMai;
    }

    public Date getNgayKhuyenMai() {
        return ngayKhuyenMai;
    }

    public void setNgayKhuyenMai(Date ngayKhuyenMai) {
        this.ngayKhuyenMai = ngayKhuyenMai;
    }
    
}
