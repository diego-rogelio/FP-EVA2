
package eva2_19_do_while;

import java.util.Scanner;


public class EVA2_19_DO_WHILE {
    final static String USUARIO = "Diego";
    final static String PASSWORD = "manolito123";
   
    public static void main(String[] args) {
    //1. Pedir datos de acceso
    Scanner input= new Scanner(System.in);
    String usu, contra;
    //2. Validar
    //Incorrecto = se vuele a preguntar
    //Correcto = Acceso concedido
    
    do{
        System.out.println("Usuario:");
        usu = input.nextLine();
        System.out.println("Contraseña:");
        contra = input.nextLine();
    }while(!(usu.equals(USUARIO) && contra.equals(PASSWORD)));    
    System.out.println("Acceso concedido");
        
    /*if(usu.equals(USUARIO) && contra.equals(PASSWORD))
            System.out.println("Acceso concedido");
        else */
        
    
        
    }
    
}
