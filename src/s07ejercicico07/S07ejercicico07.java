/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicico07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicico07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese la distancia a recorrer: ");
        double distancia=input.nextDouble();
        System.out.println("ingrese millas por galon: ");
        double millasporgalon=input.nextDouble();
        System.out.println("ingrese precio del galon:");
        double precioporgalon=input.nextDouble();
        double costoviaje=(distancia/millasporgalon)*precioporgalon;
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
