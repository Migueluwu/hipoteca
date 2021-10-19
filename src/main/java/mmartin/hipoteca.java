
package mmartin;

import java.util.Scanner;

/**
 *
 * @author 34616
 */
public class hipoteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MES_ANO=12;
        final int DURACION_MINIMA=5;
        final int DURACION_MAXIMA=30;
        final int PLAZO_EDAD =75;
        int edad;
        double sueldoMes;
        double sueldoAno;
        double hipoteca;
        int duracionHipoteca;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introudce tu edad: ");
        edad= entradaTeclado.nextInt();
        if(edad>=18 && edad<=65){
            System.out.println("introduce tu sueldo mensual en Euros: ");
            sueldoMes=entradaTeclado.nextDouble();
            sueldoAno=sueldoMes*MES_ANO;
            System.out.println("introduce de cuantos euros quieres la hipoteca: ");
            hipoteca=entradaTeclado.nextDouble();
            if((sueldoAno*5.85)>=hipoteca){
                System.out.println("introduce la duracion de la hipoteca: ");
                duracionHipoteca=entradaTeclado.nextInt();
                if(((duracionHipoteca>=DURACION_MINIMA)&&(duracionHipoteca<=DURACION_MAXIMA))
                        &&(duracionHipoteca+edad<=PLAZO_EDAD)){
                    System.out.println("hipoteca valida");
                }else{
                    System.out.println("duracion de la hipoteca demasidado larga");
                }
            }
            else{
                System.out.println("hipoteca demasiado alta para el sueldo del cliente");
            }
            
        }
        else{
            System.out.println("El cliente no es apto para pedir una hipoteca");
        }
    }
    
}
