/**
 * File     : Titik.java    21/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * Deskripsi: Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
 */

public class Titik {
    //atribut
    double absis;
    double ordinat;
    static int counterTitik; //menghitung objek titik

    Titik () {
        counterTitik ++;
        absis = 0;
        ordinat = 0;
    }

    Titik (double x, double y){
        counterTitik ++;
        absis = x;
        ordinat = y;
    }

    void setAbsis (double a){
        absis = a;
    }

    void setOrdinat (double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik (){
        return counterTitik;
    }

}
 