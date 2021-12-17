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
    
    // Setter
    public void setNamaPasien(String s){
        this.nama_pasien = s;
    }
    public void setGenderPasien(String s){
        this.gender_pasien = s;
    }
    public void setAlamatPasien(String s){
        this.alamat_pasien = s;
    }
    public void setUmurPasien(int x){
        this.umur_pasien = x;
    }
    public void setKontakPasien(int x){
        this.kontak_pasien = x;
    }
    
    // Getter
    public String getNamaPasien(){
        return nama_pasien;
    }
    public String getGenderPasien(){
        return gender_pasien;
    }
    public String getAlamatPasien(){
        return alamat_pasien;
    }
    public int getUmurPasien(){
        return umur_pasien;
    }
    public int getKontakPasien(){
        return kontak_pasien;
    }
}
