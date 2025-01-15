

/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. 
 * Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. 
 * A la función se la debe llamar desde un método principal. Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * @author Daniel Matute
 */

import java.util.Scanner;

public class Ejercicio3 {

    // Método principal
    public static void main(String[] args) {
        double valor1, valor2,valor3,valor4;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el primer valor decimal:");
        valor1 = tcl.nextDouble();
        System.out.println("Ingrese el segundo valor decimal:");
        valor2 = tcl.nextDouble();        
        System.out.println("Ingrese el tercer valor decimal:");
        valor3 = tcl.nextDouble();       
        System.out.println("Ingrese el cuarto valor decimal:");
        valor4 = tcl.nextDouble();        
        String resultado = calcularPromedioCualitativo(valor1, valor2, valor3, valor4);
        System.out.println("El promedio cualitativo es: " + resultado);
        
        tcl.close();
    }
  
    public static String calcularPromedioCualitativo(double decimal1, double decimal2, double decimal3, double decimal4){
        double promedio = (decimal1 + decimal2 + decimal3+decimal4) / 4;

        if (promedio <= 5) {
            return "Regular";
        } else if (promedio <= 8) {
            return "Bueno";
        } else if (promedio <= 9) {
            return "Muy Bueno";
        } else {
            return "Sobresaliente";
        }
    }
}
/*
run-single:
Ingrese el primer valor decimal:
2.2
Ingrese el segundo valor decimal:
2.2
Ingrese el tercer valor decimal:
2.3
Ingrese el cuarto valor decimal:
2.3
El promedio cualitativo es: Regular
BUILD SUCCESSFUL (total time: 8 seconds)

*/