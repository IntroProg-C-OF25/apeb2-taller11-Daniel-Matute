
/**
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares y 
 * el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s) 
 * deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas); 
 * además el método debe recibir como parámetro un arreglo bidimensional.
 * @author Daniel Matute
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFilas=0, limColum=0;
        System.out.print("Dame el limte de las filas y las columnas: ");
        limFilas = tcl.nextInt();
        limColum= tcl.nextInt();
        int matriz[][]= new int[limFilas][limColum];
        generarMatriz(matriz);
         System.out.println("Matriz Generada: ");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromedios(matriz);
    }
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=(int) (Math.random()*10);
            }
        }
    }
    public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void presentarParImparMatriz(int matriz[][]){
        System.out.println("Elementos Pares");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2==0)? matriz[i][j]+(" "):"");  
                //if((matriz[i][j]%2)==0)
                //System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Elementos Impares");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2!=0)? matriz[i][j]:"");
            }
            System.out.println("");
        }
    }
    public static void presentarPromedios(int matriz[][]){
        int sumaMatriz=0, promMatriz=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               sumaMatriz+= matriz[i][j];
            }
        }
        promMatriz=sumaMatriz/(matriz.length*matriz[0].length);
        System.out.println("Promedio de la Matriz: "+ promMatriz);
    }
}
