
package eva2_10_for;

import java.util.Scanner;


public class EVA2_10_FOR {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //numeros del 1 al 20
        for(int i = 1; i<=20; i++){
            System.out.print(i + ",");
               
        }
       
        //numeros pares del 0 al 100
        System.out.println("");
        for(int i = 0; i<=100; i+=2){
            System.out.print(i + ",");
                               
        }
        
        //numeros pares del 100 al 0
        System.out.println("");
        for(int i = 100; i>=0; i-=2){
            System.out.print(i + ",");
        }
        
        //numeros entre dos numeros
        int num1, num2, mult;
        System.out.println("");
        System.out.println("Numeros entre dos numeros");
        System.out.print("Ingresar primer numero (positivo): ");
        num1 = input.nextInt();
        System.out.print("Ingresar segundo numero (negativo): ");
        num2 = input.nextInt();
        for(int i = num2; i<=num1; i++){
            System.out.print(i + ",");
        }
        
        //numeros entre dos numeros (inverso)
        System.out.println("");
        System.out.println("Numeros entre dos numeros");
        System.out.print("Ingresar primer numero (negativo): ");
        num1 = input.nextInt();
        System.out.print("Ingresar segundo numero (positivo): ");
        num2 = input.nextInt();
         
        for(int i = num1; i>=num2; i--){
            System.out.print(i + ",");
        }
        
        //imprimir tabla multiplicar
        System.out.println("");
        System.out.println("Cual tabla de multiplicar deseas? (1-10)");
        mult =input.nextInt();
        
        for(int i = mult; i<=mult*10; i+=mult){
            System.out.print(i + ",");
        }
    }
    
}
