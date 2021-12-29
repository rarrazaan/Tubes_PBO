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
    
   public String getNamaObat() {
        return nama_obat;
    }

    public void setNamaObat(String nama_obat) {
        this.nama_obat = nama_obat;
    }
    
    public String getJenisObat() {
        return jenis_obat;
    }

    public void setJenisObat(String jenis_obat) {
        this.jenis_obat = jenis_obat;
    }
    
     public LocalDate getTanggalProduksi() {
        return tanggal_produksi;
    }

    public void setTanggalProduksi(LocalDate tanggal_produksi) {
        this.tanggal_produksi = tanggal_produksi;
    }
    
    public int getHargaObat() {
        return harga_obat;
    }

    public void setHargaObat(int harga_obat) {
        this.harga_obat = harga_obat;
    }
    
    public String getMasaBerlaku() {
        return masa_berlaku;
    }

    public void setMasaBerlaku(String masa_berlaku) {
        this.masa_berlaku = masa_berlaku;
    }
    
    public void displayObat() {
    
    }
    
}
