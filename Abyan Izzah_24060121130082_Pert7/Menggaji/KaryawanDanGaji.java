/* 
* KaryawanDanGaji.java 09/05/2023
* Nama      : Abyan Izzah / 24060121130082
* Deskripsi : Program Aplikasi dari Karyawan, Manajer, Payroll dan Programmer
*/

public class KaryawanDanGaji{
	public static void main(String[] args) {
		Karyawan kr1 = new Programmer("Mira");
		Karyawan kr2 = new Manajer("Joko");
		Karyawan kr3 = new Manajer("Argo");

		Payroll payroll = new Payroll();
		payroll.cetakGaji(kr1);
		payroll.cetakGaji(kr2);
		payroll.cetakGaji(kr3);
	}
}