/* 
* Programmer.java 09/05/2023
* Nama      : Abyan Izzah / 24060121130082
* Deskripsi : Program Programmer
*/

public class Programmer extends Karyawan{
	private int bonus = 450000;

	public Programmer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.println("Bonus = " + bonus);
	}
}