package ejercicio3_regaloscompania;

public class Pila {
    private NodoPila cima;
 
    public Pila()
    {
        cima = null;
    }
    
    public void insertar(String elemento)
    {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    
    //Metodo para mostrar los datos
    public void mostrarPila(){
        NodoPila recorrer=cima;
        while(recorrer!=null){
            System.out.println(recorrer.elemento);
            recorrer=recorrer.siguiente;
        }
    }
    
    public String quitar()
    {                 
        String aux= cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
    
    public boolean pilaVacia()
    {
        if(cima==null)
        {
            return true;                   
        }else {
            return false;
        }
    }
    
}
