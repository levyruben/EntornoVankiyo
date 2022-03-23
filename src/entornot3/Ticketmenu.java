
package entornot3;

public class Ticketmenu {
    
    int Contador;
    int opcion; 
    public Ticketmenu(int opcion){
        this.opcion=opcion;
        this.Contador=0;
    
    do {                                                                        //inicio el bucle madre.        
                                                             
            System.out.println("Fruteria EL BANQUILLO");                                //imprimimos el primer ticke.
            System.out.println("===================");
            System.out.println("1. Vender Ticket.");
            System.out.println("2. Resumen de Ventas.");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
                                                        
            switch (opcion) {                                                   //Hago un switch para elegir una opcion.
                case 1:                                                         //caso 1 para generar ticket.
                    System.out.println("Generando ticket...");
                    System.out.println("------------------\n");
                    Contador++;                                      
                    System.out.println("------------------");               //imprimo ticket
                    System.out.println("TICKET DE ENTRADA nº"+Contador);
 
                    break;                                                      //cierro el caso 1.     
                case 2:                                                         //caso 2 para el resumen de ventas.

                    System.out.println("RESUMEN DE VENTAS");                    //imprimo Resumen de ventas.
                    System.out.println("===================");
                    System.out.println(Contador + " Tickets.");
                   
                    break;                                                      //cierro el caso 2.
                case 3:                                                         //caso 3 para salir.
                    System.out.println("Saliendo...");
                    break;
                default:                                                        //cualquier otra opcion , da error.
                    System.out.println("ERROR: opcion incorrecta.");
                    break;
            }
        } while (opcion != 3);                                                  //mientras que no sea 3 ,siga ejecutandose el bucle.
    }
}
