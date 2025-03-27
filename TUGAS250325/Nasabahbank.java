/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS250325;

//Tahfizh Habibie
//2401081021

/**
 *
 * @author habibi
 */
public class Nasabahbank {
    private final String namaAwal;
    private final String namaAkhir;
    private Tabunganbank tabungan;
    
    public Nasabahbank(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public void setTabungan(Tabunganbank tabungan){
        this.tabungan = tabungan;
    }
    
    public Tabunganbank getTabungan() {
        return tabungan;
    }
    
    @Override
    public String toString() {
        //return namaAwal + " " + namaAkhir + " - " + (tabungan != null ? 
        //tabungan.toString() : "Tidak ada tabungan");
        if (tabungan != null){
            return namaAwal + " " + namaAkhir + " - " + tabungan.toString();
        } else {
            return namaAwal + " " + namaAkhir + " - Tidak ada tabungan";
        }
    }
}
