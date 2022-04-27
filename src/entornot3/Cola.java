package entornot3;
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
    public void Atender(Cliente Atendido){
        if (this.ColaClientes.contains(Atendido)) {
            this.ColaClientes.remove(Atendido);
            this.Atendidos.add(Atendido);
            System.out.println("el Cliente ha sido Atendido");
        } else {
            System.out.println("el Cliente no estaba en la Cola");
        }
        
    }public void Despachar(Cliente despachado){
        if (this.ColaClientes.contains(despachado)) {
            this.ColaClientes.remove(despachado);    
            System.out.println("el Cliente ha sido Despachado");
        } else {
            System.out.println("el Cliente no estaba en la Cola");
        }
        
    }
    public void Abandonar(Cliente abandona){
        if (this.ColaClientes.contains(abandona)) {
            this.ColaClientes.remove(abandona);
            System.out.println("el Cliente abandona la cola");
        } else {
            System.out.println("el Cliente no estaba en la cola");
        }
    }
    
     public void Adelantar(Cliente Adelantar){
        int posicion=this.ColaClientes.indexOf(Adelantar);
         if(posicion<=0){
             System.out.println("no hay nadie delante");               
         }else{
             Cliente temp=this.ColaClientes.get(posicion-1); 
             this.ColaClientes.add(posicion, temp);
             this.ColaClientes.set(posicion-1,Adelantar);  
             this.ColaClientes.remove(posicion+1);
         }
    }public void Atrasar(Cliente Atrasar){
        int posicion=this.ColaClientes.indexOf(Atrasar);
         if(posicion>=this.ColaClientes.size()){
             System.out.println("no hay nadie detras");               
         }else{
             Cliente temp=this.ColaClientes.get(posicion+1);
             this.ColaClientes.remove(temp); 
             this.ColaClientes.add(posicion, temp);
         }
    }
    
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
   