/**
 * File      : Queue.java   27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas yang membuat implementasi metode abstrak pada List
*/
package list;

public abstract class Queue extends List {
    public Queue(){
    }
    
    public Object getHead(){
        return getElm(0);
    }
    
    public Object getTail(){
        return getElm(getSize()-1);
    }
    
    public void del(){
        list.removeFirst();
    }
    
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
            System.out.println(getElm(i));
        }
    }
}