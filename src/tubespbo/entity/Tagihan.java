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
public class Tagihan extends Terapi{
    Terapi terapi;
    private int total_biaya;
    private LocalDate tanggal_pembayaran;
    
    public LocalDate getTanggalPembayaran() {
        return tanggal_pembayaran;
    }

    public void setTanggalPembayaran(LocalDate tanggal_pembayaran) {
        this.tanggal_pembayaran = tanggal_pembayaran;
    }
    
    public void totalBiaya() {
    
    }
    
    public void displayTagihan() {
    
    }
}
