/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornot3;

/**
 *
 * @author ruben
 */
public class ExcepcionesCola extends  Exception{
    //2constructores
    //1ºsin argumentos
    public ExcepcionesCola(){
        super();
    }    
    //2º con un argumento de tipo String
    public ExcepcionesCola(String mensaje){
        super(mensaje);
    }
    
}