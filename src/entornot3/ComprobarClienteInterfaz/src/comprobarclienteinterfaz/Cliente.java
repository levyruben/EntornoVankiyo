package comprobarclienteinterfaz;

/**
 *
 * @author ruben
 */
public class Cliente {

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    private int edad;
    private String nombre;
    private boolean sexo; //T: hombre F: mujer
    private double gastoFijo;
    private String productos;
    private double gastoMedio;
    private int NumeroClientes;

    public Cliente(String nombre, int edad, boolean sexo, int gastoFijo, String productos, int numclientes, double gastoMedio) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.gastoFijo = gastoFijo;
        this.productos = productos;
        this.NumeroClientes = numclientes;
        this.gastoMedio = gastoMedio;

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

// ============================ Gasto medio por cliente  ============================= //    
    public double gastoMedio(double gasto) {
        this.gastoMedio = gasto / this.NumeroClientes;
        return this.gastoMedio;

    }

// ============================ toString ============================= //
    public String toString() {
        String res = "";

        res += "Nombre: " + this.nombre + "\n";
        res += "Edad: " + this.edad + "\n";
        res += "Numero de clientes: " + this.NumeroClientes + "\n";
        res += "Gasto medio de los clientes: " + this.gastoMedio + "\n";

        if (sexo) {
            res += "Sexo: Masculino";
        } else {
            res += "Sexo: Femenino";
        }
        return res;
    }

}
