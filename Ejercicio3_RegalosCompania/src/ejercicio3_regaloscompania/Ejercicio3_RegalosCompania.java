/*
TEMA 3. ESTRUCTURAS LINEALES
Alumno: Marco Alejandro Cupul Hau
Ejercicio 3: Se tiene una lista con los datos de los clientes de una compañía de telefonía celular, 
los cuales pueden aparecer repetidos en la lista, si tienen registrado más de un número telefónico. 
La compañía para su próximo aniversario desea enviar un regalo a sus clientes, sin repetir regalos a un mismo cliente. 
Los regalos se encuentran almacenados en una pila de regalos. Se desea elaborar un programa que permita generar 
una nueva estructura donde los clientes aparezcan sólo una vez con sus regalos asignados. Se sugiere usar una lista de objetos.
 */
package ejercicio3_regaloscompania;
import java.util.Scanner;
public class Ejercicio3_RegalosCompania {
    
    public static void main(String[] args) {
        int opcion=0, n;
        String Nom, Tel, Reg;
        Lista l = new Lista();
        Pila p = new Pila();
        ListaObjetos lo = new ListaObjetos();
        Scanner Teclado=new Scanner(System.in);
        do {
            System.out.println ();
            System.out.println ("|=============MENU DE OPCIONES=============|");
            System.out.println ("| 1. Agregar datos de cliente              |");
            System.out.println ("| 2. Visualizar lista de datos de clientes |");
            System.out.println ("| 3. Agregar regalo a la pila              |");
            System.out.println ("| 4. Visualizar pila de regalos            |");
            System.out.println ("| 5. Visualizar reparto de regalos         |");
            System.out.println ("| 6. Salir                                 |");
            System.out.println ("|==========================================|");
            System.out.print   ("  Introduce el número de tu opción: ");
            opcion=Teclado.nextInt();
            System.out.println ("|==========================================|");
            switch(opcion){
                case 1:
                    System.out.println ("\n|=========AGREGAR DATOS DE CLIENTE=========|");
                    System.out.print ("  Numero de clientes a ingresar: ");
                    n=Teclado.nextInt();
                    for (int i=1; i<=n; i++){
                        System.out.println ("|================Cliente "+i+"=================|");
                        System.out.print ("  Nombre: ");
                        Nom=Teclado.next();
                        System.out.print ("  Telefono: ");
                        Tel=Teclado.next();
                        l.AgregarAlInicio(Nom, Tel);
                    }
                    System.out.println ("|==========================================|");
                    break;
                case 2:
                    if (l.listaVacia())
                    {
                        System.out.println ("\n|*****LA LISTA DE CLIENTES ESTÁ VACÍA******|");
                    } else {
                        System.out.println ("\n|======LISTA DE CLIENTES REGISTRADOS=======|");
                        l.mostrarLista();
                        System.out.println ("\n|==========================================|");
                    }
                    break;
                case 3:
                    System.out.println ("\n|========AGREGAR REGALOS A LA PILA=========|");
                    System.out.print ("  Número de regalos a ingresar: ");
                    n=Teclado.nextInt();
                    for (int i=1; i<=n; i++){
                        System.out.println ("|=================Regalo "+i+"=================|");
                        System.out.print ("  Nombre: ");
                        Reg=Teclado.next();
                        p.insertar(Reg);
                    }
                    System.out.println ("|==========================================|");
                    break;
                case 4:
                    if (p.pilaVacia())
                    {
                        System.out.println ("\n|******LA PILA DE REGALOS ESTÁ VACÍA*******|");
                    } else {
                        System.out.println ("\n|=======DATOS DE LA PILA DE REGALOS========|");
                        p.mostrarPila();
                        System.out.println ("|==========================================|");
                    }
                    
                    break;
                case 5:
                    if (l.listaVacia()&&p.pilaVacia()){
                        System.out.println ("\n|****ERROR-> LISTA Y PILA ESTÁN VACÍAS*****|");
                    } else if (l.listaVacia())
                    {
                        System.out.println ("\n|****LA LISTA ESTÁ VACÍA, AGREGUE DATOS****|");
                    } else if (p.pilaVacia()){
                        System.out.println ("\n|****LA PILA ESTÁ VACÍA, AGREGUE DATOS*****|");
                    } else {
                        System.out.println ("\n|=======LISTA DE REPARTO DE REGALOS========|");
                        //Evalua si hay datos repetidos en la lista y los elimina
                        //l.datoRepetido();
                        //Asigna los regalos
                        while(l.inicio!=null){
                            String a = l.quitar();
                            if (!lo.EvaluarRepetido(a))
                            {
                                lo.AgregarDatos(a, p.quitar());
                            }
                        }
                        //Imprime la lista de reparto de regalos
                        lo.mostrarLista();  
                        System.out.println ("\n|==========================================|");
                    }
                    break;
                case 6:
                    break;
                default: 
                    System.out.println ("\n|***OPCIÓN INCORRECTA, INTENTE DE NUEVO****|");
            }
        }while(opcion<5||opcion>6);
    }
    
}
