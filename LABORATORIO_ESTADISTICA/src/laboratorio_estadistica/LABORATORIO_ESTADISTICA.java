/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_estadistica;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author jerso
 */
public class LABORATORIO_ESTADISTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poblacion_Muestra  calc_PM = new Poblacion_Muestra();
        
        int opcion;
        
           
            JOptionPane.showMessageDialog(null, "ESTADISTICA 2");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO, INGRESE LA OPCION QUE DESEA REALIZAR\n" 
            + "1. poblacion y muestra\n "
            + "2. distribucion normal\n"
            + "3. Prueba de Hipotesis\n"
            + "4. Regresion Lineal simple y multiple\n"
            + "5. salir\n") );
            
            switch (opcion){
                case 1: 
                    JOptionPane.showMessageDialog(null, "BIENVENIDO A ESTDISTICA 2- TEMA POBLACION Y MUESTRA\n"
                            + "ingrese los datos que se solicitan");
                    calc_PM.leer_datos();
                    calc_PM.calc();
                case 2:
                case 3:
                case 4: 
                case 5:
            }
    }
    
}
