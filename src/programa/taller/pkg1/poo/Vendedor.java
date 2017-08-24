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
public class Vendedor {
    
    // ATRIBUTOS
    
    private int ID;
    private String Nombre;
    private String Apelido;
    
    // METODOS

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }
    
    
    
}
