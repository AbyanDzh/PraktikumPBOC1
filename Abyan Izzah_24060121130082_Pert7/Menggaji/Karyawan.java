/* 
* Karyawan.java 09/05/2023
* Nama      : Abyan Izzah / 24060121130082
* Deskripsi : Program Karyawan
*/

public class Karyawan{
	private String nama;
	private int gajiPokok = 5000000;

	public void setNama(String nama){
		this.nama = nama; 
	}

	public void tampilData(){
		System.out.println("Nama = " + this.nama + ", Gaji pokok = " + gajiPokok);
	}
}

