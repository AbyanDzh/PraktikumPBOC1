/** 
 * File      = operasiTitik.java 01/03/2023
 * Penulis   = Abyan Izzah Azzam Hastono
 * Deskripsi = Operasi dari program class Titik 
 *             
 */

public class operasiTitik {
        // Di private agar hanya bisa diakses di operasiTitik.java
        private void refleksiSumbuX(Titik titik){
            titik.setOrdinat(-titik.getOrdinat());
        }
        private void refleksiSumbuY(Titik titik){
            titik.setAbsis(-titik.getAbsis());
        }
        // Perantara untuk menjalankan fungsi refleksi ke kelas luar
        public Titik refleksiX(Titik titik){
            refleksiSumbuX(titik);
            return titik;
        }
        public Titik refleksiY(Titik titik){
            refleksiSumbuY(titik);
            return titik;
        }
    }

