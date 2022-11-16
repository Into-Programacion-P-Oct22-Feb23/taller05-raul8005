/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorpedido;
        double cantidadpedido;
        double preciounidad = 0;
        double descuento = 20;
        double valordescuento;
        
        System.out.println("Ingrese la cantidad del pedido");
        cantidadpedido = entrada.nextDouble();
        
        System.out.println("Ingrese el precio por unidad");
        preciounidad = entrada.nextDouble();
        
        valorpedido = (cantidadpedido * preciounidad);
        
        if(cantidadpedido > 50){
            
            valordescuento = (valorpedido * descuento) / 100;
            
            valorpedido = (valorpedido - valordescuento);
            
        }
        
        System.out.printf("El valor del pedido es:" +valorpedido);
    }
    
}
