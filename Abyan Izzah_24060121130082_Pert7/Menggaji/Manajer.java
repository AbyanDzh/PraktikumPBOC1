/* 
* Manajer.java 09/05/2023
* Nama      : Abyan Izzah / 24060121130082
* Deskripsi : Program Manajer
*/

public class Manajer extends Karyawan{
	private int tunjangan = 700000;

	public Manajer(String nama){
		setNama(nama); 
	}

	public void tampilData(){
		super.tampilData();
		System.out.println("Tunjangan = " + tunjangan);
	}

}