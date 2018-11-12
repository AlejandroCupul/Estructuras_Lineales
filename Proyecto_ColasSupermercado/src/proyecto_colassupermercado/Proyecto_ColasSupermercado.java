package proyecto_colassupermercado;
import javax.swing.JOptionPane;

public class Proyecto_ColasSupermercado {

    public static void main(String[] args) {
        Carrito c = new Carrito();
        Caja caja1 = new Caja();
        Caja caja2 = new Caja();
        Caja caja3 = new Caja();
        c.Cargar();
        caja1.CargarAleatorio();
        caja2.CargarAleatorio();
        caja3.CargarAleatorio();
        for (int i=0; i<caja1.Caja.size(); i++)
        {
            caja1.Cargar(caja1.SalidaPersonas(), c.Salida());
        }
        for (int i=0; i<caja2.Caja.size(); i++)
        {
            caja2.Cargar(caja2.SalidaPersonas(), c.Salida());
        }
        for (int i=0; i<caja3.Caja.size(); i++)
        {
            caja3.Cargar(caja3.SalidaPersonas(), c.Salida());
        }
        
        int opcion=0;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "1. Visualizar cola de carritos disponibles\n"
                + "2. Visualizar colas de las cajas\n"
                + "3. Ingresar a una de las colas de caja\n"
                + "4. Finalizar cliente en una de las colas de caja\n"
                + "5. Salir\n"
                + "-Introduzca el número de la opción a realizar:", "MENÚ DE OPCIONES",
                JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        JOptionPane.showMessageDialog(null,
                            c.Carritos, "COLA DE CARRITOS DISPONIBLES",
                        JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                            "CAJA 1: \n"+caja1.Caja
                          + "\n\nCAJA 2: \n"+caja2.Caja
                          + "\n\nCAJA 3: \n"+caja3.Caja, "COLAS DE LAS CAJAS",
                        JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        int t1, t2, t3;
                        t1=caja1.Caja.size();
                        t2=caja2.Caja.size();
                        t3=caja3.Caja.size();
                        Object y=c.Salida();
                        if (y!=null)
                        {
                            if (t1==t2 && t2==t3)
                            {
                                caja1.Cargar("x", y);
                                JOptionPane.showMessageDialog(null,
                                "Un cliente se ha formado en la cola de la caja 1", "CLIENTE AGREGADO",
                                JOptionPane.INFORMATION_MESSAGE);
                            }   
                            else if (t1<=t2 && t1<=t3)
                            {
                                caja1.Cargar("x", y);
                                JOptionPane.showMessageDialog(null,
                                "Un cliente se ha formado en la cola de la caja 1", "CLIENTE AGREGADO",
                                JOptionPane.INFORMATION_MESSAGE);  
                            } else if (t2<=t1 && t2<=t3)
                            {
                                caja2.Cargar("x", y);
                                JOptionPane.showMessageDialog(null,
                                "Un cliente se ha formado en la cola de la caja 2", "CLIENTE AGREGADO",
                                JOptionPane.INFORMATION_MESSAGE);
                            } else if (t3<=t1 && t3<=t2)
                            {
                                caja3.Cargar("x", y);
                                JOptionPane.showMessageDialog(null,
                                "Un cliente se ha formado en la cola de la caja 3", "CLIENTE AGREGADO",
                                JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,
                            "No hay carritos disponibles, finalice un cliente", "COLA DE CARRITOS VACÍA",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 4:
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Introduzca el número de la caja a la que pertenece:", "FINALIZAR CLIENTE DE UNA COLA",
                        JOptionPane.INFORMATION_MESSAGE));
                        if (opcion==1)
                        {
                            Object x = caja1.Salida();
                            if (x!=null)
                            {
                                c.Devolver(x);
                                JOptionPane.showMessageDialog(null,
                                "Un cliente de la caja 1 ha finalizado exitosamente", "CLIENTE FINALIZADO",
                                JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                "La cola de la caja 1 está vacía", "COLA VACÍA",
                                JOptionPane.INFORMATION_MESSAGE);
                            }   
                        } else if (opcion==2)
                        {
                            Object x = caja2.Salida();
                            if (x!=null)
                            {
                                c.Devolver(x);
                                JOptionPane.showMessageDialog(null,
                                "Un cliente de la caja 2 ha finalizado exitosamente", "CLIENTE FINALIZADO",
                                JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                "La cola de la caja 2 está vacía", "COLA VACÍA",
                                JOptionPane.INFORMATION_MESSAGE);
                            } 
                        } else if (opcion==3)
                        {
                            Object x = caja3.Salida();
                            if (x!=null)
                            {
                                c.Devolver(x);
                                JOptionPane.showMessageDialog(null,
                                "Un cliente de la caja 3 ha finalizado exitosamente", "CLIENTE FINALIZADO",
                                JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                "La cola de la caja 3 está vacía", "COLA VACÍA",
                                JOptionPane.INFORMATION_MESSAGE);
                            } 
                        } else {
                                JOptionPane.showMessageDialog(null,
                                "El número de la caja no existe", "CAJA INEXISTENTE",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;    
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no existe", "INCORRECTO", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(opcion!=5);
    }
    
}
