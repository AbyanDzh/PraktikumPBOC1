/* 
* AngkaSialException.java 01/04/2023
* Nama      : Abyan Izzah
* Deskripsi : Eksepsi buatan sendiri, menolak masukkan angka 13
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena sial !!!");
	}
}
