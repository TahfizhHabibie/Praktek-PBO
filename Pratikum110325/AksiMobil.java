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
public class AksiMobil {
    public static void main(String[] args){
        //buat objek baru
        Mobil mobilku=new Mobil();
        mobilku.merk="Toyota";
        mobilku.plat="BA 0806 L";
        mobilku.tahun=2006;
        mobilku.warna="Hitam";
        
        Mobil mobilmu=new Mobil();
        mobilmu.merk="Avanza";
        mobilmu.plat="BA 09 P";
        mobilmu.tahun=2023;
        mobilmu.warna="merah";
        
        System.out.println("--------------");
        System.out.println("Data Mobil 1:");
        System.out.println("Merk Mobil = "+mobilku.merk);
        System.out.println("Plat Mobil = "+mobilku.plat);
        System.out.println("Tahun Keluaran = "+mobilku.tahun);
        System.out.println("Warna Mobil = "+mobilku.warna);
        ///Panggilan Method
        mobilku.MobilAktif();//tanpa return
        System.out.println(mobilku.SuaraMobil());//return
        
        System.out.println("--------------");
        System.out.println("Data Mobil 2:");
        System.out.println("Merk Mobil = "+mobilmu.merk);
        System.out.println("Plat Mobil = "+mobilmu.plat);
        System.out.println("Tahun Keluaran = "+mobilmu.tahun);
        System.out.println("Warna Mobil = "+mobilmu.warna);
    }
}
