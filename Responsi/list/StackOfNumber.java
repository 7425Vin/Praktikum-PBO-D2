/**
 * File      : StackOfNumber.java   27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas yang membuat implementasi salah satu jenis dari Stack
*/
package list;

public class StackOfNumber extends Stack {
    //constructor
    public StackOfNumber(){
    }
    
    
    public boolean cekElmType(Object elm){
        return (elm instanceof Integer);
    }
}
