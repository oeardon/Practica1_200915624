/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas_200915624;

import java.util.Scanner;

/**
 *
 * @author Oscar Estuardo Ardón Castillo
 */
public class Buscaminas_200915624 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inic = new Scanner(System.in);
        boolean salir = false;
        String opini;
        
        System.out.println("\nOscar Estuardo Ardón Castillo");
        System.out.println("Carnet: 200915624");
        System.out.println("Práctica 1 - IPC1 ''A'' ");
        System.out.println("\n*** BUSCAMINAS ***\n");
        System.out.println("-- Presione enter para iniciar --");
        opini = inic.nextLine();
        
        while(!salir) { 
            int opcion;
            Scanner opc = new Scanner(System.in);
                       
            System.out.println("*** BUSCAMINAS ***\n");
            System.out.println("1. Principiante");
            System.out.println("2. Intermedio");
            System.out.println("3. Experto");
            System.out.println("4. Salir\n");
            System.out.println("Elija una opción");
            opcion = opc.nextInt();
            
            switch(opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese un número entre 1 y 4.");
            }
        }
    }
    
}
