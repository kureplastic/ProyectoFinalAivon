
package aivon;

import entidades.Campaña;
import entidades.DetallePedido;
import entidades.HistoricoCampaña;
import entidades.Pedido;
import entidades.Producto;
import entidades.Revendedor;
import java.time.LocalDate;
import java.time.Month;
import modelo.CampañaData;
import modelo.Conexion;
import modelo.HistoricoCampañaData;
import modelo.PedidoData;
import modelo.ProductoData;
import modelo.RevendedorData;
import modelo.detallePedidoData;


public class Aivon {

    public static void main(String[] args) {
        
        
        
        Conexion c = new Conexion();
        c.getConnection();
        ProductoData prData1 = new ProductoData(c);
        RevendedorData revendedorData1 = new RevendedorData(c);
        CampañaData campañaData1 = new CampañaData(c);
        PedidoData pedidoData1 = new PedidoData(c);
        HistoricoCampañaData historicoData1 = new HistoricoCampañaData(c);
        detallePedidoData detalleData1 = new detallePedidoData(c);
                
        
        Producto prod1 = new Producto(114, "Desodorante Rollon Aivon", "Anti transpirante de uso diario con sistema rollon", 50, 65.0, 78.0, 10);
        Producto prod2 = new Producto(115, "Crema Corporal De Miel", "Crema corporal de uso femenino con aroma a miel", 75, 100.0, 150.0, 15);
        Producto prod3 = new Producto(116, "Desodorante Antitranspirante", "Anti transpirante de uso diario con Proteccion 48hs", 50, 70.0, 80.0, 12);
        Producto prod4 = new Producto(117, "Labial Protect", "Labial de color transparante para la sequedad", 10, 80.0, 90.0, 10);
        Producto prod5 = new Producto(118, "Toalla Turbo", "Toalla de secado rapido", 90, 200.0, 300.0, 19);
        Producto prod6 = new Producto(119, "Colonia Mosku", "Colonia de uso masculino importada de rusia", 50, 800.0, 1000.0, 100);
        
        Revendedor revendedor1 = new Revendedor(25456789, "Maria", "Fuentes", 2664765326, "marifuentes21@gmail.com", true, 1);
        Revendedor revendedor2 = new Revendedor(25456730, "Vanina", "Fuentes", 2664766026, "vaninafuentes@gmail.com", true, 1);
        Revendedor revendedor3 = new Revendedor(23456789, "Eduardo", "Funes", 2664275326, "eduardofunes@gmail.com", true, 1);
        Revendedor revendedor4 = new Revendedor(21456789, "Carmen", "Morales", 2664768026, "carmenmorales43@gmail.com", true, 1);
        Revendedor revendedor5 = new Revendedor(28456789, "Facundo", "Perez", 2664765330, "facuperez@gmail.com", true, 1);
        Revendedor revendedor6 = new Revendedor(25466789, "Leticia", "Siciliani", 2664805426, "leti4321@gmail.com", true, 1);
        
        Campaña cam1 = new Campaña(LocalDate.of(2010, Month.APRIL, 1), LocalDate.of(2010, Month.APRIL, 25), 50000, 100000, 2, true);
        Campaña cam2 = new Campaña(LocalDate.of(2020, Month.APRIL, 4), LocalDate.of(2020, Month.APRIL, 25), 50000, 100000, 2, true);
        Campaña cam3 = new Campaña(LocalDate.of(1994, Month.APRIL, 2), LocalDate.of(1994, Month.APRIL, 25), 50000, 100000, 2, true);
        Campaña cam4 = new Campaña(LocalDate.of(1994, Month.APRIL, 5), LocalDate.of(1994, Month.APRIL, 25), 50000, 100000, 2, true);
        Campaña cam5 = new Campaña(LocalDate.of(2014, Month.APRIL, 3), LocalDate.of(2014, Month.APRIL, 25), 50000, 100000, 2, true);
        Campaña cam6 = new Campaña(LocalDate.of(2019, Month.APRIL, 1), LocalDate.of(2019, Month.APRIL, 25), 50000, 100000, 2, true);
        
        Pedido pedido1 = new Pedido(cam1, revendedor6, LocalDate.of(1994, Month.APRIL, 1), LocalDate.of(1994, Month.APRIL, 15), LocalDate.of(1994, Month.APRIL, 2), 2, 10000, 2, true);
        Pedido pedido2 = new Pedido(cam2, revendedor5, LocalDate.of(1994, Month.APRIL, 1), LocalDate.of(1994, Month.APRIL, 15), LocalDate.of(1994, Month.APRIL, 2), 2, 10000, 2, true);
        Pedido pedido3 = new Pedido(cam3, revendedor4, LocalDate.of(1994, Month.APRIL, 1), LocalDate.of(1994, Month.APRIL, 15), LocalDate.of(1994, Month.APRIL, 2), 2, 10000, 2, true);
        Pedido pedido4 = new Pedido(cam4, revendedor3, LocalDate.of(1999, Month.APRIL, 1), LocalDate.of(1999, Month.APRIL, 15), LocalDate.of(1994, Month.APRIL, 2), 2, 10000, 2, true);
        Pedido pedido5 = new Pedido(cam5, revendedor2, LocalDate.of(2020, Month.APRIL, 1), LocalDate.of(2020, Month.APRIL, 15), LocalDate.of(1994, Month.APRIL, 2), 2, 10000, 2, true);
        Pedido pedido6 = new Pedido(cam6, revendedor1, LocalDate.of(2020, Month.APRIL, 1), LocalDate.of(2020, Month.APRIL, 15), LocalDate.of(1994, Month.APRIL, 2), 2, 10000, 2, true);
        
        DetallePedido detalle1 = new DetallePedido(prod1, pedido1, 10);
        DetallePedido detalle2 = new DetallePedido(prod2, pedido2, 15);
        DetallePedido detalle3 = new DetallePedido(prod3, pedido3, 12);
        DetallePedido detalle4 = new DetallePedido(prod4, pedido4, 17);
        DetallePedido detalle5 = new DetallePedido(prod5, pedido5, 11);
        DetallePedido detalle6 = new DetallePedido(prod6, pedido6, 18);
        
        HistoricoCampaña HC1 = new HistoricoCampaña(cam1, revendedor6, 2, true);
        HistoricoCampaña HC2 = new HistoricoCampaña(cam2, revendedor5, 1, true);
        HistoricoCampaña HC3 = new HistoricoCampaña(cam3, revendedor4, 3, true);
        HistoricoCampaña HC4 = new HistoricoCampaña(cam4, revendedor3, 3, true);
        HistoricoCampaña HC5 = new HistoricoCampaña(cam5, revendedor2, 2, true);
        HistoricoCampaña HC6 = new HistoricoCampaña(cam6, revendedor1, 1, true);
        
        //System.out.println(prData1.buscarProducto(114).getDescripcion());       //buscar producto antes de actualizar
        //prData1.actualizarProducto(prod1);                                    //actualizar producto 
        //System.out.println(prData1.buscarProducto(1).getDescripcion());       //buscar producto despues de actualizar
        
        
    }
    
}
