
package eva2_16_arreglos_multdim;


public class EVA2_16_ARREGLOS_MULTDIM {

    
    public static void main(String[] args) {
                            //3 filas, 4 columnas
    int matriz [][] = new int [3][4];
    /*matriz [0][0] = 100;
    matriz [0][1] = 200;
    matriz [0][2] = 300;
    matriz [0][3] = 400;*/
        
    //ciclos anidados:
    for(int i = 0; i < matriz.length; i++){  //Filas
        
        for(int j = 0; j <4; j++){  //Columnas
         matriz [i] [j] = (int)(Math.random() * 100);
        
           }
              
        }
     for(int i = 0; i < matriz.length; i++){  //Filas
        
        for(int j = 0; j <4; j++){  //Columnas
        System.out.print("[" + matriz [i][j] + "]");
           
        }
         System.out.println("");
     
    }
        System.out.println(matriz.length);  // = 3  = 3 filas
        System.out.println(matriz[0].length); // la fila 0 tiene 4 columnas
        System.out.println(matriz[1].length); // la fila 1 tiene 4 columnas
        System.out.println(matriz[2].length); // la fila 2 tiene 4 columnas
   
    }
}
