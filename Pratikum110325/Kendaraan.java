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
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    //constructor
    public Kendaraan(String j,String m,int t,String w){
        this.jenis = j;
        this.merk = m;
        this.tahun = t;
        this.warna = w;
    }
    //method tanpa parameter
    public void InfoKendaraan(){
        System.out.println("Jenis Kendaraan = "+jenis);
        System.out.println("Merk Kendaraan = "+merk);
        System.out.println("Warna Kendaraan = "+warna);
        System.out.println("Tahun Keluaran = "+tahun);
    }
    //method dengan parameter
    public void CekHarga(int harga){
        System.out.println("Harga Sewa Kendaraan Rp "+harga);
    }
    
    public void CekKecepatan(int speed){
        if(speed >20 && speed <40){
            System.out.println("Slow");
        }else if(speed < 60){
            System.out.println("Medium");
        }else if(speed < 85){
            System.out.println("Fast");
        }else if(speed > 85){
            System.out.println("Pembalap");
        }else if(speed < 20){
            System.out.println("lambat kali");
        }
    }
}
