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
public class Terapi {
    Pasien pasien;
    Dokter dokter;
    Obat obat;
    int durasi_terapi, biaya_terapi;
    LocalDate tanggal_terapi;
    
    public int getDurasiTerapi() {
        return durasi_terapi;
    }

    public void setDurasiTerapi(int durasi_terapi) {
        this.durasi_terapi = durasi_terapi;
    }
    
     public int getBiayaTerapi() {
        return biaya_terapi;
    }

    public void setDBiayaTerapi(int durasi_terapi) {
        this.biaya_terapi = biaya_terapi;
    }
    
    public LocalDate getTanggalTerapi() {
        return tanggal_terapi;
    }

    public void setTanggalTerapi(LocalDate tanggal_terapi) {
        this.tanggal_terapi = tanggal_terapi;
    }
    
    public void displayTerapi() {
    
    }
}
