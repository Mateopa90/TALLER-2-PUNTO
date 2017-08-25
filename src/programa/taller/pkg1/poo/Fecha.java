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
public class Fecha {
    
    // ATRIBUTOS
    
    private int Dia;
    private int Mes;
    private int Año;
    
    // METODOS

    public Fecha(int Dia, int Mes, int Año) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAño() {
        return Año;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
    
    
}
