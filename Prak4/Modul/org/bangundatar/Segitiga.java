/**
 * File         : Segitiga.java 13/03/2024
 * Nama         : Vincentius Setyawan Widyahadi
 * NIM          : 24060122120006
 * Deskripsi    : representasi dari objek Segitiga, turunan kelas poligon
 */
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasSegitiga(){
        return alas * tinggi * 0.5;
    }

    public void printInfoSegitiga(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
