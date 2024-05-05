/**
 * File      : QueueOfPoints.java   27/03/24
 * Nama      : Vincentius Setyawan Widyahadi
 * NIM       : 24060122120006
 * Deskripsi : kelas yang membuat implementasi salah satu jenis dari Queue
*/
package list;


public class QueueOfPoints extends Queue {
    
    public QueueOfPoints(){
    }
    

    public boolean cekElmType(Object elm){
        return (elm instanceof Point);
    }
    

    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
            if(getElm(i) instanceof Point P){
                P.cetak();
            }
        }
    }
    

    public Point getElm(int i){
       return (Point)super.getElm(i);
    }
    

    public Point getHead(){
       return (Point)super.getHead();
    }
    

    public Point getTail(){
       return (Point)super.getTail();
    }
}
