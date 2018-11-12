package ejercicio2_depilaacola;

public class Cola {
    protected Nodo frente;
    protected Nodo fin;
    
    public Cola()
    {
        frente = fin = null;
    }
    
    public void insertar(String elemento)
    {
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()) 
        {
            frente = a;
        } else {
            fin.siguiente = a;
        }
            fin = a;
    }
    
    public String quitar()
    {
        String aux;
        if (!colaVacia())
        {
            aux = frente.elemento;
            frente = frente.siguiente;
        } else {
            return "";
        }
            return aux;
    }
    
    public boolean colaVacia()
    {
        if(frente==null)
        {
            return true;                   
        }else {
            return false;
        }
    }
    
}
