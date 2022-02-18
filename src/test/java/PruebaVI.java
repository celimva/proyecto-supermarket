import modelos.*;
import utilidades.UtilidadesEmpresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static modelos.TipoCliente.PARTICULAR;
import static modelos.TipoProducto.ALIMENTACION;

public class PruebaVI {
    public static void main(String[] args) {
        Almacen almacen1 = new Almacen(1, "Manuela S.L.", 20);
        Producto Macarrones = null;
        Cliente cliente1 = new Cliente(1, "31013271W", "Sebastián", "García", "Calle el cisne", PARTICULAR);
        Factura factura1 = new Factura(3, "StringcodigoFactura", 3.50, 1.50, 0.30, 5.30, LocalDate.now(), LocalDate.now(), true);
        LineaFactura LineaFactura1 = new LineaFactura(2, 3);
        Producto macarrones = new Producto(3, "2334k", "azul", LocalDate.now(), 1.5, ALIMENTACION, almacen1);

        System.out.println(almacen1);
        System.out.println(cliente1);
        System.out.println(factura1);
        System.out.println(LineaFactura1);
        System.out.println(macarrones);

        Empleado e1 = new Empleado(new Contrato(1, 2000.0, TipoContrato.INDEFINIDO));
        Empleado e2 = new Empleado(new Contrato(1, 2200.0, TipoContrato.INDEFINIDO));
        Empleado e3 = new Empleado(new Contrato(1, 1000.0, TipoContrato.INDEFINIDO));
        Empleado e4 = new Empleado(new Contrato(1, 5000.0, TipoContrato.INDEFINIDO));
        Empleado e5 = new Empleado(new Contrato(1, 3000.0, TipoContrato.INDEFINIDO));

        ArrayList<Empleado> lista = new ArrayList<>();
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);

        Empresa empresa = new Empresa(1, "pito", lista, TipoEmpresa.MULTINACIONAL);

        UtilidadesEmpresa utilEmpresa = new UtilidadesEmpresa();

        List<Empleado> ordenados = utilEmpresa.getMileuristasOrdenadosPorSalario(empresa);

        System.out.println(ordenados);
    }


}









