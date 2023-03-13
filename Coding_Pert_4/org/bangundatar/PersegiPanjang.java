package org.bangundatar;

import org.polygon.Polygon;

public class PersegiPanjang extends Polygon{
	private double panjang,lebar;
	
	public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}

	public double hitungLuas(){
		return panjang * lebar;
	}

	public void printInfo(){
		System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi()); 
	}

}