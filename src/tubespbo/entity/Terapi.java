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
    
}
