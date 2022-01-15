/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;
import gui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class TubesPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        JFrame frame1;
        frame1 = new TambahPasien();
        frame1.setTitle("Puskesmas Management");
        frame1.setVisible(true);
    }
    
}
