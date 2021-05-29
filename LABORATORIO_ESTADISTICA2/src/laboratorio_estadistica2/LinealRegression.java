

package laboratorio_estadistica2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.math.plot.Plot2DPanel;
import org.math.plot.Plot2DPanel;


public class LinealRegression {
    double[] x={1, 2, 3, 5, 7, 8, 12, 13, 16, 18}; //datos de x
    double[] y={1.3, 3.4, 5.4, 7.2, 10.3, 9.3, 8.9, 11, 13, 12}; //datos de y
    SimpleRegression sr=new SimpleRegression(); //calcular la regresion lineal
    Plot2DPanel plot=new Plot2DPanel(); //mostrar grafica
    JTextArea resultados=new JTextArea(); //Mostrat resultados
    
    
    public LinealRegression(){
        for(int i=0;i<x.length;i++){
            sr.addData(x[i],y[i]);// adicionar datos
        }
        double[] yc=new double[y.length];
        for(int i=0;i<x.length;i++){
            yc[i]=sr.predict(x[i]); //calcular las ys
        }
        plot.addLegend("South");
        plot.addScatterPlot("Datos",x, y);
        plot.addLinePlot("Regresion", x, yc);
        
        BaseLabel titulo= new BaseLabel("Distribucion Linela", Color.BLUE, 0.5,1.1);
        
        
        //Variables estadisticas
        resultados.setBackground(Color.LIGHT_GRAY);
        resultados.append("Datos leidos: "+sr.getN());
        resultados.append("\nOrdenada al origen: "+sr.getIntercept());
        resultados.append("\nValor minimo: "+StatUtils.min(y));
        resultados.append("\nValor maximo: "+StatUtils.max(y));
        resultados.append("\nPromedio: "+StatUtils.mean(y));
        
        
        
        JFrame frame=new JFrame("Regresioni Lineal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.add(plot,BorderLayout.CENTER);
        frame.add(resultados,BorderLayout.SOUTH);
        frame.setVisible(true);
        
    }
    public static void main(String[] args){
        new LinealRegression();
    }

    private void setBackground(Color LIGHT_GRAY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class StatUtils {

        private static String max(double[] y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String min(double[] y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String mean(double[] y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void variance(double[] y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public StatUtils() {
        }
    }
}
