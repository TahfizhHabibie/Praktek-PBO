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
import java.util.Scanner;
public class dinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================");
        System.out.println("UTS TAHFIZH_HABIBIE");
        System.out.println("2401081021");
        System.out.println("Teknik Komputer 1B");
        System.out.println("Kode Soal : A ");
        System.out.println("==========================\n");
        System.out.println("1. Kendaraan");
        System.out.println("2. Mobil");
        System.out.println("3. Taksi");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Kendaraan");
            Kendaraan l = new Kendaraan();
            System.out.println(l.toString());
        }
        if (pilihan == 2) {
            System.out.println("Mobil");
            Mobil l = new Mobil();
            System.out.println(l.toString());
        }
        if (pilihan == 3) {
            System.out.println("Taksi");
            Taksi l = new Taksi();
            System.out.println(l.toString());
        }
    }
}
    
