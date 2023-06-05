import java.io.*;
/** 
 *  File : SerializePerson.java 31/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : Program untuk serialisasi objek Person
**/
// Class Person
class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
// Class Serialize Person
public class SerializePerson{
    public static void main(String[] args){
        Person person = new Person("Panji");
        try{
           FileOutputStream f = new FileOutputStream("person.ser");
           ObjectOutputStream s = new ObjectOutputStream(f);
           s.writeObject(person);
           System.out.println("Selesai Menulis Objek Person");
           s.close();
           }catch(IOException e){
            e.printStackTrace();
           }
        }
    }
