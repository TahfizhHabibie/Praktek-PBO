/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum270525;

/**
 *
 * @author habibi
 */
public class Motor extends Kendaraan {
    private String jenisHelm;
    private int cc;
    
    public Motor(String merk, int tahun, String jenisHelm, int cc){
        super(merk, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }
    
    public String getJenisHelm(){
        return jenisHelm;
    }
    
    public void setJenisHelm(){
        this.jenisHelm = jenisHelm;
    }
    
    public int getCc(){
        return cc;
    }
    
    public void setJenisHelm(String jenisHelm){
        this.jenisHelm = jenisHelm;
    }

     
    
    public void setCc(int cc){
        this.cc = cc;
    }

    @Override
    public void nyalakan() {
       System.out.println("Motor "+ merk +" Dinyalakan dengan kunci.");
    }

    @Override
    public void matikan() {
        System.out.println("Motor "+ merk +" Dimatikan.");
    }

    @Override
    public void periksaKondisi() {
         System.out.println("Periksa rantai, oli mesin, dan rem motor "+ merk + ".");
    }
    
    @Override
    public void servis() {
        System.out.println("Motor "+ merk +" dijadwalkan servis setiap 3.000Km");
    }

    @Override
    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Jenis Helm: " + jenisHelm);
        System.out.println("CC: " + cc);
    }

            
}
