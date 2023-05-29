/** 
 *  File : Lingkaran.java 17/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : implementasi Lingkaran sebagai BangunDatar
**/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}
