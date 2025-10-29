package eva2_18_while;


public class EVA2_18_WHILE {

    
    public static void main(String[] args) {
    int i = 1;
        System.out.println("while:");
    while( i<=10 ){ //Se repite si la condicion es verdadera
        System.out.println("Un elefante se columpiaba");
        i++;
    }
        System.out.println("do while:");
    i = 1; //se reinicia pq despues del while quedo en 11
    do{
        System.out.println("Un elefante se comlumpiaba");
        i++;
    }while(i <= 10);
        
    }
    
}
