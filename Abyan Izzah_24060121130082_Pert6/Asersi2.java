/* 
* Asersi2.java 01/04/2023
* Nama      : Abyan Izzah
* Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari 		  lingkaran yang bernilai 0
*/

import static java.lang.Math.PI;

//class Lingkaran
class Lingkaran{
	private double jejari;
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		double keliling = 2 * PI * jejari * jejari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jejari = 15;
		if (jejari == 0){
			assert (jejari > 0) : "kesalahan code!";
			System.out.println("jari-jari tidak boleh nol!");
		}
		else if(jejari < 0){
			assert (jejari > 0) : "kesalahan code!";
			System.out.println("jari-jari tidak boleh negatif!");	
		}
		else{
		Lingkaran l = new Lingkaran(jejari);
			double kelilingLingkaran = l.hitungKeliling();
			System.out.println("Keliling lingkaran = " + kelilingLingkaran);
		}
	}
}
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
// Kasus diatas tidak bisa menghandle kasus apabila nilai jejari negatif. Walaupun dalam kasus diatas tidak akan berpengaruh dikarenakan jejari akan selalu bernilai positif ketika dijalankan method hitungKeliling, akan lebih baik jika menggunakan if else seperti pada kasus Asersi1.java yang menghandle semua kemungkinan nilai jejari. Dan juga dalam keterangan assertion lebih baik menggunakan keterangan "kesalahan code" karena dalam assert tidak menghandle semua kemungkinan kasus yang ada. 



