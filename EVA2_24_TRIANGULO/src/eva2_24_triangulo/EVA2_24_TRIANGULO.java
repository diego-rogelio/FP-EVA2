
package eva2_24_triangulo;

import java.util.Scanner;


public class EVA2_24_TRIANGULO {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int valor;
    
        System.out.println("Cuatas filas se quieren?");
    valor = input.nextInt();
    
    for(int i =1; i<=valor; i++){
    
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println("");
            
        }           
        
    }
    
}
