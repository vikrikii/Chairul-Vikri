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
    private ArrayList<Periksa> riwayatPeriksa ;

    private String idPasien;

    
    public Pasien(String id, String nama) {
        this.nama = nama;
        this.idPasien = id;
        this.riwayatPeriksa = new ArrayList<Periksa>();
    }

    public String getIDPasien(){
        return idPasien;
    }

    public String getNama() {
        return nama;
    }

    public String getResepTerakhir() {
        if (riwayatPeriksa.size() > 0 ) {
            return riwayatPeriksa.get(riwayatPeriksa.size()-1).getResep();
            
        } else {
            return "Pasien belum pernah diperiksa.";
        }
    }

    public String getDiagnosaTerakhir() {
        if (riwayatPeriksa.size() > 0 ) {
            return riwayatPeriksa.get(riwayatPeriksa.size()-1).getDiagnosa();
            
        } else {
            return "Pasien belum pernah diperiksa.";
        }
        
    }

    public String getTanggalTerakhirPeriksa() {
        if (riwayatPeriksa.size() > 0 ) {
            return riwayatPeriksa.get(riwayatPeriksa.size()-1).getTanggalPeriksa();
        } else {
            return "Pasien belum pernah diperiksa.";
        }
    }

    public int getJumlahPeriksa() {
        return riwayatPeriksa.size();
    }

    public Periksa getPeriksa(int i) {
        return riwayatPeriksa.get(i);
    }
    
    public void clearRiwayat(){
        riwayatPeriksa.clear();
    }
    
    public void addPeriksa(Dokter d, Pasien p, String tanggal, String diagnosa, String resep, String idPeriksa) {
        Periksa entry = new Periksa(d, p, tanggal, diagnosa, resep,idPeriksa);        
        this.riwayatPeriksa.add(entry);
        
    }

    public Periksa[] getListPeriksa() {
        Periksa[] rp = new Periksa[riwayatPeriksa.size()];
        for(int i = 0 ; i < riwayatPeriksa.size() ; i++){
            rp[i] = riwayatPeriksa.get(i);
        }
        
        return rp;
    }

    @Override
    public String toString() {
        String s = "Tanggal Periksa: " +  this.getTanggalTerakhirPeriksa() +"\n"
                + "Indikasi : " + this.getDiagnosaTerakhir() + "\n"
                + "Rekomendasi : " + this.getResepTerakhir() + "\n";

        return s;
    }
}
