/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Pedido;
import java.sql.Connection;

/**
 *
 * @author Fran Gonzalez
 */
public class PedidoData {
    
    private Connection con;

    public PedidoData(Conexion conexion) {
        con = conexion.getConnection();
    }
    
    public void ingresarPedido(Pedido pedido){
        
        String sql = "INSERT INTO pedido ()";
    }
    
}
