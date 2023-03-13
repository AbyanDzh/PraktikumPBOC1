package org.main;

import org.bangundatar.*;

public class MPolygon{
	public static void main(String [] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(5,4,3);
		persegi.printInfo();
		segitiga.printInfo();
		System.out.println("Luas PersegiPanjang : " + persegi.hitungLuas());
		System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
	}
}