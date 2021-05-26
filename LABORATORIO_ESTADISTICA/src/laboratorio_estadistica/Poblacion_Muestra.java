/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_estadistica;

import javax.swing.JOptionPane;

/**
 *
 * @author jerso
 */
public class Poblacion_Muestra {
    //atributos
    int n ; //tamaño de muestra buscado
    int N;  //tamaño de poblacion o universo
    int Z;  // parametro estadistico que depende el nivel de confianza (NC)
    int e;  //erro de estimacion maximo aceptado
    int p;  //probabilidad  de que ocurra el evento estudiado (exito)
    
    //metodos
    //metodo para solicitar los valores
    public void  leer_datos(){
        
      n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de muestra"));
      N = Integer.parseInt(JOptionPane.showInputDialog("ingrese la poblacion"));
      Z = Integer.parseInt(JOptionPane.showInputDialog("ingrese el nivel de confianca (NC)"));
      e = Integer.parseInt(JOptionPane.showInputDialog("ingrese el error aceptado"));
      p = Integer.parseInt(JOptionPane.showInputDialog("ingrese  la probabilidad de que ocurra el evento estudiado"));
      
    }
    //metodo
    public void  calc(){
        
        System.out.println(JOptionPane.showInputDialog("el valor de n es " + n
        + "\nel valor de N es " + N
        + "\nel valor de Z es " + Z
        + "\nel valor de e es " + e
        + "\nel valor de p es " + p ));
        JOptionPane.showMessageDialog(null, "\n la formula para calular la muestra finita es ");
        
        
    }
    
}
