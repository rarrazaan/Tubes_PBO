/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo.entity;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Obat {
    private String nama_obat, jenis_obat, masa_berlaku;
    private int jumlah_obat, harga_obat;
    private LocalDate tanggal_produksi;
    
    // Setter
    public void setNamaObat(String s){
        this.nama_obat = s;
    }
    public void setJenisObat(String s){
        this.jenis_obat = s;
    }
    public void setMasaBerlaku(String s){
        this.masa_berlaku = s;
    }
    public void setJumlahObat(int x){
        this.jumlah_obat = x;
    }
    public void setHargaObat(int x){
        this.harga_obat = x;
    }
    public void setTanggalProduksi(LocalDate date){
        this.tanggal_produksi = date;
    }
    
    // Getter
    public String getNamaObat(){
        return nama_obat;
    }
    public String getJenisObat(){
        return jenis_obat;
    }
    public String getMasaBerlaku(){
        return masa_berlaku;
    }
    public int getJumlahObat(){
        return jumlah_obat;
    }
    public int getHargaObat(){
        return harga_obat;
    }
    public LocalDate getTanggalProduksi(){
        return tanggal_produksi;
    }
    
    
}
