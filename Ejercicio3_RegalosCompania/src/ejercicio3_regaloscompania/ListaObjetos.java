package ejercicio3_regaloscompania;

public class ListaObjetos {
    protected Nodo inicio, fin; //Punteros para saber donde está el inicio y el fin
    public ListaObjetos() {
        inicio= null;
        fin= null;
    }
    
    //Metodo para agregar el nombre del cliente y el regalo a la lista
    public void AgregarDatos(String d, String t) {
        //Creando al nodo
        inicio = new Nodo(d, t, inicio);
        if (fin==null){
            fin=inicio;
        }
    }
    
    public boolean EvaluarRepetido(String d){
        Nodo recorrer=inicio;  
        while(recorrer!=null){
            if (recorrer.Nombre==d)
            {
                recorrer=null;
                return true;
            } else {
                recorrer=recorrer.siguiente;
                return false;
            }
        }
        return false;
    }
    
    public boolean listaVacia()
    {
        if(inicio==null)
        {
            return true;                   
        }else {
            return false;
        }
    }
    
    //Metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer=inicio;
        while(recorrer!=null){
            System.out.print("["+recorrer.Nombre+", "+recorrer.Telefono+"]-->");
            recorrer=recorrer.siguiente;
        }
    }
    
    
}
