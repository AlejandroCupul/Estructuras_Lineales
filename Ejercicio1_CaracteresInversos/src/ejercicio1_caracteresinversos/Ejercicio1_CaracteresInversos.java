/*
TEMA 3. ESTRUCTURAS LINEALES
Alumno: Marco Alejandro Cupul Hau
Ejercicio 1: Escriba un programa que lea en una sequencia de caracteres y los imprima en orden inverso. Usa una pila.
 */
package ejercicio1_caracteresinversos;
import java.util.Scanner;
public class Ejercicio1_CaracteresInversos {
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        System.out.print ("Introduce una secuencia de caracteres: ");
        String cadena=Teclado.nextLine();
        Pila p = new Pila(cadena.length());
        for (int i=0; i<cadena.length(); i++)
        {
            p.push(cadena.charAt(i));
        }
        System.out.println ("==Datos agregados a la pila correctamente==");
        System.out.print ("\nLos caracteres en orden inverso son: ");
        p.salida();
        System.out.println ("\n==Pila impresa correctamente==\n");
    }
    
}
