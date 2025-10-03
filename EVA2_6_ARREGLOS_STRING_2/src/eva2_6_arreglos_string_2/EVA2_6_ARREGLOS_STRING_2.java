
package eva2_6_arreglos_string_2;

import java.util.Scanner;

//misma practica que la 5, solo de manera diferente
public class EVA2_6_ARREGLOS_STRING_2 {

   
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int dia;
    //Tambien cuenta como arreglo, java ya pone en que posicion esta cada dia, segun la posicion de como se escribio
    // domingo es 0, lunes es 1, y asi sucesivamente
    String diasSemana [] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "viernes", "sabado"};  
    
    System.out.print("Numero del dia de la semana (0-6): ");
    dia = input.nextInt();
    System.out.println("El dia es: " + diasSemana[dia]); //con que el dia dado sea del 0-6, se da el valor conforme a la posicion del arreglo
        
    
    
   
    }
    
}
