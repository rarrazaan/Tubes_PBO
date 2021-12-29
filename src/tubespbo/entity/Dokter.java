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
public class Dokter {
    private String nama_dokter, gender_dokter, alamat_dokter;
    private String spesialis, catatan;
    private int kontak;
    
    public String getNamaDokter() {
        return nama_dokter;
    }

    public void setNamaDokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }
    
    public int getKontakDokter() {
        return kontak;
    }

    public void setKontakDokter(int kontak) {
        this.kontak = kontak;
    }
    
    public String getGenderDokter() {
        return gender_dokter;
    }

    public void setGenderDokter(String gender_dokter) {
        this.gender_dokter = gender_dokter;
    }
    
    public String getAlamatDokter() {
        return alamat_dokter;
    }

    public void setAlamatDokter(String alamat_dokter) {
        this.alamat_dokter = alamat_dokter;
    }
    
    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
    
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
}
