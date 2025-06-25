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
public class Silinder {

    private double r;
    private double tinggi;

    public Silinder() {
        this.r = 0.0;
        this.tinggi = 0.0;
    }

    public Silinder(double r, double tinggi) {
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
        return 3.14 * r * r * tinggi;
    }

    public double getLuas() {
        return 2 * 3.14 * r * (r + tinggi);
    }

    // Representasi string
    @Override
    public String toString() {
        return "\nSilinder:\n"+
               "jari-jari = " + r +
               "\nTinggi = " + tinggi +
               "\nVolume = " + getVolume() +
               "\nLuas permukaan = " + getLuas();
    }
}