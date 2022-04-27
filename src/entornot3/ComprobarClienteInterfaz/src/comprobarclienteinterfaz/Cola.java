package comprobarclienteinterfaz;
import  java.util.ArrayList;

public class Cola {
    private ArrayList<Cliente> ColaClientes;
    private ArrayList<Cliente> Atendidos;

    
    public Cola(){
        
        this.ColaClientes= new ArrayList();  
        this.Atendidos=new ArrayList(); 
    }
    public void nuevoCliente(Cliente nuevo){
        
        this.ColaClientes.add(nuevo);
    }
    public void Atender(Cliente Atendido)throws ExcepcionesCola{
        if (this.ColaClientes.contains(Atendido)&&(this.ColaClientes.indexOf(Atendido)==0)) {
            this.ColaClientes.remove(Atendido);
            this.Atendidos.add(Atendido);
            System.out.println("el Cliente ha sido Atendido");
        } else if(this.ColaClientes.contains(Atendido)&&(this.ColaClientes.indexOf(Atendido)!=0)) {
            throw new ExcepcionesCola("el Cliente no estaba el primero en la Cola");
            
        }else{
            throw new ExcepcionesCola("el Cliente no estaba  en la Cola");
            
        }
        
    }public void Despachar(Cliente despachado)throws ExcepcionesCola{
        if (this.ColaClientes.contains(despachado)) {
            this.ColaClientes.remove(despachado);    
            System.out.println("el Cliente ha sido Despachado");
        } else {
            throw new ExcepcionesCola("el Cliente no estaba  en la Cola");
        }
        
    }
    public void Abandonar(Cliente abandona)throws ExcepcionesCola{
        if (this.ColaClientes.contains(abandona)) {
            this.ColaClientes.remove(abandona);
            System.out.println("el Cliente abandona la cola");
        } else {
            throw new ExcepcionesCola("el Cliente no estaba  en la Cola");
        }
    }
     public void Adelantar(Cliente Adelantar)throws ExcepcionesCola{
        int posicion=this.ColaClientes.indexOf(Adelantar);
         if(posicion<=0){
             throw new ExcepcionesCola("no hay nadie delante");              
         }else{
             Cliente temp=this.ColaClientes.get(posicion-1); 
             this.ColaClientes.add(posicion, temp);
             this.ColaClientes.set(posicion-1,Adelantar);  
             this.ColaClientes.remove(posicion+1);
         }
    }
     public void Atrasar(Cliente Atrasar)throws ExcepcionesCola{
        int posicion=this.ColaClientes.indexOf(Atrasar);
         if(posicion>=this.ColaClientes.size()){
            throw new ExcepcionesCola("no hay nadie detras");                
         }else{
             Cliente temp=this.ColaClientes.get(posicion+1);
             this.ColaClientes.remove(temp); 
             this.ColaClientes.add(posicion, temp);
             //this.ColaClientes.set(posicion,Atrasar);  

         }
    }
     public ArrayList<Cliente> getColaClientes() {
        return ColaClientes;
    }

    public void setColaClientes(ArrayList<Cliente> ColaClientes) {
        this.ColaClientes = ColaClientes;
    }

    public ArrayList<Cliente> getAtendidos() {
        return Atendidos;
    }

    public void setAtendidos(ArrayList<Cliente> Atendidos) {
        this.Atendidos = Atendidos;
    }


/*==========================================================================================
-------------------------------- METODO COMPROBAR CLIENTE ------------------------------------
==========================================================================================*/
    public boolean comprobarClientes(String cliente) {
        boolean comprobar = false;

        for (int i = 0; i < this.ColaClientes.size(); i++) {

            String nombreCliente = this.ColaClientes.get(i).getNombre();
            
/* Si el nombre del cliente es igual al del array nos devuelve true*/

            if (nombreCliente == cliente) {
                return comprobar = true;
            }
        }

        return comprobar;

    }

/*==========================================================================================
-------------------------------- METODO toString ------------------------------------
==========================================================================================*/


    public String toString(){
        String res="";
        res += "\nCola:";
        res += "\n===============================\n";
        for (int i = 0; i < this.ColaClientes.size(); i++) {
            res += this.ColaClientes.get(i).toString();
            res += "\n---------------------------------------\n";
        }   res += "\nAtendidos:";
            res += "\n===============================\n";
        for (int i = 0; i < this.Atendidos.size(); i++) {
            res += this.Atendidos.get(i).toString();
            res += "\n---------------------------------------\n";
        }
        return res;
        
    }
        
    }
    

