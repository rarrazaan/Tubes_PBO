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
    
    // Setter
    public void setNamaDokter(String s){
        this.nama_dokter = s;
    }
    public void setKontakDokter(int x){
        this.kontak = x;
    }
    public void setGenderDokter(String s){
        this.gender_dokter = s;
    }
    public void setAlamatDokter(String s){
        this.alamat_dokter = s;
    }
    public void setSpesialis(String s){
        this.spesialis = s;
    }
    public void setCatatan(String s){
        this.catatan = s;
    }
    
    // Getter
    public String getNamaDokter(){
        return nama_dokter;
    }
    public String getGenderDokter(){
        return gender_dokter;
    }
    public int getKontakDokter(){
        return kontak;
    }
    public String getAlamatDokter(){
        return alamat_dokter;
    }
    public String getSpesialis(){
        return spesialis;
    }
    public String getCatatan(){
        return catatan;
    }
}
