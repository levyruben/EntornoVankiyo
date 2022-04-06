package entorno;

public class Cliente {

    String nombre;
    double gasta;
    int gastoTOT;
    String listaProductos[] = {"Manzanas", "Peras", "Melon", "sandia", "fresas", "platanos"};
double precio;
    public Cliente(String nom, String prct) {
        String nombre = nom;
        String listaProductos = prct;

        if (prct == "Manzanas") {
            precio=2;
            gasta+=precio;
        }
       if (prct == "Peras") {
            precio=5;
            gasta+=precio;
        }
       if (prct == "Melon") {
            precio=16;
            gasta+=precio;
        }
       if (prct == "sandia") {
            precio=23;
            gasta+=precio;
        }
       if (prct == "fresas") {
            precio=30;
            gasta+=precio;
        }
       if (prct == "platanos") {
            precio=7;
            gasta+=precio;
        }
       this.gastoTOT+=gasta;
    }
   public String toString(){
       String res="";
       res+="El cliente se llama: "+this.nombre;
       res+="El cliente gasta: "+this.gastoTOT;
        return res;
       
   } 
   
}
