

package entornot3;


public class prueba {

    
    public static void main(String[] args) {
        Cliente paco=new Cliente("paco");
        Cliente paco1=new Cliente("paco1");
        Cliente paco2=new Cliente("paco2");
        Cliente paco3=new Cliente("paco3");
        Cola Clientes=new Cola();
        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);
        String s = Clientes.toString();
        System.out.println(s);

    }

}
