
/**
 *Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 *
 * @author Daniel Matute
 */
import java.util.Random;

public class Ejercicio5 {

    // Método principal 
    public static void main(String[] args) {
        int n = 3, suma, resta, producto;
        int[][] matriz = new int[n][n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        suma = sumarMatriz(matriz);
        resta = restarMatriz(matriz);
        producto = multiplicarMatriz(matriz);

        System.out.println("La suma de la matriz es: " + suma);
        System.out.println("La resta de la matriz es: " + resta);
        System.out.println("El producto de la matriz es: " + producto);
    }

    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static int restarMatriz(int[][] matriz) {
        int resta = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resta -= matriz[i][j];
            }
        }
        return resta;
    }

    public static int multiplicarMatriz(int[][] matriz) {
        int producto = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                producto *= matriz[i][j];
            }
        }
        return producto;
    }
}
/*
run-single:
Matriz generada:
3 6 9 
4 4 8 
6 5 5 
La suma de la matriz es: 50
La resta de la matriz es: -50
El producto de la matriz es: 3110400
BUILD SUCCESSFUL (total time: 1 second)

*/