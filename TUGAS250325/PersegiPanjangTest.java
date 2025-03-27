/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS250325;

/**
 *
 * @author habibi
 */
public class PersegiPanjangTest {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Jumlah objek saat ini: "+PersegiPanjang.getJumlahObjek());
        
        // Membuat objek pertama dengan konstruktor default
        PersegiPanjang pp1 = new PersegiPanjang();
        // Menetapkan nilai panjang dan lebar
        pp1.setPanjang(10);
        pp1.setLebar(9);
        
        // Menampilkan informasi objek pertama
        System.out.println("Objek : "+PersegiPanjang.getJumlahObjek());
        System.out.println("Panjang: " + pp1.getPanjang());
        System.out.println("Lebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjang.getJumlahObjek());
        System.out.println();
        
        // Membuat objek kedua dengan konstruktor berparameter
        PersegiPanjang pp2 = new PersegiPanjang(7, 4);
        
        // Menampilkan informasi objek kedua
        System.out.println("Objek : "+PersegiPanjang.getJumlahObjek());
        System.out.println("Panjang: " + pp2.getPanjang());
        System.out.println("Lebar: " + pp2.getLebar());
        System.out.println("Luas: " + pp2.getLuas());
        System.out.println("Keliling: " + pp2.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjang.getJumlahObjek());
        System.out.println();
    }
    
}

