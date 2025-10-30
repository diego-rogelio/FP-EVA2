
package eva2_23_busqueda;

import java.util.Scanner;


public class EVA2_23_BUSQUEDA {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    int valor, posi = -1;    
    int datos[] = new int[10];
    
    
    
        for (int i = 0; i < datos.length; i++) {
            datos[i] =(int)(Math.random() * 100 );
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" +datos[i] + "]");           
        }
        System.out.println("");
        System.out.println("Valor a buscar:");
        valor= input.nextInt();
     
        //busqueda
        for (int i = 0; i < datos.length; i++) {
        if( valor ==datos[i]){ //Se encuentra el valor
        posi = i; //Se regresa la poscion de donde estaba
        break; //Se detiene la busqueda
        }
            
        }
        System.out.println("El valor esta en la posicion " +posi);
    }
    
}
