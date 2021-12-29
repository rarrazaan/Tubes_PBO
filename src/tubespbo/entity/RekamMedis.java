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
public class RekamMedis {
    private String keluhan, pemeriksaan;
    private LocalDate tanggal_pemeriksaan;
    
    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    
    public String getPemeriksaan() {
        return pemeriksaan;
    }

    public void setPemeriksaan(String pemeriksaan) {
        this.pemeriksaan = pemeriksaan;
    }
    
    public LocalDate getTanggalPemeriksaan() {
        return tanggal_pemeriksaan;
    }

    public void setTanggalPemeriksaan(LocalDate tanggal_pemeriksaan) {
        this.tanggal_pemeriksaan = tanggal_pemeriksaan;
    }
    
    public void displayRekam() {
    
    }
}
