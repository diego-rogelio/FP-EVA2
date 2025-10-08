package eva2_11_for;

import java.util.Scanner;


public class EVA2_11_FOR {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ini, fin, res;        
        
        System.out.println("Inicio:");
        ini= input.nextInt();
        
        System.out.println("Fin:");
        fin = input.nextInt();
        
        for(int i = ini; i >= fin; i--){
        res = i%2;
        if(res == 0){
            System.out.println(i + " - ");}
        }
    }
    
}
