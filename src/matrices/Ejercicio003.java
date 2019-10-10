
package matrices;

import java.util.Scanner;

public class Ejercicio003 {

    
    public static void main(String[] args) {
    //pedimos al usuario ingresarla posicion del alfin
        System.out.print("\nIntroduzca la posición del alfil: ");
    // almacenamos con el metodo Scanner 
        Scanner entrada = new Scanner(System.in);
        
        String posicionAlfil =entrada.next();
    
    int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
    int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;
    
    
    System.out.println("El alfil puede trasladarse a las estas ubicaciones:");
    
    for(int fila = 8; fila >= 1; fila--) {
      for(int columna = 1; columna <= 8; columna++) {
        if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
              && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
          System.out.print((char)(columna + 96) + "" + fila + " ");
        }
      }
    }
    }
    
}
