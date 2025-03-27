/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum180325;

/**
 *
 * @author habibi
 */
import java.util.Scanner;
public class TextVehicleEnkapsulasi {
    public static void main(String[] args){
        System.out.println("Kendaraan 1. Beban maksimal 10.000Kg");
        VehicleEnkapsulasi kendaraan1 =  new VehicleEnkapsulasi(10000);
        
        //Menambah beban
        System.out.println("Menambahkan beban 1 (500Kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2 (250Kg)"+kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3 (5000Kg)"+kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4 (4000Kg)"+kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5 (350Kg)"+kendaraan1.addLoad(350));
        
        //Menampilkan beban kendaraan saat ini
        System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad()+"Kg");
        
        //Membuat objek kendaraan2 menggunakan konstruktor kosong
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2. Beban maksimal belum ada");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
        //Set maxLoad menggunakan method setMaxLoad
        kendaraan2.setMaxLoad(15000);
        //isi beban pada kendaraan
        System.out.print("Masukkan beban maksimal kendaraan : ");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
        //isi beban pada kendaraan
        System.out.print("Masukkan berat beban yang akan diletakkan di kendaraan 2 : "); 
        double beban = in.nextDouble();
        while(kendaraan2.addLoad(beban)){//default true
            System.out.println("Beban ditambahkan "+beban+" Kg");
            System.out.print("Masukkan berat beban yang ingin diletakkan di kendaraan 2 :  ");
            beban = in.nextDouble();
        }
        if(!kendaraan2.addLoad(beban)){//not true ====> false
            System.out.println("Beban kendaraan ini = "+kendaraan2.getLoad()+ "Kg");
            System.out.println("Beban akan berlebih. Penambahan beban dibatalkan ");
        }
        else 
            System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad()+"Kg");
    }
}
