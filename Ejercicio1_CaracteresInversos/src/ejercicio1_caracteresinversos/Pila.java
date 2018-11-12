package ejercicio1_caracteresinversos;

public class Pila {
    char pila1[];
    int tope;
    
    //Constructor Pila
    public Pila (int tamano)
    {
        pila1 = new char[tamano];
        tope=0;
    }
 
    //Método que agrega datos a la pila
    public void push(char letra){
            pila1[tope]=letra;
            tope++;
    }
     
    //Método que imprime los datos de la pila
    public void salida(){
        while(tope>0)
        {
            tope--;
            System.out.print(pila1[tope]);
        }
    }
    
}     


    /*public int pop()
    {
        if(tope==-1){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Se elimino un elemento de la pila");
            pila1[tope]=0;
            tope=-1;
        }
        return tope;
    }*/
