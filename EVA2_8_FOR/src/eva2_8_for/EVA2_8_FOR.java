
package eva2_8_for;


public class EVA2_8_FOR {

   
    public static void main(String[] args) {
       
        //for se usa para ciclos, necestia tres parametros:
        //1. Variable y un valor de inicio, se puede poner dentro del for: "for (int i = 1;...), o por fuera:
        int i;
        //2. Hasta donde se llega (condicion --> tiene que ser verdadera), cuando es falso el for se detiene
        //3. Si incrementa ((++) se suma UNO) o decrementa ((--) se resta UNO)
        //Para incrementar o decrementar de mas numeros se usa: += num y -= num
        
        //Se incrementa de uno a uno hasta llegar a 10, se imprime 10 veces hola mundo
        for (i = 1; i<=10; i++ ){
            System.out.println("Hola mundo :D ");
        }           
        //Se decrementa de uno a uno hasta llegar a 1, se imprime 10 veces hola mundo
        for ( i =10; i>= 1; i--){
            System.out.println("Hola mundo :D ");
    
    }
            
        
        
    }
    
}
