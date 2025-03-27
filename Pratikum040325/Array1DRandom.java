/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum040325;

/**
 *
 * @author habibi
 */
import java.util.Scanner;
import java.util.Random;
public class Array1DRandom {
    public static void main(String[] args){
        int A[],n,i;
        int banyak = 0;
        int jumlah = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();
        A = new int[n]; //A ukuran n
        System.out.println("== Data Anda ==");
        for (i=0; i<n; i++)
        {
            A[i] = rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println("== Genap ==");
        for(i=0 ; i<n; i++)
        {
            if(A[i]%2==0)//Rumus untuk angka genap
            {
                System.out.print(A[i]+"\t");
                banyak++;//Mencari banyak genap
                jumlah = jumlah+A[i]; 
            }
            
        }  
         System.out.println("\nBnyak Genap = "+banyak);
         System.out.println("Jumlah Genap = "+jumlah);
         
         System.out.println();
    }
}