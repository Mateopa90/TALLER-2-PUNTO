/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.taller.pkg1.poo;

import java.util.Scanner;

/**
 *
 * @author Estudiantes: Mateo Pacheco ( cpachecof@unal.edu.co ) - Esteban Muñoz ( jemunozva@unal.edu.co )
 * 
 */
public class ProgramaTaller1POO {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner (System.in);
        int No_Tiendas, No_Vendedores, ID_V, No_Productos, codigo_P, NIT_LC;
        String nombre_V, apellido_V, descrip_P, nombre_LC;
        double precio_P;
        
        System.out.println("*********************************");
        System.out.println("**Bienvenido a su tieda virtual**");
        System.out.println("*********************************");
        
        System.out.println("Digite el numero de Locales Comerciales a administrar: ");
        No_Tiendas = lectura.nextInt();
        Local_Comercial LC[] = new Local_Comercial[No_Tiendas];
        for ( int i=0;i<LC.length;i++)
        {
            lectura.nextLine();
            System.out.println("Ingrese el nombre Local Comercial "+(i+1)+" : ");
            nombre_LC = lectura.nextLine();
            System.out.println("Ingrese el NIT del Local Comercial "+(i+1)+" : ");
            NIT_LC = lectura.nextInt();
            
            LC[i] = new Local_Comercial(nombre_LC, NIT_LC); 
        }
        
        System.out.println("Digite el numero de vendedores a administrar: ");
        No_Vendedores = lectura.nextInt();
        Vendedor V[] = new Vendedor[No_Vendedores];
        
        for ( int i=0;i<V.length;i++)
        {
            lectura.nextLine();
            System.out.println("Ingrese el nombre del vendedor "+(i+1)+" : ");
            nombre_V = lectura.nextLine();
            System.out.println("Ingrese el apellido del vendedor "+(i+1)+" : ");
            apellido_V = lectura.nextLine();
            System.out.println("Ingrese el ID del vendedor "+(i+1)+" : ");
            ID_V = lectura.nextInt();
            
            V[i] = new Vendedor(ID_V, nombre_V, apellido_V); 
        }
        
        System.out.println("Digite el numero de productos a la venta: ");
        No_Productos = lectura.nextInt();
        Producto P[] = new Producto[No_Productos];
        
        for ( int i=0;i<P.length;i++)
        {
            lectura.nextLine();
            System.out.println("Ingrese el codigo del producto "+(i+1)+" : ");
            codigo_P= lectura.nextInt();
            System.out.println("Ingrese la descripcion del producto"+(i+1)+" : ");
            descrip_P = lectura.nextLine();
            System.out.println("Ingrese el precio del producto "+(i+1)+" : ");
            precio_P = lectura.nextDouble();
            
            P[i] = new Producto (codigo_P, descrip_P, precio_P); 
        }
        
        System.out.println("CUENNTA CON "+No_Tiendas+" TIENDAS Y UN TOTAL DE "+No_Productos+" LOS CUALES SON ARREGLADOS POR "+No_Vendedores+" VENDEDORES.");
        
    
    }
    
}
