/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

import java.sql.Time;

/**
 *
 * @author DANG GIA BAO
 */
public class SuatChieu {
    private int idSuatChieu;
    private Time suatChieu;
    
    public SuatChieu() {
        
    }

    public SuatChieu(int idSuatChieu, Time suatChieu) {
        this.idSuatChieu = idSuatChieu;
        this.suatChieu = suatChieu;
    }

    public int getIdSuatChieu() {
        return idSuatChieu;
    }

    public void setIdSuatChieu(int idSuatChieu) {
        this.idSuatChieu = idSuatChieu;
    }

    public Time getSuatChieu() {
        return suatChieu;
    }

    public void setSuatChieu(Time suatChieu) {
        this.suatChieu = suatChieu;
    }
}
