/** 
 * File      = MOperasiTitik.java 01/03/2023
 * Penulis   = Abyan Izzah Azzam Hastono
 * Deskripsi = Kelas yang berisi main dari OperasiTitik
 *             
 */
public class MOperasiTitik {
    public static void main(String[] args){
        Titik titik1 = new Titik();
        operasiTitik o = new operasiTitik();


        titik1.setAbsis(2);
        titik1.setOrdinat(3);


        System.out.println("Absis dan ordinat dari t1 adalah :" + " " + titik1.getAbsis() +  " " + "," + " " + titik1.getOrdinat());
        o.refleksiX(titik1);
        System.out.println("Refleksi sumbu X adalah :" + " " + titik1.getAbsis() +  " " + "," + " " + titik1.getOrdinat());
        o.refleksiY(titik1);
        System.out.println("Refleksi sumbu X adalah :" + " " + titik1.getAbsis() +  " " + "," + " " + titik1.getOrdinat());


        // Jika dinoaktifkan, maka program tidak ke run 

        /* 
        o.refleksiSumbuX(titik1);
        o.refleksiSumbuY(titik1);
        */ 
}
}
