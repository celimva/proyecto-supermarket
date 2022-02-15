import modelos.*;

import java.time.LocalDate;

import static modelos.TipoCliente.PARTICULAR;
import static modelos.TipoProducto.ALIMENTACION;

public class pruebaVI {
    public static void main(String[] args) {
        Almacen almacen1 = new Almacen(1, "Manuela S.L.", 20);
        Producto Macarrones = null;
        Cliente cliente1 = new Cliente(1, "31013271W", "Sebastián", "García", "Calle el cisne", PARTICULAR);
        Factura factura1 = new Factura(3, "StringcodigoFactura", 3.50, 1.50, 0.30, 5.30, LocalDate.now(), LocalDate.now(), true);
        LineaFactura LineaFactura1 = new LineaFactura(2, 3);
        Producto macarrones = new Producto(3,"2334k", "azul", LocalDate.now(),1.5, ALIMENTACION,almacen1);

        System.out.println(almacen1);
        System.out.println(cliente1);
        System.out.println(factura1);
        System.out.println(LineaFactura1);
        System.out.println(macarrones);
    }


}









