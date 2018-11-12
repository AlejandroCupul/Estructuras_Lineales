/*
TEMA 3. ESTRUCTURAS LINEALES
Alumno: Marco Alejandro Cupul Hau
Ejercicio 2: Realizar la implementacion donde a partir de una pila se llene una cola.
 */
package ejercicio2_depilaacola;
import java.util.Scanner;
public class Ejercicio2_DePilaACola {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        Pila p = new Pila();
        Cola c = new Cola();
        System.out.print ("Introduce el número de elementos a ingresar: ");
        int n = Teclado.nextInt();
        System.out.println ("\n==Introduce los elementos de la pila==");
        String e;
        for (int i=1; i<=n; i++)
        {
            System.out.print ("Posicion "+i+": ");
            e=Teclado.next();
            p.insertar(e);
        }
        System.out.println ("\n****Datos introducidos a la pila correctamente****");
        System.out.println ("*******Pasando datos de la pila a una cola********");
        System.out.println ("****Datos introducidos a la cola correctamente****");
        
        System.out.println ("\n==Impresión de los elementos de la cola==");        
        for (int i=1; i<=n; i++)
        {
            c.insertar(p.quitar());
            System.out.println ("Posicion "+i+": "+c.quitar());
        }
    }
    
}
