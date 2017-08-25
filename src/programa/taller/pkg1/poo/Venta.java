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
public class Venta {
    
    // ATRIBUTOS
    
    private Producto[] Producto;
    private Vendedor[] Vendedor;
    private Fecha[] Fecha;
    private int Forma_Pago;
    private int cantidad;
            
    // METODOS

    public Venta(int Forma_Pago, int cantidad) {
        this.Forma_Pago = Forma_Pago;
        this.cantidad = cantidad;
    }
    

    public Producto[] getProducto() {
        return Producto;
    }

    public Vendedor[] getVendedor() {
        return Vendedor;
    }

    public Fecha[] getFecha() {
        return Fecha;
    }

    public int getForma_Pago() {
        return Forma_Pago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProducto(Producto[] Producto) {
        this.Producto = Producto;
    }

    public void setVendedor(Vendedor[] Vendedor) {
        this.Vendedor = Vendedor;
    }

    public void setFecha(Fecha[] Fecha) {
        this.Fecha = Fecha;
    }

    public void setForma_Pago(int Forma_Pago) {
        this.Forma_Pago = Forma_Pago;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
