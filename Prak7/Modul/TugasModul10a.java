public class TugasModul10a {
    
    /*3a. overloading
    contoh dan syarat-syarat yang harus dipenuhi untuk mendapatkan method overloading.
    1. Nama method yang sama di kelas.
    2. Jumlah parameter yang berbeda, atau tipe data parameter yang berbeda, atau keduanya.
    */

    //contoh
    // Method overloading untuk perkalian
    public int calculate(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public double calculate(double a, double b, double c, double d) {
        return a * b * c * d;
    }


    //3b. Coercion

    /* Penjelasan Terkait Pemahamantentang Casting dan Coercion
     * Casting dan coercion adalah dua proses penting dalam pemrograman yang memungkinkan konversi nilai dari satu tipe data ke tipe data lain. 
     * Casting adalah proses eksplisit yang dikendalikan oleh programmer, 
     * sedangkan coercion adalah proses implisit yang dilakukan secara otomatis oleh compiler atau interpreter. 
     * Casting dapat menyebabkan kehilangan data, sedangkan coercion biasanya tidak.
     */
    
    int output = 'a';

    /*
    double x = 15.5;
    int output = x;

    int y = 25;
    double output = y;

    int z = 78;
    char output = (char) z;

    char a = 'a';
    double output = a;
    */
    public static void main(String[] args) {
        //3a.
        TugasModul10a perkalian = new TugasModul10a();
        // Perkalian
        System.out.println("Perkalian: " + perkalian.calculate(2, 3, 4, 5));
        System.out.println("Perkalian: " + perkalian.calculate(2.5, 3.5, 4.5, 5.5));

        //3b.
        TugasModul10a coercion = new TugasModul10a();
        System.out.println(coercion.output);

    }
    

}