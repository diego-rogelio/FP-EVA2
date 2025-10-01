package eva2_2_switch;

import java.util.Scanner;


public class EVA2_2_SWITCH {

    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int opc;

    System.out.println("1. Consultar saldo, 2. Reitrar dinero, 3. Depositar dinero ");
    System.out.print("Selecciona una opcion del menu: ");
    opc= input.nextInt();
    switch(opc){  //el switch puede cambiar de estado, es como else if, se usa en caso simples cuando es solo una cosa a evaluar ej: 1,2,3. azul,rojo
        case 1:  //para elegir entre 1,2 y 3 se utiliza el case
            System.out.println("Elegiste consultar saldo");
            break;  //el break rompe con el codigo, en este caso del case 1 y del switch
        case 2:
            System.out.println("Elegiste retirar saldo");
            break;
        case 3:
            System.out.println("Elegiste depositar saldo");
            break;
        default: //default como es el ultimo no se necesita un break, se termina aqui, es como un ultimo else
            System.out.println("Opcion incorrecta"); 
            
    }
            
    }
    
}
