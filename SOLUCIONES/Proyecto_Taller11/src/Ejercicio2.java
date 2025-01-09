
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
        double lado,base, altura;
        System.out.println("Elige el procedimiento que quieres usar 1.Area Cuadrado ");
        System.out.println("2. AreaTriangulo");
        System.out.println("3. Area Rectangulo");
        opcion= tcl.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Dame el valor del lado del cuadrado: ");
                lado=tcl.nextDouble();
                System.out.println("El area del Cuadrado es:");
                areaCuadrado(lado);
                break;
                
            case 2:
                System.out.print("Dame el valor de la base y altura: ");
                base=tcl.nextDouble();
                altura=tcl.nextDouble();
                System.out.println("El area del Triangulo es:");
                areaTriangulo(base, altura);
                break;
            case 3:
                System.out.print("Dame el valor de la base y altura: ");
                base=tcl.nextDouble();
                altura=tcl.nextDouble();
                System.out.println("El area del rectangulo ");
                areaRectangulo(base, altura);
                break;   
            default:
                System.out.println("Opcion Incorrecta");;
        }
    }
    public static double areaCuadrado(double lado){
        double areaCuadrado;
        return areaCuadrado= Math.pow(lado, 4);
    }
    public static double areaTriangulo(double base , double altura){
        double areaTriangulo;
        return areaTriangulo= (base * altura)/2;
    }
    public static double areaRectangulo(double base , double altura){
        double areaRectangulo;
         return areaRectangulo= base*altura;
    }
}
