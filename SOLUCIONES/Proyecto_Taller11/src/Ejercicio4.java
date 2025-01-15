
/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. 
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes.
 * Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
*En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
* Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
* En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 * @author Daniel Matute
 */

import java.util.Scanner;

public class Ejercicio4 {
    // Método principal
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreCliente, cedulaCliente;
        int opcion;

        System.out.println("Ingrese su nombre:");
         nombreCliente = tcl.nextLine();
        
        System.out.println("Ingrese su cédula:");
         cedulaCliente = tcl.nextLine();
        
        System.out.println("Ingrese 1 para calcular el valor de la planilla de luz  :");
        System.out.println("Ingrese 2 para calcular el valor del predio");
         opcion = tcl.nextInt();
        
        if (opcion == 1) {
            calcularValorLuz(nombreCliente, cedulaCliente);
        } else if (opcion == 2) {
            calcularPredio(nombreCliente, cedulaCliente);
        } else {
            System.out.println("Opción no válida");
        }
        
        tcl.close();
    }
  
    public static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner tcl = new Scanner(System.in);
        double valorKilovatio,numeroKilovatios,valorTotal;
        
        System.out.println("Ingrese el valor del kilovatio:");
         valorKilovatio = tcl.nextDouble();
        
        System.out.println("Ingrese el número de kilovatios consumidos en el mes:");
         numeroKilovatios = tcl.nextDouble();
        
         valorTotal = valorKilovatio * numeroKilovatios;
        
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%.2f%n", nombreCliente, cedulaCliente, valorTotal);
    }


    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner tcl = new Scanner(System.in);
        double valorInmueble,valorPredio;

        System.out.println("Ingrese el valor del inmueble:");
         valorInmueble = tcl.nextDouble();
        
         valorPredio = valorInmueble * 0.02;
        
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n", nombreCliente, cedulaCliente, valorInmueble, valorPredio);
    }
}
