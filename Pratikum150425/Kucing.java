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
public class Kucing extends Hewan{
    public Kucing(String nama){
        super(nama);
    }
    
    public void Suara(){
        System.out.println(nama+"Bersuara : Meongg!!!");
    }
    
    public void TampilkanNama(){
        System.out.println(nama+"Bersuara : Guk Guk !!!!");
    }
}
