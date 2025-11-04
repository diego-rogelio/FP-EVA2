package eva2_25_piramide;

import java.util.Scanner;

public class EVA2_25_PIRAMIDE {

    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int valor;
    
        System.out.println("Cuatas filas se quieren?");
    valor = input.nextInt();
    

        for(int i = 1; i <= valor; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for(int i = valor - 1; i >= 1; i--){     
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
   

