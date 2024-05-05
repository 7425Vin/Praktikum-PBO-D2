<<<<<<< HEAD
/**
 * File     : Titik.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * Deskripsi: Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
 */

public class Titik {
    //atribut
    private double absis;
    private double ordinat;
    public static int counterTitik; //menghitung objek titik


    //konstruktor
    //membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Titik (double absis, double ordinat) {
        counterTitik ++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //membuat objek titik dengan inisialisasi absis 0 dan ordinat 0
    public Titik (){
        this(0,0);
        counterTitik ++;
        /*absis = x;
        ordinat = y;
        */
    }

    //method
    //prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis (double absis){
        this.absis = absis;
    }

    //prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat (double ordinat){
        this.ordinat = ordinat;
    }

    //fungsi selektor untuk mendapatkan nilai atribut absis
    public double getAbsis(){
        return this.absis;
    }

    //fungsi selektor untuk mendapatkan nilai atribut ordinat
    public double getOrdinat(){
        return this.ordinat;
    }

    //menghitung objek titik
    public static int getCounterTitik (){
        return counterTitik;
    }

    //menghitung jarak sebuah titik dengan titik pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    //melakukan pencerminan titik terhadap sumbu X.
    public void refleksiX(){
        this.ordinat *= -1;
    }

    //melakukan pencerminan titik terhadap sumbu Y.
    public void refleksiY(){
        this.absis *= -1;
    }

    //menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X
    public Titik getrefleksiX (){
        return new Titik(this.absis, -this.ordinat);
    }

    //menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu Y
    public Titik getrefleksiY (){
        return new Titik(-this.absis, this.ordinat);
    }

}

=======
/**
 * File     : Titik.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
 */

public class Titik {
    //atribut
    private double absis;
    private double ordinat;
    public static int counterTitik; //menghitung objek titik


    //konstruktor
    //membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Titik (double absis, double ordinat) {
        counterTitik ++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //membuat objek titik dengan inisialisasi absis 0 dan ordinat 0
    public Titik (){
        this(0,0);
        counterTitik ++;
        /*absis = x;
        ordinat = y;
        */
    }

    //method
    //prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis (double absis){
        this.absis = absis;
    }

    //prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat (double ordinat){
        this.ordinat = ordinat;
    }

    //fungsi selektor untuk mendapatkan nilai atribut absis
    public double getAbsis(){
        return this.absis;
    }

    //fungsi selektor untuk mendapatkan nilai atribut ordinat
    public double getOrdinat(){
        return this.ordinat;
    }

    //menghitung objek titik
    public static int getCounterTitik (){
        return counterTitik;
    }

    //menghitung jarak sebuah titik dengan titik pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    //melakukan pencerminan titik terhadap sumbu X.
    public void refleksiX(){
        this.ordinat *= -1;
    }

    //melakukan pencerminan titik terhadap sumbu Y.
    public void refleksiY(){
        this.absis *= -1;
    }

    //menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X
    public Titik getrefleksiX (){
        return new Titik(this.absis, -this.ordinat);
    }

    //menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu Y
    public Titik getrefleksiY (){
        return new Titik(-this.absis, this.ordinat);
    }

}

>>>>>>> 8f51523a38d96525ec660664193895967e0be060
