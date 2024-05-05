<<<<<<< HEAD
/**
 * File     : MGaris.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * Deskripsi: Kelas yang berisi main dari Garis
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik untuk digunakan sebagai titik awal dan akhir garis
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(3, 6);
        Titik t3 = new Titik(5, 7);

        // Membuat objek garis dengan menggunakan objek titik
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t2, t3);

        // Menampilkan informasi mengenai garis
        System.out.println("Garis 1: Titik Awal = (" + g1.getTitikAwal().getAbsis() + ", " +
                           g1.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           g1.getTitikAkhir().getAbsis() + ", " +
                           g1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang Garis 1: " + g1.getPanjang());
        System.out.println("Gradien Garis 1: " + g1.getGradien());

        System.out.println("\nGaris 2: Titik Awal = (" + g2.getTitikAwal().getAbsis() + ", " +
                           g2.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           g2.getTitikAkhir().getAbsis() + ", " +
                           g2.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang Garis 2: " + g2.getPanjang());
        System.out.println("Gradien Garis 2: " + g2.getGradien());

        // Membuat garis baru hasil pencerminan dengan sumbu Y dari Garis 1
        Garis garis1RefleksiY = g1.getRefleksiY();
        System.out.println("\nGaris 1 setelah pencerminan Y: Titik Awal = (" +
                           garis1RefleksiY.getTitikAwal().getAbsis() + ", " +
                           garis1RefleksiY.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           garis1RefleksiY.getTitikAkhir().getAbsis() + ", " +
                           garis1RefleksiY.getTitikAkhir().getOrdinat() + ")");

        // Menentukan apakah Garis 2 tegak lurus dengan Garis 1
        boolean tegakLurus = g2.isTegakLurus(g1);
        System.out.println("\nGaris 2 tegak lurus dengan Garis 1: " + tegakLurus);
    }
}
=======
/**
 * File     : MGaris.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas yang berisi main dari Garis
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik untuk digunakan sebagai titik awal dan akhir garis
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(3, 6);
        Titik t3 = new Titik(5, 7);

        // Membuat objek garis dengan menggunakan objek titik
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t2, t3);

        // Menampilkan informasi mengenai garis
        System.out.println("Garis 1: Titik Awal = (" + g1.getTitikAwal().getAbsis() + ", " +
                           g1.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           g1.getTitikAkhir().getAbsis() + ", " +
                           g1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang Garis 1: " + g1.getPanjang());
        System.out.println("Gradien Garis 1: " + g1.getGradien());

        System.out.println("\nGaris 2: Titik Awal = (" + g2.getTitikAwal().getAbsis() + ", " +
                           g2.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           g2.getTitikAkhir().getAbsis() + ", " +
                           g2.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang Garis 2: " + g2.getPanjang());
        System.out.println("Gradien Garis 2: " + g2.getGradien());

        // Membuat garis baru hasil pencerminan dengan sumbu Y dari Garis 1
        Garis garis1RefleksiY = g1.getRefleksiY();
        System.out.println("\nGaris 1 setelah pencerminan Y: Titik Awal = (" +
                           garis1RefleksiY.getTitikAwal().getAbsis() + ", " +
                           garis1RefleksiY.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           garis1RefleksiY.getTitikAkhir().getAbsis() + ", " +
                           garis1RefleksiY.getTitikAkhir().getOrdinat() + ")");

        // Menentukan apakah Garis 2 tegak lurus dengan Garis 1
        boolean tegakLurus = g2.isTegakLurus(g1);
        System.out.println("\nGaris 2 tegak lurus dengan Garis 1: " + tegakLurus);
    }
}
>>>>>>> 8f51523a38d96525ec660664193895967e0be060
