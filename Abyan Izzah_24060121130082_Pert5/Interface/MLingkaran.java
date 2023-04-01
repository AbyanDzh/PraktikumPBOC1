/**
 * File : MLingkaran.java 04/01/2023
 * Penulis : Abyan Izzah
 * Deskripsi : Kelas yang berisi driver untuk kelas lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai jejari lingkaran : ");
        double jejari = scan.nextDouble();
	  Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + l.hitungLuas());
    }
}