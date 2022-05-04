package entornot3;

/**
 *
 * @author ruben
 */
public class ColaTest {

    public ColaTest() {

    }

    /**
     * Test of nuevoCliente method, of class Cola.
     */
    @Test
    public void testNuevoCliente() {
        Cliente paco = new Cliente("paco");
        Cliente paco1 = new Cliente("paco1");
        Cliente paco2 = new Cliente("paco2");
        Cliente paco3 = new Cliente("paco3");
        Cola Clientes = new Cola();

        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);

        //PRUEBA DE COMPROBAR SI ESTA EL CLIENTE 
        assertEquals(4, Clientes.getColaClientes().size());
        assertEquals(paco, Clientes.getColaClientes().get(0));
        assertEquals(paco1, Clientes.getColaClientes().get(1));
        assertEquals(paco2, Clientes.getColaClientes().get(2));
        assertEquals(paco3, Clientes.getColaClientes().get(3));
        
    }

    /**
     * Test of Atender method, of class Cola.
     */
    @Test
    public void testAtender() {

        Cliente paco = new Cliente("paco");
        Cliente paco1 = new Cliente("paco1");
        Cliente paco2 = new Cliente("paco2");
        Cliente paco3 = new Cliente("paco3");
        Cola Clientes = new Cola();

        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);

        try {
            Clientes.Atender(paco);
        } catch (ExcepcionesCola e) {
            System.out.println("Error: " + e.getMessage());
        }

        //PRUEBAS DE ATENDER 
        assertEquals(paco1, Clientes.getColaClientes().get(0));
        assertEquals(paco, Clientes.getAtendidos().get(0));

    }

    /**
     * Test of Despachar method, of class Cola.
     */
    @Test
    public void testDespachar() {

        Cliente paco = new Cliente("paco");
        Cliente paco1 = new Cliente("paco1");
        Cliente paco2 = new Cliente("paco2");
        Cliente paco3 = new Cliente("paco3");
        Cola Clientes = new Cola();

        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);

        try {
            Clientes.Despachar(paco1);
        } catch (ExcepcionesCola e) {
            System.out.println("Error: " + e.getMessage());
        }
        //PRUEBAS DE ABANDONAR
        
        assertEquals(paco2,Clientes.getColaClientes().get(1) );

    }

    /**
     * Test of Abandonar method, of class Cola.
     */
    @Test
    public void testAbandonar() {

        Cliente paco = new Cliente("paco");
        Cliente paco1 = new Cliente("paco1");
        Cliente paco2 = new Cliente("paco2");
        Cliente paco3 = new Cliente("paco3");
        Cola Clientes = new Cola();

        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);

        try {
            Clientes.Abandonar(paco2);
        } catch (ExcepcionesCola e) {
            System.out.println("Error: " + e.getMessage());
        }
        //PRUEBAS DE ABANDONAR
        
        assertEquals(paco3,Clientes.getColaClientes().get(2) );

    }

    /**
     * Test of Adelantar method, of class Cola.
     */
    @Test
    public void testAdelantar() {

        Cliente paco = new Cliente("paco");
        Cliente paco1 = new Cliente("paco1");
        Cliente paco2 = new Cliente("paco2");
        Cliente paco3 = new Cliente("paco3");
        Cola Clientes = new Cola();

        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);
        try {
            Clientes.Adelantar(paco2);
            Clientes.Adelantar(paco3);
        } catch (ExcepcionesCola e) {
            System.out.println("Error: " + e.getMessage());
        }
         //PRUEBAS DE ADELANTAR
        assertEquals(paco2,Clientes.getColaClientes().get(1) );
        assertEquals(paco3,Clientes.getColaClientes().get(2) );

    }

    /**
     * Test of Atrasar method, of class Cola.
     */
    @Test
    public void testAtrasar() {

        Cliente paco = new Cliente("paco");
        Cliente paco1 = new Cliente("paco1");
        Cliente paco2 = new Cliente("paco2");
        Cliente paco3 = new Cliente("paco3");
        Cola Clientes = new Cola();

        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);

        try {
            Clientes.Atrasar(paco2);
            Clientes.Atrasar(paco1);
        } catch (ExcepcionesCola e) {
            System.out.println("Error: " + e.getMessage());
        }
         //PRUEBAS DE ATRASAR
        assertEquals(paco2,Clientes.getColaClientes().get(3) );
        assertEquals(paco1,Clientes.getColaClientes().get(2) );

    }

    /**
     * Test of toString method, of class Cola.
     */
    @Test
    public void testToString() {

        Cliente paco = new Cliente("paco");
        Cliente paco1 = new Cliente("paco1");
        Cliente paco2 = new Cliente("paco2");
        Cliente paco3 = new Cliente("paco3");
        Cola Clientes = new Cola();

        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);

        System.out.println(Clientes.toString());
        
       
    }

}
