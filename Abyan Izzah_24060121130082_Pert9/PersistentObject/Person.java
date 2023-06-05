/** 
 *  File : Person.java 31/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : Person Database Model
**/

public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
}
