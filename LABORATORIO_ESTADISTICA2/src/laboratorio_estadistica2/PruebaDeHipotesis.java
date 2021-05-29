
package laboratorio_estadistica2;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.inference.TestUtils;

/**
 *
 * @author dsm
 */
public class PruebaDeHipotesis 
{
    public double zp;
    public double zt;
    public double zr;
    public double h0;
    public double h1;
    public double u;
    public double s;
    public double alpha;
    public boolean acepta;
    public double n;
    public double media;
    public int tipo;
    
    
    NormalDistribution nD;
    
    public PruebaDeHipotesis(double u, double s,double media,double n,double alpha,int tipo, double za)
    {
        this.u = u;
        this.s = s;
        this.media = media;
        this.n = n;
        this.alpha = alpha;
        h0 = u;
        this.tipo = tipo;
        nD = new NormalDistribution(u,s,alpha);
        zr = za;
        
    }
    public PruebaDeHipotesis()
    {
        
    }
  
    
    /**
     * corre el modelo de distribucion normal y cambia las variables del sistema
     */
    @SuppressWarnings("fallthrough")
    public void run()
    {
        switch(tipo){
            case 0:
                    zt =(media-u)/(s/Math.sqrt(n));  
                    if( (zr*-1) >= zt && (zr < zt) )
                    {
                        acepta = false;
                    }else{
                        acepta = true;
                    }
            case 1:
                    zt = (media-u)/(s/Math.sqrt(n));
                    if( (zr*-1) >= zt)
                    {
                        acepta = false;
                    }else{
                        acepta = true;
                    }
            case 2: 
                    zt = (media-u)/(s/Math.sqrt(n));
                    if( zr < zt)
                    {
                        acepta = false;
                    }else
                    {
                        acepta = true;
                    }
        }
        
    }

}

