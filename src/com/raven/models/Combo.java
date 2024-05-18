/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.models;

/**
 *
 * @author DANG GIA BAO
 */
public class Combo {
    private int idCombo;
    private String tenCombo;
    private String chiTietCombo;
    private double gia;

    public Combo() {
        
    }
    
    public Combo(String tenCombo, String chiTietCombo, double gia) {
        this.tenCombo = tenCombo;
        this.chiTietCombo = chiTietCombo;
        this.gia = gia;
    }

    public int getIdCombo() {
        return idCombo;
    }

    public void setIdCombo(int idCombo) {
        this.idCombo = idCombo;
    }

    public String getTenCombo() {
        return tenCombo;
    }

    public void setTenCombo(String tenCombo) {
        this.tenCombo = tenCombo;
    }

    public String getChiTietCombo() {
        return chiTietCombo;
    }

    public void setChiTietCombo(String chiTietCombo) {
        this.chiTietCombo = chiTietCombo;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
}
