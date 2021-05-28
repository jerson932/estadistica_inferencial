/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_estadistica2;

/**
 *
 * @author jerso
 */
public class nivelconfianza {
    String [] Tconfianza ={"0.997:0.03",
                           "0.99:0.0258",
                           "0.98:0.0233",
                           "0.96:0.0205",
                           "0.95:0.0196",
                           "0.90:0.01645",
                           "0.80:0.0128",
                           "0.50:0.0674"};
    public double Vconfianza (String value){
         String valor="";
    boolean resultado;
    for(int i=0; i<Tconfianza.length;i++){
        resultado = Tconfianza[i].contains(value);
        if(resultado){
            valor=Tconfianza[i];
        }        
    }    
    
    
    String string = valor;
    String[] parts = string.split(":");//split nos permite dividir una palabra por medio del limitador
    String part1 = parts[0];
    String part2 = parts[1]; 

    return Double.parseDouble(part2) ;//devolviendo con decimal
    }
        
        
    }

