/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum270225;

import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args){
        //TODO code application logic here
        int n,i;
        Scanner in = new Scanner(System.in);
        System.out.println("===Program Pengulangan===");
        System.out.println("Masukkan bayak Pengulangan : ");
        n = in.nextInt();
        System.out.println("---Pengulangan For---");
        for(i=1;i<n;i++)
            System.out.print(i+"\t");
        //end for
        System.out.println("\n---Pengulangan While---");
        i=1;
        while(i<=n){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println("\n---Pengulangan do while---");
        i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }while(i <= n);
    }
}

