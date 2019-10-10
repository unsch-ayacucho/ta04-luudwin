
 
package matrices;

/**
 *
 * @author luudwin
 */
public class Ejercicio001 {

   
    public static void main(String[] args) 
       
        throws InterruptedException {
    // declarando una matriz de 6x10
    int[][] num = new int[6][10];
    
    int fila;
    int columna;
    /* Integer.MAX_VALUE, Integer.MIN_VALUE; permite identifiacar valores
      maximos y minimos en la matriz
    */
    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        num[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%5d ", num[fila][columna]);
        Thread.sleep(100);
        
        //a siguiente instruccion Calcula el máximo y guarda sus coordenadas
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        
        // la siguiente instruccion Calcula el máximo y guarda sus coordenadas
                
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println("│");
    }
    System.out.print("    └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }

    System.out.println("┘\n\nEl valor Maximo es:  " + maximo + " esta ubicado en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El valor mínimo es " + minimo + " y está ubicadoen  fila " + filaMinimo + ", columna " + columnaMinimo);
    }
    
}
