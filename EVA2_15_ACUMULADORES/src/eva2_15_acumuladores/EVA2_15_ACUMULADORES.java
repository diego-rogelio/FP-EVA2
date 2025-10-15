package eva2_15_acumuladores;


public class EVA2_15_ACUMULADORES {


    public static void main(String[] args) {
    //Acumulador:
    //++ -- += -= *= /=
    int cuenta= 0;
    
    System.out.println(cuenta);
    
    //Asignacion ---> =    El = se toma como asignacion
    cuenta = cuenta + 100;  //Acumulador
        System.out.println(cuenta);   
        
    cuenta = cuenta + 1000;    
        System.out.println(cuenta);
        
    cuenta = cuenta - 800;    
        System.out.println(cuenta);
        
    cuenta += 2000; //es lo mismo que cuenta = cuenta + 2000    
        System.out.println(cuenta);    
        
        
    }
    
}
