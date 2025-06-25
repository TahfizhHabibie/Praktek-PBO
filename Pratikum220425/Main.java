/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum220425;

/**
 *
 * @author habibi
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bangun:");
        System.out.println("1. Lingkaran");
        System.out.println("2. Kerucut");
        System.out.println("3. Silinder");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();
            Lingkaran l = new Lingkaran(r);
            System.out.println(l);
        } else if (pilihan == 2) {
            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();
            Kerucut k = new Kerucut(r, t);
            System.out.println(k);
        } else if (pilihan == 3) {
            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();
            Silinder s = new Silinder(r, t);
            System.out.println(s);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}



