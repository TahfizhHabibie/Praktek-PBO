/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum150425;

/**
 *
 * @author habibi
 */
public class PesawatDemo2 {
    public static void main(String[] args) {
        Pesawat[] daftarPesawat=new Pesawat[3];
        
        //Mengisi element array
        daftarPesawat[0]=new Pesawat("Lion Air",2015,true,80);
        daftarPesawat[1]=new Pesawat("Air Asia",2018,false,120);
        daftarPesawat[2]=new Pesawat("Air Asia",2020,true,180);
        
        //menampilkan isi array
        for(int i=0;i<daftarPesawat.length;i++){
            System.out.println("Data Pesawat ke"+(i+1)+"Adalah");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }
    
}
