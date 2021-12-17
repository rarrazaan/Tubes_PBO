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
    
    // Setter
    public void setLevel(int x){
        this.level = x;
    }
    public void setRuanganIGD(String s){
        this.ruangan_IGD = s;
    }
    
    // Getter
    public int getLevel(){
        return level;
    }
    public String getRuanganIGD(){
        return ruangan_IGD;
    }
}
