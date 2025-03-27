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
public class BankNasabahTabunganTest {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nasabahbank nasabah1 = new Nasabahbank("Tahfizh", "Habibie");
        Tabunganbank tabungan1 = new Tabunganbank(8000);
        nasabah1.setTabungan(tabungan1);

        Nasabahbank nasabah2 = new Nasabahbank("Tahfizh", "Habibie");
        Tabunganbank tabungan2 = new Tabunganbank(3000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung");
       
        tabungan1.simpanUang(6000);
        System.out.println("Setelah Tahfizh menabung 6000: " + tabungan1.getSaldo());

        tabungan2.simpanUang(9000);
        System.out.println("Setelah Habibie menabung 9000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");

        tabungan1.ambilUang(3000);
        System.out.println("Setelah Tahfizh mengambil 3000: " + tabungan1.getSaldo());

        tabungan2.ambilUang(4000);
        System.out.println("Setelah Habibie mengambil 4000: " + tabungan2.getSaldo());

        tabungan2.transfer(tabungan1, 2000);
        System.out.println("\nSetelah Tahfizh transfer 2000 ke Habibie:");
        System.out.println("Saldo Tahfizh: " + tabungan1.getSaldo());
        System.out.println("Saldo Habibie: " + tabungan2.getSaldo()); 
    }
    
}

