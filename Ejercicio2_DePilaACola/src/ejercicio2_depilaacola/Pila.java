package ejercicio2_depilaacola;

public class Pila {
    private Nodo cima;
 
    public Pila()
    {
        cima = null;
    }
    
    public void insertar(String elemento)
    {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
       
    public String quitar()
    {                 
        String aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
}
