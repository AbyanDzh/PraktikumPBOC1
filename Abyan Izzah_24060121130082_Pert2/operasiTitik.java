/** 
 * File      = operasiTitik.java 01/03/2023
 * Penulis   = Abyan Izzah Azzam Hastono
 * Deskripsi = Operasi dari program class Titik 
 *             
 */

 public class operasiTitik {
        private void refleksiSumbuX(Titik titik){
            titik.setOrdinat(-titik.getOrdinat());
        }
        private void refleksiSumbuY(Titik titik){
            titik.setAbsis(-titik.getAbsis());
        }
        public void refleksiX(Titik titik){
            refleksiSumbuX(titik);
        }
        public void refleksiY(Titik titik){
            refleksiSumbuY(titik);
        }
    }
    

