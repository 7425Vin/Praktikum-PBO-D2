/**
 * File      : Stack.java   27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas yang membuat implementasi metode abstrak pada List
*/
package list;


public abstract class Stack extends List {

    protected Stack(){
    }
    
    public Object getTop(){
        return getElm(getSize()-1);
    }
    
    public void del(){
        list.removeLast();
    }
    

    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            System.out.println(getElm(i));
        }
    }
}