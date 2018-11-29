/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author chae
 */
public class Pasien {

    private String nama;
    private Periksa[] riwayatPeriksa ;
    private int jumlahPeriksa ;
    private String idPasien;

    
    public Pasien(String id, String nama) {
        this.nama = nama;
        this.idPasien = id;
        this.riwayatPeriksa = new Periksa[100];
    }

    public String getIDPasien(){
        return idPasien;
    }

    public String getNama() {
        return nama;
    }

    public String getResepTerakhir() {
        if (this.jumlahPeriksa >= 0 ) {
            return riwayatPeriksa[jumlahPeriksa].getResep();
            
        } else {
            return "Pasien belum pernah diperiksa.";
        }
    }

    public String getDiagnosaTerakhir() {
        if (this.jumlahPeriksa >= 0 ) {
            return riwayatPeriksa[jumlahPeriksa].getDiagnosa();
            
        } else {
            return "Pasien belum pernah diperiksa.";
        }
        
    }

    public String getTanggalTerakhirPeriksa() {
        if (this.jumlahPeriksa >= 0 ) {
            return riwayatPeriksa[jumlahPeriksa].getTanggalPeriksa();
        } else {
            return "Pasien belum pernah diperiksa.";
        }
    }

    public int getJumlahPeriksa() {
        return jumlahPeriksa;
    }

    public Periksa getPeriksa(int i) {
        return riwayatPeriksa[i];
    }

    public void setJumlahPeriksa(int jumlahPeriksa) {
        this.jumlahPeriksa = jumlahPeriksa;
    }
    
    public void addPeriksa(Dokter d, Pasien p, String tanggal, String diagnosa, String resep, String idPeriksa) {
        Periksa entry = new Periksa(d, p, tanggal, diagnosa, resep,idPeriksa);        
        this.riwayatPeriksa[jumlahPeriksa] = entry;
        this.jumlahPeriksa++;
        
    }

    public Periksa[] getListPeriksa() {
        return riwayatPeriksa;
    }

    @Override
    public String toString() {
        String s = "Tanggal Periksa: " +  this.getTanggalTerakhirPeriksa() +"\n"
                + "Indikasi : " + this.getDiagnosaTerakhir() + "\n"
                + "Rekomendasi : " + this.getResepTerakhir() + "\n";

        return s;
    }
}
