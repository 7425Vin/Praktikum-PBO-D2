/**
 * File      : Point.java   27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas yang membuat implementasi Point 
*/

package list;

public class Point {
    private double absis;
    private double ordinat;
    
      
    //membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Point(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }
    
    //membuat objek titik dengan inisialisasi absis 0 dan ordinat 0
    public Point(){
        this(0,0);
    }
    
    
    //fungsi selektor untuk mendapatkan nilai atribut absis
    public double getOrdinat(){
        return this.ordinat;
    }
    
    //fungsi selektor untuk mendapatkan nilai atribut ordinat
    public double getAbsis(){
        return this.absis;
    }

    //prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis(double absis){
        this.absis = absis;
    }
    
    //prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    
    public void cetak(){
        System.out.println("(" + absis + "," + ordinat + ")");
    }
}
