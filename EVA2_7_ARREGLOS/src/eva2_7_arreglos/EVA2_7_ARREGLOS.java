
package eva2_7_arreglos;


public class EVA2_7_ARREGLOS {

    
    public static void main(String[] args) {
        String cade  = "Hola mundo";
        //los strings cuentan como arreglos
        
        System.out.println("El primer caracter de Hola mundo es: " + cade.charAt(0)); 
        //el charAt da el num de caracter que se indique, segun su posicion. Lo devuelve en char
        
        char caracter = cade.charAt(9); 
        System.out.println("El noveno caracter de Hola mundo es: " + caracter);
        System.out.println("Hola mundo tiene una longitud de: " + cade.length() + " caracteres");
       
        
        
    }
    
}
