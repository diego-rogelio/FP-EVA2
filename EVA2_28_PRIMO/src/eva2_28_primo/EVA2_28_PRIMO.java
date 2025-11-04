
package eva2_28_primo;

import java.util.Scanner;


public class EVA2_28_PRIMO {

  
    public static void main(String[] args) {
     int num1;
        
        Scanner input= new Scanner(System.in);
        System.out.print("Insertar numero: ");
        num1 = input.nextInt();
        
        
        
        for (int i = 2; i < num1; i++ ){
        if (num1 % i == 0){
            System.out.println("El numero: " + num1 + " no es primo");
            return;
        }
         
        }
        System.out.println("El numero: " + num1 + " es primo"); 
        
    }
    
}

    
    

