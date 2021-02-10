import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
    public static void main(String[] args) {
        kiloMilla();
    }    
    
    // Método  a modificar. Debe leer una distancia en kilometros
    // y mostrar en pantalla su equivalente en millas 
    public static void kiloMilla () {
        double kilo, milla;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un valor (km): ");
        kilo = input.nextDouble();
        milla=0.621371192*kilo;
        System.out.print("Su valor en millas es: "+milla);
    }
}
