/*
 * Vincentius Setyawan Widyahadi
 * Sabtu, 11 Mei 2024
 * Main.java
 */
public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        
        anu.setIsi(K);
        anu.getIsi().gerak();  
        
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();  
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();  
    }
}