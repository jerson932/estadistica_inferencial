/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_estadistica2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jerso
 */
public class ESTADISTICA2_MAIN extends JFrame {
    
    public static void main(String[] args) {
        
        int opcion;
        int opcaux1;
        
           
            JOptionPane.showMessageDialog(null, "ESTADISTICA 2");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO, INGRESE LA OPCION QUE DESEA REALIZAR\n" 
            + "1. poblacion y muestra\n "
            + "2. distribucion normal\n"
            + "3. Prueba de Hipotesis\n"
            + "4. Regresion Lineal simple y multiple\n"
            + "5. salir\n") );
            
            switch (opcion){
                case 1:
                    int opc;
                    opc = Integer.parseInt(JOptionPane.showInputDialog("PARA REALIZAR EL LA POBLACION Y MUESTRA HAY 2 OPCIONES, SELECCIONE\n" 
            + "1. poblacion y muestra finito\n "
            + "2. poblacion y muestra infinito\n"
            + "3. salir"));
                      switch(opc){
                          case 1: 
                              PM_finita f  = new PM_finita();
                                f.setVisible(true);
                          case 2:
                              PM_infinita f_2  = new PM_infinita();
                                f_2.setVisible(true);
                          case 3:
                              
                          
                      }
                                
                   
                    
                       
                case 2:
                case 3:
                case 4: 
                case 5:
            }
            
    }
    
}
