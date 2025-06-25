/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum270125;
import java.util.Scanner;
/**
 *
 * @author habibi
 */
public class Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[], n, i;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Banyak Data : ");
        n=in.nextInt();
        A=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.print("A["+i+"] = ");
            A[i] = in.nextInt();
        }
        
        int jumlah = 0;
        for(i=0;i<n;i++)
        {
            jumlah = jumlah+A[i];
        }
        float rata = (float)jumlah/n;
        System.out.println("==Isi Array==");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        System.out.print("\nJumlah : "+jumlah);
        System.out.print("\nRata - Rata : "+rata);
        
        System.out.println("==Isi Array Setelah Diurutkan Dari Yang Terkecil==");
        
        int max = A[0];
        int min = A[0];
        for(i=1;i<n;i++)
        { 
            if(A[i]>max)
            {
                max=A[i];
            }
            
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        
        int imax = 0;
        int imin = 0;
        for(i=1;i<n;i++)
        {
            if(A[i]>A[imax])
            {
                imax=i;
            }
            
            if(A[i]<A[imin])
            {
                imin=i;
            }
        }
        System.out.println("NILAI TERBESAR = "+max);
        System.out.println("NILAI TERBESAR = "+min);
        System.out.println("NILAI TERBESAR = "+A[imax]+" PADA INDEKS KE-"+imax);
        System.out.println("NILAI TERKECIL = "+A[imin]+" PADA INDEKS KE-"+imin);
    }
    
}
