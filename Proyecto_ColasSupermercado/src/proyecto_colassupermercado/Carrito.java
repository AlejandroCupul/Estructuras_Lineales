package proyecto_colassupermercado;
import java.util.Queue;
import java.util.LinkedList;

public class Carrito {
    
    Queue Carritos = new LinkedList();
    
    public void Cargar()
    {
        for (int i=1; i<=25; i++)
        {
            Carritos.offer("C"+i);
        }
    }
    
    public void Devolver(Object a)
    {
        Carritos.offer(a);
    }
    
    public Object Salida ()
    {
        return Carritos.poll();
    }
    
}
