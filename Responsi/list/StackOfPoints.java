/**
 * File      : StackOfPoints.java   27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas yang membuat implementasi salah satu jenis dari Stack
*/
package list;


public class StackOfPoints extends Stack{
    public StackOfPoints(){
    }
    
    
    public boolean cekElmType(Object elm){
        return (elm instanceof Point);
    }
    
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElm(i) instanceof Point P){
                P.cetak();
            }
        }
    }
    
    public Point getElm(int i){
       return (Point)super.getElm(i);
    }
    

    public Point getTop(){
       return (Point)super.getTop();
    }
}
