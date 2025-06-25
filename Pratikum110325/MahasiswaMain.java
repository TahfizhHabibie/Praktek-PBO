/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum110325;
import java.util.Scanner;
/**
 *
 * @author habibi
 */
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int uts, uas, tugas, quis;
        String nama;
        long nim;

        System.out.print("MASUKKAN NIM : ");
        nim = in.nextLong();
        in.nextLine();

        System.out.print("MASUKKAN NAMA  : ");
        nama = in.nextLine();

        System.out.print("NILAI UTS : ");
        uts = in.nextInt();

        System.out.print("NILAI UAS : ");
        uas = in.nextInt();

        System.out.print("NILAI TUGAS : ");
        tugas = in.nextInt();

        System.out.print("NILAI QUIs : ");
        quis = in.nextInt();  
        
        Mahasiswa mah = new Mahasiswa(nim, nama, uts, uas, tugas, quis);
        mah.tampildata();
        mah.konversi();

        in.close();
    
    }
    
}
