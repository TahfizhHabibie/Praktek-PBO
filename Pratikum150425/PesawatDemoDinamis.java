/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum150425;
import java.util.Scanner;
/**
 *
 * @author habibi
 */
public class PesawatDemoDinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int i, jumlah, tahunProduksi, muatan;
        boolean mesin;
        String nama;
        String namaMax; //ini adalah pesawat dengan muatan maksimum
        int besar; //untuk menampung pesawat muatan banyak
        System.out.println("Masukkan banyak pesawat = ");
        jumlah = input.nextInt();
        input.nextLine();
        
        //deklarasi array
        Pesawat[] daftarPesawat = new Pesawat [jumlah];
        
        //isi array
        for(i=0; i<jumlah; i++){
            System.out.println("Input pesawat ke "+(i+1));
            System.out.print("Nama pesawat = ");
            nama = input.nextLine();
            System.out.print("Tahun peroduksi = ");
            tahunProduksi = input.nextInt();
            System.out.print("Menggunakan mesin ? (true/false) = ");
            mesin = input.nextBoolean();
            System.out.print("Kapasitas muatan penumpang maksimum = ");
            muatan = input.nextInt();
            
            input.nextLine();
            
            daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
        }
        System.out.print("\n\n DATA PESAWAT \n\n");
        System.out.println("Data Pesawat ke 1 adalah");
        daftarPesawat[0].cetak();
        System.out.println();
        besar = daftarPesawat[0].getMuatan();
        namaMax = daftarPesawat[0].getNama();
        
        for(i=1; i<jumlah;i++){
            System.out.println("Data Pesawat ke "+(i+1)+" adalah");
            daftarPesawat[i].cetak();
            if(daftarPesawat[i].getMuatan()>besar){
                besar = daftarPesawat[i].getMuatan();
                namaMax = daftarPesawat[i].getNama();
            }
            System.out.println();
        }
        
        System.out.print("Pesawat dengan muatan terbanyak adalah "+namaMax);
        System.out.print(" dengan kapasitas maksimum" +besar+ "orang");
                
    
    }
    
}
