/** 
 *  File : MapTest.java 17/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : Program yang menggunakan Generic untuk pasangan kunci-nilai
**/

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        // Kunci -> integer, nilai -> String
        Map<Integer,String> map = new HashMap<Integer,String>();
        // Menambah Elemen
        map.put(1,"satu");
        map.put(2,"dua");
        map.put(3,"tiga");
        // Mengambil elemen pertama
        System.out.println(map.get(1));
        // Mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> Key = map.keySet();
        // Tugas PBO (Menampilkan keseluruhan nilai menggunakan iterasi)
        for(Integer Keys : Key){
            System.out.println(Keys + "." + map.get(Keys));
        }
    }
}
