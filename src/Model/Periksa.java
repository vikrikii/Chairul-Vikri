/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author chae
 */
public class Periksa {

    private String namaDokter;
    private String idPasien;
    private String tanggalPeriksa;
    private String diagnosa;
    private String resep;
    private String idPeriksa;

    public Periksa(Dokter d, Pasien p, String tanggalPeriksa, String diagnosa, String resep, String idPeriksa) {
        this.namaDokter = d.getNama();
        this.idPasien = p.getIDPasien();
        this.tanggalPeriksa = tanggalPeriksa;
        this.diagnosa = diagnosa;
        this.resep = resep;
        this.idPeriksa = idPeriksa;
              
    }

    public String getIDPeriksa(){
        return idPeriksa;
    }
    
    public String getNamaDokter() {
        return namaDokter;
    }
    
    public String getIDPasien() {
        return idPasien;
    }

    public String getTanggalPeriksa() {
        return tanggalPeriksa;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public String getResep() {
        return resep;
    }

    @Override
    public String toString() {
        String s = "Tanggal Periksa: " +  this.getTanggalPeriksa() +"\n"
                + "Indikasi : " + this.getDiagnosa() + "\n"
                + "Rekomendasi : " + this.getResep() + "\n";
        
        return s;
    }
}
