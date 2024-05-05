/**
 * File         : MPoligon.java 13/03/2024
 * Nama         : Vincentius Setyawan Widyahadi
 * NIM          : 24060122120006
 * Deskripsi    : driver class untuk poligon dan persegi panjang
 */

 package org.main;
 import org.bangundatar.*;

 public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " +persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(5, 8, 3);
        segitiga.printInfoSegitiga();
        System.out.println("Luas Segitiga: "+segitiga.hitungLuasSegitiga());
    }
    
 }