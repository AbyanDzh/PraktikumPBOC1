/** 
 *  File : BangunDatarGeneric.java 17/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : kelas konstruksi generic untuk BangunDatar
**/

public class BangunDatarGeneric<Dzg extends BangunDatar> {
    private Dzg bangunDatar;
    
    public void set(Dzg tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public Dzg get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/**
 * // Jawaban
 * Walaupun diubah dari T ke Dzg, tidak akan terlalu berpengaruh ke dalam code. Dikarenakan T/Dzg hanya berperan sebagai 
 * pembatas tipe objek yang dapat digunakan dalam suatu kelas, yang dimana dalam kasus ini adalah kelas BangunDatarGeneric. 
 * //
 **/


