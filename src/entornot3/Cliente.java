<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornot3;

/**
 *
 * @author ruben
 */
public class Cliente {
    String nombre;
    public Cliente(String Nombre){
        this.nombre=Nombre;
    }
=======
package entornot3;

public class Cliente {

    


    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    

    // Creamos la clase cliente 

    private int edad;
    private String nombre;
    private boolean sexo; //T: hombre F: mujer

    public Cliente(String nombre, int edad, boolean sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;

    }

// Get y set de los atributos privados
    
// ============================ EDAD ============================= // 
   
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int nueva) {
        if (edad <= 120 && edad > 0) {
            this.edad = nueva;
        }
    }

// ============================ NOMBRE ============================= // 
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nueva) {
        this.nombre = nueva;
    }

// ============================ SEXO ============================= //  
    
    public boolean getSexo() {
        return this.sexo;
    }

    public void setSexo(boolean nueva) {
        if (nueva != this.sexo) {
            this.sexo = nueva;
        }
    }

// ============================ toString ============================= // 
    
    public String toString() {
        String res = "";

        res += "Nombre: " + this.nombre + "\n";
        res += "Edad: " + this.edad + "\n";
        if (sexo) {
            res += "Sexo: Masculino";
        } else {
            res += "Sexo: Femenino";
        }
        return res;
    }

>>>>>>> 419583f0c48681a50d36386cbfd5a9b9a8610060
}
