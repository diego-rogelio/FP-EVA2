package eva2_27_cuenta;

import java.util.Scanner;


public class EVA2_27_CUENTA {

   
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    int valor, cuenta =1000000;
    
    do{
        System.out.println("Cantidad a retirar");
        valor =input.nextInt();
        cuenta =cuenta -valor;
        System.out.println("Tu saldo es: " + cuenta);
    
    }while(cuenta > 0);
        
    
 }        
  
}

