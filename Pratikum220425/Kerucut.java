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
public class Kerucut {
    
    private double r;
    private double tinggi;

    public Kerucut() {
        this.r = 0.0;
        this.tinggi = 0.0;
    }

    public Kerucut(double r, double tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return (1.0 / 3.0) * 3.14 * r * r * tinggi;
    }

    public double getLuas() {
        double s = Math.sqrt((r * r) + (tinggi * tinggi));
        return 3.14 * r * (r + s);
    }

    @Override
    public String toString() {
        return "\nKerucut:\n"+
               "jari-jari = " + r +
               "\nTinggi = " + tinggi +
               "\nVolume = " + getVolume() +
               "\nLuas permukaan = " + getLuas();
    }
}


