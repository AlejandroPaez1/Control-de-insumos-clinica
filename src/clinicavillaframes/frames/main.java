/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicavillaframes.frames;

import javax.swing.JFrame;

/**
 *
 * @author ale_2
 */
public class main {

    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
      
      
    java.awt.EventQueue.invokeLater(new Runnable() {
        
        public void run() {
            new framePrin().setVisible(true);
            //framePrin conezion = new framePrin();
            // conezion.ConexionApost();

            //  conexionPostgres pruebaaa= new conexionPostgres();
            //pruebaaa.conexionPostgres();
            //pruebaaa.conexion();

           }
       });         
   }
}
    

