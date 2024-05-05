<<<<<<< HEAD
/**
 * File     : MTitik.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * Deskripsi: Kelas yang berisi main dari Titik
 */

public class MTitik {
    
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        //Titik t3;

        t1 = new Titik(1,2);

        t2 = new Titik(3,4);

        //t3 = new Titik(5,6);

        int counterTitik = Titik.getCounterTitik();

        
        System.out.printf("Jumlah objek titik : %d\n", counterTitik);
        /*
        System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik t3 dengan absis : %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());
        */
        
        //menghitung jarak sebuah titik dengan titik pusat (0,0)
        System.out.printf("Jarak Titik t1 dengan titik pusat : %.2f\n", t1.getJarakPusat());
        System.out.printf("Jarak Titik t2 dengan titik pusat : %.2f\n", t2.getJarakPusat());
        

         // Melakukan pencerminan terhadap sumbu X dan Y pada Titik 1
         t1.refleksiX();
         t1.refleksiY();

        // Menampilkan hasil pencerminan Titik 1
        System.out.printf("Titik 1 setelah pencerminan X dan Y: absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        
        // Membuat objek baru hasil pencerminan terhadap sumbu X dari Titik 2
        Titik t3 = t2.getrefleksiX();
        
        // Menampilkan hasil pencerminan Titik 2
        System.out.printf("Titik 2 setelah pencerminan X: absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik 3 (hasil pencerminan X dari Titik 2): absis : %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());
    }


        



}
=======
/**
 * File     : MTitik.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas yang berisi main dari Titik
 */

public class MTitik {
    
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        //Titik t3;

        t1 = new Titik(1,2);

        t2 = new Titik(3,4);

        //t3 = new Titik(5,6);

        int counterTitik = Titik.getCounterTitik();

        /*
        System.out.printf("Jumlah objek titik : %d\n", counterTitik);
        System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik t3 dengan absis : %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());
        */
        
        //menghitung jarak sebuah titik dengan titik pusat (0,0)
        System.out.printf("Jarak Titik t1 dengan titik pusat : %.2f\n", t1.getJarakPusat());
        System.out.printf("Jarak Titik t2 dengan titik pusat : %.2f\n", t2.getJarakPusat());
        

         // Melakukan pencerminan terhadap sumbu X dan Y pada Titik 1
         t1.refleksiX();
         t1.refleksiY();

        // Menampilkan hasil pencerminan Titik 1
        System.out.printf("Titik 1 setelah pencerminan X dan Y: absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        
        // Membuat objek baru hasil pencerminan terhadap sumbu X dari Titik 2
        Titik t3 = t2.getrefleksiX();
        
        // Menampilkan hasil pencerminan Titik 2
        System.out.printf("Titik 2 setelah pencerminan X: absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik 3 (hasil pencerminan X dari Titik 2): absis : %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());
    }


        



}
>>>>>>> 8f51523a38d96525ec660664193895967e0be060
