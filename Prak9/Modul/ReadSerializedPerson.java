/*
 * Vincentius Setyawan Widyahadi
 * 24060122120006
 * File : ReadSerializedPerson.java
 * Deskripsi: Program untuk serialisasi objek Person
 */
import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("Serialized person name = " + person.getName());
            f.close();
        }catch (Exception ioe){
            ioe.printStackTrace();
        }
    }
}
