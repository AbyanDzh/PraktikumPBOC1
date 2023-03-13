package org.bangundatar;

import org.polygon.Polygon;

public class Segitiga extends Polygon{
	private double alas,tinggi;
	
	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}

	public double hitungLuas(){
		return 0.5 * alas * tinggi;
	}

	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
	}

}