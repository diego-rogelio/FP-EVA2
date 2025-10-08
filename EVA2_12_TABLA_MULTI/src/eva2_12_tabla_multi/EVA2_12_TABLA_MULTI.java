
package eva2_12_tabla_multi;

import java.util.Scanner;


public class EVA2_12_TABLA_MULTI {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inicial, multi;
    
        System.out.println("Ingresa tu numero a multiplicar:");
        inicial = input.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            multi = i*inicial;
            System.out.print(inicial);
            System.out.print("*");
            System.out.print(i);
            
            System.out.print("=");
            System.out.print(multi + " ");
            
        }
        
        
    }
    
}
