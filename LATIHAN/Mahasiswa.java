/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *
 * @author habibi
 */
public class Mahasiswa {
     String nama;
    String nim;
    float uts, uas, tugas, quiz;
    float na = 0;
    char huruf;
    
    public Mahasiswa(String nm, String n, float t, float q, float ut, float ua){
        this.nama = nm;
        this.nim = n;
        this.tugas = t;
        this.quiz = q;
        this.uts = ut;
        this.uas = ua;
        this.na = (float)(0.25 * tugas + 0.15 * quiz + 0.30 * uts + 0.35 * uas);
    }
    //method tanpa parameter
    public void TampilData(){
        System.out.println("=========================");
        System.out.println("==Rekap Nilai Mahasiswa==");
        System.out.println("=========================");
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nim            : "+nim);
        System.out.println("Nilai Tugas    : "+tugas);
        System.out.println("Nilai Quiz     : "+quiz);
        System.out.println("Nilai UTS      : "+uts);
        System.out.println("Nilai UAS      : "+uas);
        
        this.na = (float)(0.25 * tugas + 0.15 * quiz + 0.30 * uts + 0.35 * uas);
        NilaiAkhir(this.na);
        System.out.println("Nilai Akhir    : "+na);
        System.out.println("Akreditasi     : "+huruf);
    }
    public void NilaiAkhir(float na){
        if(na >80 && na <=100){
            huruf = 'A';
        }
        else if(na >=65 && na <=80){
            huruf = 'B';
        }
        else if(na >=55 && na <=65){
            huruf = 'C';
        }
        else if(na >=40 && na <55){
            huruf ='D';
        }
        else if(na <40){
            huruf = 'E';
        }
    }
    public void cekstatus(){
        if(na >=70){
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if(na <70){
            System.out.print("MAAF ANDA GAGAL DAN HARUS MENGULANG");
        }
    }
}
