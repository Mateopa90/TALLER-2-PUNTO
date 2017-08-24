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
public class Local_Comercial {
    
    // ATRIBUTOS
    
    private String Nombre;
    private int NIT; 
    private Venta[] Venta;
    private Producto[] Producto;
    private Vendedor[] Vendedor;
    
    // METODOS

    public Local_Comercial(String Nombre, int NIT) {
        this.Nombre = Nombre;
        this.NIT = NIT;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNIT() {
        return NIT;
    }

    public Venta[] getVenta() {
        return Venta;
    }

    public Producto[] getProducto() {
        return Producto;
    }

    public Vendedor[] getVendedor() {
        return Vendedor;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public void setVenta(Venta[] Venta) {
        this.Venta = Venta;
    }

    public void setProducto(Producto[] Producto) {
        this.Producto = Producto;
    }

    public void setVendedor(Vendedor[] Vendedor) {
        this.Vendedor = Vendedor;
    }
    
}
