/** 
 * File      = Titik.java 22/02/2023
 * Penulis   = Abyan Izzah Azzam Hastono
 * Deskripsi = Program class Titik
 */

class Titik{
    double absis;
    double ordinat;
    static int counterTitik; //Menghitung Objek Titik


    Titik(double a, double b){
        counterTitik++;
        absis = a;
        ordinat = b;
    }

    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    void setAbsis(double a){
        absis = a;
    }
    void setOrdinat(double b){
        ordinat = b;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    static int getcounterTitik(){
        return counterTitik;
    }
}

