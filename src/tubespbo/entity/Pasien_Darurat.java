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
public class Pasien_Darurat extends Pasien{
    private String ruangan_IGD;
    private int level;
    
   public String getRuanganIGD() {
        return ruangan_IGD;
    }

    public void setRuanganIGD(String ruangan_IGD) {
        this.ruangan_IGD = ruangan_IGD;
    }
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int ruangan_IGD) {
        this.level = level;
    }
}
