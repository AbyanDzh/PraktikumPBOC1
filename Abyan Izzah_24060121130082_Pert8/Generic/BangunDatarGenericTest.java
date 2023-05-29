/** 
 *  File : BangunDatarGenericTest.java 17/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : main class untuk generic BangunDatar
**/

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l;
        l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bngdtr;
        bngdtr = new BangunDatarGeneric<Lingkaran>();
        bngdtr.set(l);
        System.out.println("keliling Lingkaran = " + bngdtr.hitungKeliling() );
        System.out.println("tipe generic = " + bngdtr.get().getClass().getName());

    }
}
