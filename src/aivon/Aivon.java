/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aivon;

import entidades.Producto;
import modelo.Conexion;
import modelo.ProductoData;

/**
 *
 * @author Fran Gonzalez
 */
public class Aivon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Conexion c = new Conexion();
        c.getConnection();
        ProductoData prData1 = new ProductoData(c);
                
        
        Producto prod1 = new Producto(114, "Desodorante Rollon Aivon", "Anti transpirante de uso diario con sistema rollon", 50, 65.0, 78.0, 10);
        
        
        
        
        //prData1.guardarProducto(prod1);                                       //guardar producto con datos de prod1            
        
        System.out.println(prData1.buscarProducto(114).getDescripcion());       //buscar producto antes de actualizar
        //prData1.actualizarProducto(prod1);                                    //actualizar producto 
        //System.out.println(prData1.buscarProducto(1).getDescripcion());       //buscar producto despues de actualizar
        
        
    }
    
}
