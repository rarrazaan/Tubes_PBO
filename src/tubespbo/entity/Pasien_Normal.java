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
public class Pasien_Normal extends Pasien {
    private String ruang_rawat;
    
    public String getRuanganRawat() {
        return ruang_rawat;
    }

    public void setRuanganRawat(String ruang_rawat) {
        this.ruang_rawat = ruang_rawat;
    }
}
