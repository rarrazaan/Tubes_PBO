/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo.entity;

/**
 *
 * @author DELL
 */
public class Pasien {
    String nama_pasien, gender_pasien, alamat_pasien;
    int umur_pasien, kontak_pasien;
    
    public String getNamaPasien() {
        return nama_pasien;
    }

    public void setNamaPasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }
    
    public String getGenderPasien() {
        return gender_pasien;
    }

    public void setGenderPasien(String gender_pasien) {
        this.gender_pasien = gender_pasien;
    }
    
    public String getAlamatPasien() {
        return alamat_pasien;
    }

    public void setAlamatPasien(String alamat_pasien) {
        this.alamat_pasien = alamat_pasien;
    }
    
    public int getUmurPasien() {
        return umur_pasien;
    }

    public void setUmurPasien(int umur_pasien) {
        this.umur_pasien = umur_pasien;
    }
    
    public int getKontakPasien() {
        return kontak_pasien;
    }

    public void setKontakPasien(int kontak_pasien) {
        this.kontak_pasien = kontak_pasien;
    }
}
