/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum110325;

/**
 *
 * @author habibi
 */
import java.util.Scanner;

public class AksiKendaraan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        String warna;
        int tahun;
        int harga;
        int speed;
        
        System.out.println("=======DATA KENDARAAN=======");
        System.out.print("Masukkan Jenis Kendaraan = ");
        jenis=in.nextLine();
        System.out.print("Masukkan Merk Kendaraan = ");
        merk=in.nextLine();
        System.out.print("Warna Kendaraan = ");
        warna=in.nextLine();
        System.out.print("Tahun Keluaran = ");
        tahun=in.nextInt();
        System.out.print("Harga Sewa Kendaraan = ");
        harga=in.nextInt();
        System.out.print("Kecepatan tempuh = ");
        speed=in.nextInt();
        
        //objek baru -- class Kendaraan
        Kendaraan kend=new Kendaraan(jenis,merk,tahun,warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.CekKecepatan(speed);
        System.out.println();
    }
}
