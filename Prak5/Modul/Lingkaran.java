/**
 * Lingkaran.java 20/03/24
 * Nama : Vincentius Setyawan Widyahadi
 * NIM : 24060122120006
 * Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
 */
//mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
    
}
