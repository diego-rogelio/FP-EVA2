
package eva2_14_captura;

import java.util.Scanner;


public class EVA2_14_CAPTURA {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int tama;
    
    System.out.println("Cuantas calificaciones se van a capturar?");
    tama = input.nextInt();
    
    int cali[] = new int[tama];
    
    //capturar
    for(int i = 0; i < cali.length; i++){
        System.out.println("Calificacion " + (i+1) + ":");
        cali[i] = input.nextInt();
    }    
    //leer
     for(int i = 0; i < cali.length; i++){
        System.out.print("[" + cali[i] + "]");
        
    }
        
        
    }
    
}
