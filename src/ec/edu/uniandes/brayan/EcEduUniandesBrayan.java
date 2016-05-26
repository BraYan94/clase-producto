/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.brayan;
import java.util.ArrayList;


/**
 *
 * @author BraYan
 */
public class EcEduUniandesBrayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        ArrayList<clsproducto> productos = new ArrayList<clsproducto>();
        
        clsproducto prod1 = new clsproducto(1, "clavo", 20, clsproducto.unidad.libras);
        clsproducto prod2 = new clsproducto(2, "aceite", 10, clsproducto.unidad.litros);
        clsproducto prod3 = new clsproducto(3, "zinc", 20, clsproducto.unidad.metros);
        clsproducto p4 = new clsproducto(2, "3 en 1", 10, clsproducto.unidad.litros);
        clsproducto ultimo = new clsproducto(2, "lija", 20, clsproducto.unidad.metros);
        
        
        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);
        productos.add(p4);
        productos.add(ultimo);
        
        imprimir(productos);
        
    
    }
    
     public static void imprimir(ArrayList<clsproducto> prod) {
         
         for (clsproducto producto : prod) {
             
             System.out.println("*************************");
             System.out.println("Id: "  + producto.Id());
             System.err.println("Nombre:" + producto.Nombre());
             System.out.println("Valor: " + producto.Valor());
             System.err.println("Unidad: " +producto.Unidad());
             System.out.println("");
             
         }
        
    }
    
    
}
