/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_2401081021;

/**
 *
 * @author habibi
 */
public class Mobil {
    /** SOAL A **/
    
    private int kapasitasMesin;
    private String bahanBakar;
    
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public String getBahanBakar(){
        return bahanBakar;
    }
    
    public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
    @Override
    public String toString() {
    return "Bahan Bakar: " + bahanBakar +
           "\nKapasitas Mesin: " + kapasitasMesin;
}
}

