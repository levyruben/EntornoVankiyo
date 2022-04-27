
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



    private int edad;
    private String nombre;
    private boolean sexo; //T: hombre F: mujer
    private double gasto;
    private String productos;


    public Cliente(String nombre, int edad, boolean sexo, int gasto, String productos) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.gasto = gasto;
        this.productos = productos;

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
// ============================ Cliente Fijos ============================= //

    public int getgastoFijo() {
        return this.getgastoFijo();
    }

    public int getproductos() {
        return this.getproductos();
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

}
