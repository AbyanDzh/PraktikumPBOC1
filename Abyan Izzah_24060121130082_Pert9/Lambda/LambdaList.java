/** 
 *  File : LambdaList.java 31/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : Implementasi Lambda dalam list, Digunakan sebagai parameter dalam method
**/
import java.util.ArrayList;


public class LambdaList {
    public static void main(String[] args){
       ArrayList<String> mahasiswaList = new ArrayList<>();
       mahasiswaList.add("Adi");
       mahasiswaList.add("Abyan");
       mahasiswaList.add("Dezach");
       mahasiswaList.add("Budi");
       
       // Lambda dijadikan Paramater
       mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
