
/**
 * Generar una solución que implemente 3 procedimientos.
 * Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo.
 * Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente.
 * Se debe invocar a los procedimientos desde un método principal; 
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 
 * 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 * @author Daniel Matute
 * 
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion ;
        double lado,base, altura, area=0;
        System.out.println("Elige el procedimiento que quieres usar:    1.Area Cuadrado ");
        System.out.println("2. AreaTriangulo");
        System.out.println("3. Area Rectangulo");
        opcion= tcl.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Dame el valor del lado del cuadrado: ");
                lado=tcl.nextDouble();
                System.out.println("El area del Cuadrado es:"+ areaCuadrado(lado , area ));
                break;
                
            case 2:
                System.out.print("Dame el valor de la base y altura: ");
                base=tcl.nextDouble();
                altura=tcl.nextDouble();
                System.out.println("El area del Triangulo es:" + areaTriangulo(base, altura, area));
                break;
            case 3:
                System.out.print("Dame el valor de la base y altura: ");
                base=tcl.nextDouble();
                altura=tcl.nextDouble();
                System.out.println("El area del rectangulo "+areaRectangulo(base, altura,area));
                break;   
            default:
                System.out.println("Opcion Incorrecta");;
        }
    }
    public static double areaCuadrado(double lado, double area){
        area= Math.pow(lado, 4);
        return area;
    }
    public static double areaTriangulo(double base , double altura,double area){
         area= (base * altura)/2;
        return area;
    }
    public static double areaRectangulo(double base , double altura, double area){
        area= base*altura;
         return area;
    }
}
/*
run-single:
Elige el procedimiento que quieres usar:   1.Area Cuadrado 
2. AreaTriangulo
3. Area Rectangulo

2
Dame el valor de la base y altura: 5 6
El area del Triangulo es:15.0
BUILD SUCCESSFUL (total time: 19 seconds)
*/