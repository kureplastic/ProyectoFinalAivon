/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aivon;

import modelo.Conexion;

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
    }
    
}
