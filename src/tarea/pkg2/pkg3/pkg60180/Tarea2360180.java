/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2.pkg3.pkg60180;

import java.util.Scanner;

/**
 *
 * @author RORLe
 */
public class Tarea2360180 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero del mes:");
        int mes=entrada.nextInt();
        switch (mes){
            case 1,2,3:
                System.out.println("PRIMER TRIMESTRE");
                break;
            case 4,5,6:
                 System.out.println("SEGUNDO TRIMESTRE");
                break;
            case 7,8,9:
                 System.out.println("TERCER TRIMESTRE");
                break;
            case 10,11,12:
                 System.out.println("CUARTO TRIMESTRE");
                break;
            default:
                 System.out.println("Numero incorrecto");
                    
        }
        
        
    }
    
}