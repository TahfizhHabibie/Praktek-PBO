/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum270225;

/**
 *
 * @author habibi
 */
import java.util.Scanner;
public class ArrayDimensi {
    public static void main(String[] args){
        int A[],n,i;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Banyak data : ");
        n = in.nextInt();
        A = new int[n]; //Buat array ukuran n
        //Mengisi Array
        for(i=0;i<n;i++){
            System.out.print("A["+i+"] = ");
            A[i] = in.nextInt();
        }
        int jumlah = 0;
        //Hitung jumlah dan rata rata
        for(i=0;i<n;i++)
            jumlah=jumlah+A[i];
        //end for
        float rata = (float)jumlah/n;
        //tampilkan isi array dan hasil perhitungan
        System.out.println("==Isi Array==");
        for(i=0;i<n;i++)
            System.out.print(A[i]+"\t");
        //end for
        System.out.println("\nJumlah = "+jumlah);
        System.out.println("Rata-rata = "+rata);
        
        //Menentukan nilai terbesar dan terkecil versi 1
        System.out.println("\nMenentukan nilai terbesar dan terkecil");
        int max=A[0];
        int min=A[0];
        for(i=0;i<n;i++){
            if(A[i]>max){//Jika A[i] > Nilai max
                max=A[i];//nilai terbesarganti dengan A[i]
            }
            if(A[i]<min){//Jika A[i] < Nilai min
                min=A[i];//nilai terkecil ganti dengan A[i]
                //end if 
            }
        }
        int imax=A[0];//index awal tempat nilai terbesar dan terkecil
        int imin=A[0];
        for(i=0;i<n;i++){
            if(A[i]>A[imax]){//isi array index ke 1 > isi array index imax
                imax=A[i];//index posisi max berganti dengan i
            }
            if(A[i]<A[imin]){//isi array index ke 1 > isi array index imin
                imin=A[i];//index posisi min berganti dengan i
            }
        }
        System.out.println("Nilai Terbesar = "+max);
        System.out.println("Nilai Terkecil = "+min);
        System.out.println("Nilai Terbesar = "+A[imax]+" Pada Index ke-"+imax);
        System.out.println("Nilai Terkecil = "+A[imin]+" Pada Index ke-"+imin);
    }
}
