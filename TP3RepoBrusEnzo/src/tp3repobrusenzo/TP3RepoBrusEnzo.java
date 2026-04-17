
package tp3repobrusenzo;


public class TP3RepoBrusEnzo {

    
        public static void main(String[] args) {
     
        int contador = 0;
        
        while(contador < 100){
            System.out.println("Valor de contador = " + contador);
            //contador = contador + 1;
            contador++;
        }
        do {            
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 100);
  
        for(int c = 0; c <= 100; c ++){
            System.out.println("contador = " + c);
        }
    }
    
}


    

