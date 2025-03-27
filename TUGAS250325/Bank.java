/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS250325;

//Tahfizh habibie
//2401081021

/**
 *
 * @author habibi
 */
public class Bank {
      private Nasabahbank[] nasabah;
    private int jumlahNasabah;
    
    public Bank() {
        nasabah = new Nasabahbank[100]; // Maksimum 100 nasabah
        jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir){
        nasabah[jumlahNasabah++] = new Nasabahbank(namaAwal, namaAkhir);
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir, Tabunganbank tabungan){
        Nasabahbank n = new Nasabahbank(namaAwal, namaAkhir);
        n.setTabungan(tabungan);
        nasabah[jumlahNasabah++] = n;
    }
    
    public int getJumlahNasabah() {
        return jumlahNasabah;
    }
    
    public Nasabahbank getNasabah(int indeks){
        return (indeks >= 0 && indeks < jumlahNasabah)? nasabah[indeks]: null;
    }
    
    public int searchNasabah(String namaAwal, String namaAkhir){
        for (int i = 0; i < jumlahNasabah; i++) {
            if (nasabah[i].toString().contains(namaAwal + " " + namaAkhir)) {
            return i;
            }
        }
        return-1;
    }
    
    public int[] searchNasabah(String namaAwal){
        int[] hasil = new int[jumlahNasabah];
        int count = 0;
        for (int i = 0; i < jumlahNasabah; i++) {
            if (nasabah[i].toString().contains(namaAwal)) {
                hasil[count++] = i;
            }
        }
        return java.util.Arrays.copyOf(hasil, count);
    }
}
