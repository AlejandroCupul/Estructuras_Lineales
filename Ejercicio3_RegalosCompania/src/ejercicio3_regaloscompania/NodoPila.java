package ejercicio3_regaloscompania;

public class NodoPila {
    String elemento;
    NodoPila siguiente; //Puntero enlace
 
    public NodoPila(String x)
    {
        elemento = x;
        siguiente = null;
    }
}
