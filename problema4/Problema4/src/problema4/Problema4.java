/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int dias;
        double preciodiario;
        double valordescuento;
        double descuento1 = 10;
        double descuento2 = 15;
        double descuento3 = 20;
        double subtotalpagar;
        double totalpagar;
        
        
        System.out.println("ingrese el numero de dias que se hospedo");
        dias = entrada.nextInt();
        
        System.out.println("Ingrese el precio diario de la habitacion");
        preciodiario = entrada.nextDouble();
        
        subtotalpagar = preciodiario * dias;
        
        if(dias > 5){
            valordescuento = (subtotalpagar * descuento1) / 100;
            totalpagar = subtotalpagar - valordescuento;
            System.out.printf("El subtotal es: \n%f\nEl descuento es: \n%f"
                    + "\nEl total por pagar es: \n%f", subtotalpagar, 
                    valordescuento, totalpagar);
        }
        else{
            if(dias > 10){
            valordescuento = (subtotalpagar * descuento2) / 100;
            totalpagar = subtotalpagar - valordescuento;
            System.out.printf("El subtotal es: \n%f\nEl descuento es: "
                    + "\n%f\nEl total a pagar es: \n%f", subtotalpagar,
                    valordescuento, totalpagar);  
        } else{
            if(dias > 15){
            valordescuento =(subtotalpagar * descuento3) / 100;
            totalpagar = subtotalpagar - valordescuento;
            System.out.printf("El subtotal es: \n%f\nEl descuento es: "
                    + "\n%2f\n El total a pagar es: \n%f", subtotalpagar,
                    valordescuento, totalpagar);
            }
            }
        }
    }
    
}
