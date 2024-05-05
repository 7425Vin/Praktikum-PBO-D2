/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Vincentius Setyawan Widyahadi
24060122120006
Minggu, 05-05-2024
Senjata.java
*/
package latihanMedium;
public class Senjata {
        private String bunyi;
        private int peluru;
        private boolean menusuk;

        public Senjata(String bunyi) {
            this.bunyi = bunyi;
            this.peluru = 0;
            this.menusuk = false;
        }

        public String getBunyi() {
            return bunyi;
        }

        public int getPeluru() {
            return peluru;
        }

        public boolean isMenusuk() {
            return menusuk;
        }

        public void setBunyi(String bunyi) {
            this.bunyi = bunyi;
        }

        public void setMenusuk(boolean menusuk) {
            this.menusuk = menusuk;
        }

        public void setPeluru(int peluru) {
            this.peluru = peluru;
        }

        public void menembak(int jumlah) {
            System.out.println("Menembak " + jumlah + " kali dengan bunyi " + bunyi);
        }
    }

    class SenjataAK47 extends Senjata {
        public SenjataAK47() {
            super("TAR");
        }
    }

    class SenjataM16 extends Senjata {
        public SenjataM16() {
            super("DOR");
        }



//    Senjata(String bunyi);
//    getBunyi():String
//    getPeluru():int
//    isMenusuk():boolean
//    setBunyi(String bunyi);
//    setMenusuk(boolean menusuk);
//    setPeluru(int peluru);
//    bunyi:String
//    menusuk:boolean
//    peluru:int
}