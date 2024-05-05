/**
 * File      : QueueOfNumber.java   27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas yang membuat implementasi salah satu jenis dari Queue
 */
package list;


public class QueueOfNumber extends Queue{
    //constructor
    public QueueOfNumber(){
    }
    
    //method
    public boolean cekElmType(Object elm){
        return (elm instanceof Integer);
    }
}
