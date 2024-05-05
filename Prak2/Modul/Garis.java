<<<<<<< HEAD
/**
 * File     : Garis.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * Deskripsi: Kelas Garis yang merupakan sebuah garis dari titik awal sampai titik akhir
 */
public class Garis {
    //atribut
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    // Menghitung panjang garis
    public double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // Menghitung gradien garis
    public double getGradien(){
        double x1 = getTitikAwal().getAbsis();
        double x2 = getTitikAkhir().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double y2 = getTitikAkhir().getOrdinat();
        return ((y2 - y1)/(x2 - x1));
    }

    // Menghasilkan garis baru hasil pencerminan dengan sumbu Y
    public Garis getRefleksiY() {
        Titik titikAwalReflect = new Titik(titikAwal.getAbsis(), -titikAwal.getOrdinat());
        Titik titikAkhirReflect = new Titik(titikAkhir.getAbsis(), -titikAkhir.getOrdinat());
        return new Garis(titikAwalReflect, titikAkhirReflect);
    }


    // Menghasilkan nilai True jika objek garis tegak lurus dengan garis G
    public boolean isTegakLurus(Garis G) {
    // Dua garis tegak lurus jika perkalian gradiennya = -1
        double gradienG1 = this.getGradien();
        double gradienG2 = G.getGradien();

        // Handle kasus gradien tidak terdefinisi (garis vertikal)
        if (Double.isNaN(gradienG1) && Double.isInfinite(gradienG2)) {
            return true;
        } else if (Double.isNaN(gradienG2) && Double.isInfinite(gradienG1)) {
            return true;
        } else {
            return gradienG1 * gradienG2 == -1;
        }
    }
    


}
 
=======
/**
 * File     : Garis.java    28/02/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Garis yang merupakan sebuah garis dari titik awal sampai titik akhir
 */
public class Garis {
    //atribut
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    // Menghitung panjang garis
    public double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // Menghitung gradien garis
    public double getGradien(){
        double x1 = getTitikAwal().getAbsis();
        double x2 = getTitikAkhir().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double y2 = getTitikAkhir().getOrdinat();
        return ((y2 - y1)/(x2 - x1));
    }

    // Menghasilkan garis baru hasil pencerminan dengan sumbu Y
    public Garis getRefleksiY() {
        Titik titikAwalReflect = new Titik(titikAwal.getAbsis(), -titikAwal.getOrdinat());
        Titik titikAkhirReflect = new Titik(titikAkhir.getAbsis(), -titikAkhir.getOrdinat());
        return new Garis(titikAwalReflect, titikAkhirReflect);
    }


    // Menghasilkan nilai True jika objek garis tegak lurus dengan garis G
    public boolean isTegakLurus(Garis G) {
    // Dua garis tegak lurus jika perkalian gradiennya = -1
        double gradienG1 = this.getGradien();
        double gradienG2 = G.getGradien();

        // Handle kasus gradien tidak terdefinisi (garis vertikal)
        if (Double.isNaN(gradienG1) && Double.isInfinite(gradienG2)) {
            return true;
        } else if (Double.isNaN(gradienG2) && Double.isInfinite(gradienG1)) {
            return true;
        } else {
            return gradienG1 * gradienG2 == -1;
        }
    }
    


}
 
>>>>>>> 8f51523a38d96525ec660664193895967e0be060
