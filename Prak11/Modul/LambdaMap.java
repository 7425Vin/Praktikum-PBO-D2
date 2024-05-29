/*
 * File LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map
 * Vincentius Setyawan Widyahadi
 * 24060122120006
 */
import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan key berupa NIM dan value berupa nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122120001", "Adi");
        mahasiswaMap.put("24060122120002", "Bambang");
        mahasiswaMap.put("24060122120003", "Cici");
        mahasiswaMap.put("24060122120004", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}

