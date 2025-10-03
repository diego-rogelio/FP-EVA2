
package eva2_4_arreglos;


public class EVA2_4_ARREGLOS {

   
    public static void main(String[] args) {
        //un arreglo guarda una cantidad grande de datos
        int arreglo[] = new int [5] ; //para que sea arreglo se pone []. Es como el scanner se necestia crear con el "new"
                        //el 5 es para que almacene 5 enteros, esto ocupa 20 bytes = 5 x 4 bytes que ocupa cada entero
        //cada entero esta en una posicion
        //primera posicion --> 0
        //ultima posicion --> size - 1, en este caso 4
        arreglo [0] = 100;  //aqui se pone el numero 100 en la posicion 0 del arreglo
        arreglo [1] = 200;
        arreglo [2] = 300;
        arreglo [3] = 400;
        arreglo [4] = 500;
        //Para leer el arreglo
        System.out.println("Arreglo [0] = " + arreglo [0]);
        System.out.println("Arreglo [1] = " + arreglo [1]);
        System.out.println("Arreglo [2] = " + arreglo [2]);
        System.out.println("Arreglo [3] = " + arreglo [3]);
        System.out.println("Arreglo [4] = " + arreglo [4]);
        
    }
    
}
