/** 
 * File      = MTitik.java 22/02/2023
 * Penulis   = Abyan Izzah Azzam Hastono
 * Deskripsi = Program untuk mengaplikasikan program yang sudah dibuat terlebih dahulu, 
 *             yaitu program class Titik
 */

public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik(); //titik t1
        t1.setAbsis(2);
        t1.setOrdinat(3);

        t2 = new Titik(4,3); //titik t2 (menggunakan parameter)

        t3 = new Titik(); //titik t3
        t3.setAbsis(2);
        t3.setOrdinat(5);

        System.out.println("Absis dan ordinat dari t1 adalah :" + " " + t1.getAbsis() +  " " + "," + " " + t1.getOrdinat());
        System.out.println("Absis dan ordinat dari t2 adalah :" + " " + t2.getAbsis() +  " " + "," + " " + t2.getOrdinat());
        System.out.println("Absis dan ordinat dari t3 adalah :" + " " + t3.getAbsis() +  " " + "," + " " + t3.getOrdinat());
        System.out.println("Banyak Titiknya adalah :" + " " + Titik.getcounterTitik());


    }
    
}
