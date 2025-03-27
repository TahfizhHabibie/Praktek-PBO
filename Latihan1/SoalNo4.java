/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author habibi
 */
import java.util.Random;
import java.util.Scanner;
public class SoalNo4 {
     public static void main(String[] args) {
        int n;
        
        Scanner in = new Scanner(System.in);
        System.out.print("input angka pola: ");
        n = in.nextInt();
        
        int i, j;
        
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == j)
                    System.out.print("0");
                else 
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
