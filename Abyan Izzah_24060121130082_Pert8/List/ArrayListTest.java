/** 
 *  File : ArrayListTest.java 17/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : Program penggunaan objek ArrayList sebagai collection class
**/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        // Inisialisasi ArrayList yang hanya dapat berisi object String
        ArrayList<String> strings = new ArrayList<String>();
        // Menambah Elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("praktiku");
        // Menghapus Elemen
        strings.remove("praktikum");
        // iterasi pada kesuluruhan ArrayList
        for(String s : strings){
            System.out.print(s + " ");
        }
    }
}
