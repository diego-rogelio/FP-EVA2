package eva2_26_factorial;

import java.util.Scanner;


public class EVA2_26_FACTORIAL {

    
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
    int valor, factorial = 1;
    
        System.out.println("Valor:");
    valor = input.nextInt();
    
    for(int i =1; i<=valor; i++){
        factorial =factorial *i;
    }
        System.out.println("Factorial de " +valor + " es: " + factorial);
    }
    
}
