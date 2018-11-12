package ejercicio3_regaloscompania;

public class Nodo {
    String Nombre, Telefono;
    Nodo siguiente; //Puntero enlace
    
    //Constructor para insertar al final
    public Nodo(String d, String t)
    {
        this.Nombre = d;
        this.Telefono = t;
    }
    
    //Constructor para insertar al inicio
    public Nodo(String d, String t, Nodo n)
    {
        Nombre = d;
        Telefono = t;
        siguiente = n;
    }
}

