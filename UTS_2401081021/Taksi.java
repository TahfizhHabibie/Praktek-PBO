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
public class Taksi {
    /** SOAL A **/
    
    private int tarifAwal;
    private int tarifPerKm;
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }
    
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
    @Override
    public String toString() {
    return "Harga Awal: " + tarifAwal +
           "\nHarga Setelah: " + tarifPerKm;
    }
}
