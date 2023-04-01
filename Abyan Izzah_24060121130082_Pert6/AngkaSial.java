/* 
* AngkaSial.java 01/04/2023
* Nama      : Abyan Izzah
* Deskripsi : Program penggunaan exception buatan sendiri, pengenalan klausa *	        'throw' dan 'throws'
*/

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if (angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka + " Bukan Angka Sial");
	}

	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//Method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati dalam memasukkan angka!!!!");
		}
	}
}

// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// tidak dieksekusi, dikarenakan yang dijalankan ketika terjadi eksepsi yang dimana dalam kasus ini adalah angka 13, maka program akan menjalankan throw new AngkaSialException yang akan memanggil AngkaSialException.java yang sudah dibuat tadi. Dibuktikan dengan message yang ada pada AngkaSialException.java
// Apakah baris 21 pada AngkaSial.java diatas dieksekusi?
// Dieksekusi, dikarenakan yang dijalankan ketika terjadi eksepsi yang dimana dalam kasus ini adalah angka 13, maka program akan menggunakan AngkaSialException yang di throws pada method cobaAngka sehingga program yang ada pada baris 21 akan berjalan. 
	