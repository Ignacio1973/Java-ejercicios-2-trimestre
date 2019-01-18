/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class EjemplosConsola {
    //Declaro un array de ints de instancia 
    int[]listaNumeros ={200, 31, 27, 2, 5, 99};
    
   
     //El metodo maximo va a calcular el maximo y el segundo maximo de la lista de numero
    private int[] maximos (int[] lista){
        //declaramos un array de dos elementos para guardar el maximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[0]};
        for(int i=1; i< lista.length; i++){
            if (listaMaximos[0] <= lista[i]){
                //si llega aqui es que el numero que estoy comparando 
                //es mayor o igual que el que tengo primero  en la lista de maximos 
                if (i!=0){
                listaMaximos[1] = listaMaximos[0]; //desplazo a la derecha, el que había como máximo.
                }
               listaMaximos[0]= lista[i]; //pongo en la primera posición al nuevo máximo 
            }
            else if ( lista[i]>=listaMaximos[1]){ //compruebo si el numero que estoy leyendo es mayor que el segundo de la lista de maximos
               listaMaximos[1] = lista[i]; 
            }
        }
        return listaMaximos;
    }
      
    private boolean palindromo(String cadena){
       //Primera fase: Creo un nuevo string, que sea una copia del anterior, del que me pasan pero 
       //quitándole los espacios en blanco 
       String auxiliar = ""; 
       for(int i=0; 1< cadena.length(); i++){
           if (cadena.charAt(i)!= ' '){
                auxiliar = auxiliar + cadena.charAt(i);
               
           }
       }
       //ahora en auxiliar tengo el string pero sin espacios en blanco 
       //declaro dosn indices para que digan que posiciónes estoy comparando  
       int indiceIZQ =0;
       int indiceDER = auxiliar.length()-1;
       //mientras sean iguales los caracteres en esas posiciones, la palabra será un Palindromo
       //En el momento en el que una de esas comparaciones falle es que no es un Palindromo
       
       //A demás si el indice izquierdo es mayor que el derecho, ya he chequeado toda la frase
       while(auxiliar.charAt(indiceIZQ)== auxiliar.charAt(indiceDER) && indiceIZQ<= indiceDER){
           indiceIZQ++;
           indiceDER--;
       }  
       boolean resultado = true;
       if (indiceIZQ < indiceDER){ // si esto se cumple es que la palbra no es un palíndromo
           resultado = false;
       }
       
       
     return true; //TODO: Hay que cambiar esto luego para que funcione bien.    
    }
            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        System.out.println(ejercicios.listaNumeros[2]);
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)) ) ;
        
        
        
        System.out.println(ejercicios.palindromo ("ACASO HUBO BUHOS ACA"));
        
       // System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)) ) ;
     
    }
    
}