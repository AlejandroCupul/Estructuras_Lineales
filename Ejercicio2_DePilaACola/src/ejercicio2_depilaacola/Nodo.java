package ejercicio2_depilaacola;

public class Nodo {
    String elemento;
    Nodo siguiente; //Puntero enlace
 
    public Nodo(String x)
    {
        elemento = x;
        siguiente = null;
    }
}
