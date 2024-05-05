/**
 * File      : List.java    27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas abstrak, berisi abstraksi List
*/

package list;

import java.util.ArrayList;

public abstract class List {
    protected ArrayList<Object> list;
    
    List(){
        list = new ArrayList<>();
    }
    
    
    public Object getElm(int i){
        return list.get(i);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public abstract boolean cekElmType(Object elm);
    
    public void add(Object elm) throws Exception{
        if(cekElmType(elm)){
            list.addLast(elm);
        }else{
            throw new Exception("Tipe Elemen tidak sesuai!");
        }
    }
   
    public abstract void del();
    
    public abstract void cetak();
}
