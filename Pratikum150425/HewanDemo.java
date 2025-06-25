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
public class HewanDemo {
    public static void main(String[] args){
        //buat objek
        Hewan hewanumum = new Hewan("Makhluk hidup");
        Kucing kucingku = new Kucing("Boby");
        Anjing anjingku = new Anjing("Timmy");
        
        hewanumum.TampilkanNama();
        hewanumum.Suara();
        
        System.out.println();
        
        kucingku.TampilkanNama();
        kucingku.Suara();
        
        System.out.println();
        
        anjingku.TampilkanNama();
        anjingku.Suara();
    }
}
