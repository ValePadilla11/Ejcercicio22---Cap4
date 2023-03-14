/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22.cap4;

import java.util.Scanner;
public class Ejercicio22Cap4 {

    public static void main(String[] args) {
        double SALXH, NUMH;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese los nombres del trabajador: ");
        String NOM = input.nextLine();

        System.out.print("Ingrese salario basico por hora: ");
        SALXH = input.nextDouble();
        
        System.out.print("Ingrese el numero de horas trabajadas al mes: ");
        NUMH = input.nextDouble();
        
        double SALM = SALXH * NUMH;
        if (SALM > 450000){
           System.out.print("Nombre: "+NOM ); 
           System.out.print("\nSalario mensual: $"+SALM);
        } else{
            System.out.print("Nombre: "+NOM);
        }
        input.close();    
        
    }
    
}
