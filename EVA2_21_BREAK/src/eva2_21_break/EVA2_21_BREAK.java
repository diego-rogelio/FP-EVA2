
package eva2_21_break;

import java.util.Scanner;

public class EVA2_21_BREAK {

 
    public static void main(String[] args) {
        
     Scanner input= new Scanner(System.in);
     int valor, adivinar;
     adivinar =(int)(Math.random() * 5) + 1; //Numeros entre 1 y 5
     while(true){
         System.out.println("Adivina el numero. -1 para terminar ");
         valor = input.nextInt();
         
         if(valor == adivinar){
             System.out.println("Adivinaste :D");
             break;
         }
         
         if(valor== -1){
             break;} //Termina por completo el ciclo
    }
        System.out.println("Gracias por jugar :) ");
    }
    
}
