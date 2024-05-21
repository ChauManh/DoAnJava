/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

/**
 *
 * @author DANG GIA BAO
 */
public class TheLoaiPhim {
    private int idPhim;
    private int idTheLoai;
    
    public TheLoaiPhim(){
        
    }

    public TheLoaiPhim(int idPhim, int idTheLoai) {
        this.idPhim = idPhim;
        this.idTheLoai = idTheLoai;
    }

    public int getIdPhim() {
        return idPhim;
    }

    public void setIdPhim(int idPhim) {
        this.idPhim = idPhim;
    }

    public int getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(int idTheLoai) {
        this.idTheLoai = idTheLoai;
    }
    
}
