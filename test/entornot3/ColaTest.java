/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entornot3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class ColaTest {

        Cliente paco=new Cliente("paco");
        Cliente paco1=new Cliente("paco1");
        Cliente paco2=new Cliente("paco2");
        Cliente paco3=new Cliente("paco3");
        Cola Clientes=new Cola();

        
   
    public ColaTest() {                    
    }

    /**
     * Test of nuevoCliente method, of class Cola.
     */
    @Test
    public void testNuevoCliente() {
        Clientes.nuevoCliente(paco);
        Clientes.nuevoCliente(paco1);
        Clientes.nuevoCliente(paco2);
        Clientes.nuevoCliente(paco3);
    }

    /**
     * Test of Atender method, of class Cola.
     */
    @Test
    public void testAtender() {
        try{
           Clientes.Atender(paco);
        }catch(ExcepcionesCola e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }

    /**
     * Test of Despachar method, of class Cola.
     */
    @Test
    public void testDespachar() {
         try{
        Clientes.Despachar(paco1);
        }catch(ExcepcionesCola e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }

    /**
     * Test of Abandonar method, of class Cola.
     */
    @Test
    public void testAbandonar() {
        try{
        Clientes.Abandonar(paco3);
        }catch(ExcepcionesCola e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }

    /**
     * Test of Adelantar method, of class Cola.
     */
    @Test
    public void testAdelantar() {
        try{
        Clientes.Adelantar(paco2);
        }catch(ExcepcionesCola e){
            System.out.println("Error: "+e.getMessage());
        }
        
    } /**
     * Test of Atrasar method, of class Cola.
     */
    @Test
    public void testAtrasar() {
        try{
        Clientes.Atrasar(paco2);
        }catch(ExcepcionesCola e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }

    /**
     * Test of toString method, of class Cola.
     */
    @Test
    public void testToString() {
        System.out.println(Clientes.toString());
    }
    
}
