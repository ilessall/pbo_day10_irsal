/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asset;

/**
 *
 * @author A-8
 */
public class Mobil {
    private String warna;
    private int kecepatan;
    private double harga;
    private String merk;
    
    public Mobil(){
        this.harga = 300000.00;
        this.merk = "Toyota Innova";
        this.kecepatan = 250;
        this.warna = "Merah";
    }
    
    
    public Mobil(String warna, int kecepatan, double harga, String merk){
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.merk = merk;
    }

    public Mobil(String putih, String sigra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Mobil(String italia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public String getMerk(){
        return merk;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public void getInfo(){
        System.out.println("merk :" + this.merk);
        System.out.println("Harga :" + getHarga());
        System.out.println("Kecepatan Maksimal (km/jam) = " + this.kecepatan);
        System.out.println("warna :" + this.warna);
    }
}
