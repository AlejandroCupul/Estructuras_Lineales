package proyecto_colassupermercado;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Caja {
    
    Queue Caja = new LinkedList();
    Queue personasCaja = new LinkedList();
    Queue carritosCaja = new LinkedList();
    
    public void Cargar(Object a, Object b)
    {
        Caja.offer("P"+a+"<->"+b);
        personasCaja.offer(a);
        carritosCaja.offer(b);
    }
    
    public void CargarAleatorio()
    {
        Random r = new Random();
        int n = (int) (Math.random()*8+1);
        for (int i=1; i<=n; i++)
        {
            Caja.offer(i);
        }
    }
    
    public Object SalidaPersonas()
    {
        return Caja.poll();
    }
    
    public Object Salida()
    {
        Caja.poll();
        personasCaja.poll();
        return carritosCaja.poll();
    }
    
}
