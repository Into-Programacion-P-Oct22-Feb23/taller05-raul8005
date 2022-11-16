/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo;
        double precioventa;
        double impuesto;
        double impuesto1 = 20;
        double impuesto2 = 30;
        double impuesto3 = 15;
        double impuesto4 = 8;
        double valortotal;
        
        System.out.println("Ingrese la marca del vehiculo");
        marca = entrada.nextLine();
        
        System.out.println("ingrese el origen del vehiculo");
        origen = entrada.nextLine();
        
        System.out.println("Ingrese el costo del vehiculo");
        costo = entrada.nextDouble();
        
        
        
        if(origen.equals("Alemania")){
        impuesto = (costo * impuesto1) / 100;
        valortotal = costo + impuesto;
        System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valortotal);        
        }else{ 
        if(origen.equals("Japon")){
        impuesto = (costo * impuesto2) / 100; 
        valortotal = (costo + impuesto);
             System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valortotal);
        }
        if(origen.equals("Italia")){
        impuesto = (costo * impuesto3) / 100; 
        valortotal = (costo + impuesto);
        System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valortotal);       
        }else{
        if(origen.equals("USA")){
        impuesto = (costo * impuesto4) / 100;
        valortotal = (costo + impuesto);
        System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valortotal);       
            }
           }
           
        
        }
    
    }
}