/** 
 *  File : DiskonLambda.java 31/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi :Ekspresi Lambda Dasar, Untuk Menghitung Diskon
**/

 interface IDiskon{
    public double hitungDiskon(int harga);

 }
 public class DiskonLambda{
    public static void main(String[] args){
        // tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon(){
        public double hitungDiskon(int harga){
                return harga  - (harga * 0.3);
            }
    };

    // dengan Lambda
    IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

    // dengan Lambda dengan blok statement
    IDiskon diskonBiasa = (harga) -> {
      return harga - (harga * 0.1);
    };

    System.out.println("Diskon Merdeka : " + diskonMerdeka.hitungDiskon(450000));
    System.out.println("Diskon Lebaran : " + diskonLebaran.hitungDiskon(450000));
    System.out.println("Diskon Biasa : " + diskonBiasa.hitungDiskon(450000));

 }
}

/*
 * Perbedaan antara diskonLebaran dan diskonBiasa saat diimplementasikan adalah pada diskonLebaran diimpelementasikan
 * tanpa menggunakan blok statement "{}", sehingga lebih sederhana dan lebih ringkas. Berbeda dengan diskonBiasa yang 
 * menggunakan blok statement "{}", biasanya lebih rumit dan kompleks sehingga lebih cocok digunakan pada algoritma 
 * yanglebih kompleks, seperti adanya if else, while, dll. Dalam kasus ini, lebih cocok menggunakan bentuk lambda 
 * pada diskonLebaran karena kasus yang diberikan tidak terlalu kompleks.
 */