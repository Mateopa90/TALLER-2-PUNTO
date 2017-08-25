/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.taller.pkg1.poo;

/**
 *
 * @author Estudiantes: Mateo Pacheco ( cpachecof@unal.edu.co ) - Esteban Muñoz ( jemunozva@unal.edu.co )
 */
public class Producto {
    
    // ATRIBUTOS
    
    private int Codigo;
    private String Descripcion;
    private double Precio;
    
    // METODOS

    public Producto(int Codigo, String Descripcion, double Precio) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}
