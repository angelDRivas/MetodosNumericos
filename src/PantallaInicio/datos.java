
package PantallaInicio;

import java.util.Scanner;

/**
 *
 * @author jrgel
 */
public class datos {

    public String MostrarEcuacionIntroducida(float[] ecuacion){
        int i, longitud,grado;
        longitud = ecuacion.length;
        grado=longitud-1;
        String polinomio=""; 
    for(i=0; i<longitud-2;i++){
           
            polinomio = polinomio+Float.toString(ecuacion[i])+"x^"+Integer.toString(grado-i);
            
    
             if(ecuacion[i+1]>=0 && i<grado-2){
               polinomio = polinomio+"+";
       
             }
            
        }
        if(ecuacion[i]>=0){
               polinomio = polinomio+"+";
             }
        polinomio=polinomio+Float.toString(ecuacion[i])+"x";
        i=i+1;
         if(ecuacion[i]>=0){
               polinomio = polinomio+"+";
             }
        polinomio=polinomio+Float.toString(ecuacion[i]);
        
        return polinomio;
    }
}
