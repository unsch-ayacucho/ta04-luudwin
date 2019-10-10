
package matrices;

import java.util.Scanner;

/**
 *
 * @author luudwin
 */
public class Ejercicio002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos un array de 4 filas y 5 columnas
        int[][] num = new int[4][5];     
        int fila;
        int columna;
    
    // Lee los datos de teclado
    System.out.println("Por favor, introduzca los números (enteros) en el array");
    //utilizamos instrucciones condicionales
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        Scanner entrada = new Scanner(System.in);
        
        num[fila][columna] = entrada.nextInt();
        
      }
    }
    // La siguiente intrucciones muestra los datos y las sumas parciales de las filas
    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    // esta instruccion Muestra las sumas parciales de las columnas
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
    }    
}