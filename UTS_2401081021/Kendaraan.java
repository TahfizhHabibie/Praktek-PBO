/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_2401081021;

/**
 *
 * @author habibi
 */

public class Kendaraan {
    /** SOAL A **/
    
    private int jmlRoda;
    private String Warna;
    
    public void setJmlRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    
    public int getJmlRoda(){
        return jmlRoda;
    }
    
    public void setWarna(String Warna){
         this.Warna = Warna;
    }
    
    public String getWarna(){
        return Warna;
    }
    
   @Override
   public String toString(){
        return "\nJumlah Roda: " + jmlRoda + 
           "\nWarna: " + Warna;
    }
}
