/**
 * BangunDatar.java 20/03/24
 * Nama : Vincentius Setyawan Widyahadi
 * NIM : 24060122120006
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 */

 public abstract class BangunDatar {
 
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = 1;
    }

    public double getLuas(){
        return luas;
    }
 }