/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum220425;

/**
 *
 * @author habibi
 */
public class Lingkaran {
    
    private double r;
    
    public Lingkaran(){
        this.r = 0.0;
    }
    
    public Lingkaran(double r){
        this.r = r;
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double getR(){
        return r;
    }
    
    public double getDiameter(){
       return 2 * r;
    }
    
    public double getKeliling(){
        return 2 * 3.14 * r;
    }
    
    public double getLuas(){
        return 3.14 * r * r;
    }
    
    @Override
    public String toString(){
        return "\nLingkaran:\n"+
               "jari-jari = " + r +
               "\nDiameter = " + getDiameter() +
               "\nKeliling = " + getKeliling() +
               "\nLuas = " + getLuas();
    }
}
