
package eva2_22_continue;


public class EVA2_22_CONTINUE {

    
    public static void main(String[] args) {
        //Imprimir numeros pares
    int i =  0;
    while(i<100){
        int resi = i % 2;
        
        if(resi != 0){ //No es divisible entre dos, el residuo NO es cero
            i++;
            continue;  //Ve que no es divisible asi que esa accion se interrumpe y sigue con el siguiente numero
        }
        System.out.print(i + " - ");
        i++;
        
    }

    }
    
}
