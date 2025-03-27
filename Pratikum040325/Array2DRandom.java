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
public class Array2DRandom {
    public static void main(String[] args){
        int M[][], N[][], Hasil[][];
        int i,j,b,k,b2,k2;
        Scanner in=new Scanner(System.in);
        Random random = new Random();
        System.out.print("Masukkan jumlah baris 1= ");
        b = in.nextInt();
        System.out.print("Masukkan jumlah kolom 1= ");
        k = in.nextInt();
        System.out.print("Masukkan jumlah baris 2= ");
        b2 = in.nextInt();
        System.out.print("Masukkan jumlah kolom 2= ");
        k2 = in.nextInt();
        M = new int[b][k];//Mengisi 2 d secara random
        N = new int[b][k];
        System.out.println("=== Matriks 1===");
        for(i=0;i<b;i++)
        {
            for(j=0;j<k;j++)
            {
                M[i][j]=random.nextInt(100)+1;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("=== Matriks 2 ===");
        for(i=0;i<b2;i++)
        {
            for(j=0;j<k2;j++)
            {
                N[i][j]=random.nextInt(100)+1;
                System.out.print(N[i][j]+"\t");
            }
            System.out.println();
        }
        if(b==b2 && k==k2){
            Hasil=new int[b][k];
            System.out.println("==Hasil Penjumlahan Matriks==");
            for(i=0;i<b;i++){
                for(j=0;j<k;j++){
                Hasil[i][j]= M[i][j] + N[i][j];
                System.out.print(Hasil[i][j]+"\t");
            }
            System.out.println();
            }
        }
        else{
            System.out.println("Ukuran Matriks beda, tidak");
        }
   }
}
