/**
* MBujurSangkar.java 31/03/23
* Penulis : Abyan Izzah
* Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi Bujur Sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas BujurSangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
	}
}


