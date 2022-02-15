package utilidades;

import modelos.Factura;
import modelos.LineaFactura;
import modelos.Producto;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class UtilidadesFactura {
    public boolean esFacturaVencida(Factura factura) {
        boolean fechaVencimiento= factura.getFechaVencimiento().isAfter(LocalDate.now());
        return fechaVencimiento;
    }
// importe base que debe tener la factura que se
//le pasa. Para ello recorre todas las Linea Factura de la factura
//que se le pasa y va acumulando en una variable, la suma del
//importe del Producto de la LineaFactura multiplicada por la
//cantidad de dicho producto, también indicada en la linea.//

    public double calcularBaseFactura(Factura factura){
        double precio_total = 0.0;

        for(LineaFactura lineaFactura: factura.getLineaFactura()) {
            double precios_productos = lineaFactura.getProducto().getPrecio() * lineaFactura.getCantidad();
            precio_total = precios_productos + precio_total;

        }
        return precio_total;
    }


    public double calcularBaseFactura2(Factura factura){

        return factura.getLineaFactura().stream().map(l-> l.getProducto())
                .collect(Collectors.toList()).stream().mapToDouble(p-> p.getPrecio()).sum();

    }

    //Que devuelve el totalAPagar que debe tener la factura que se
    //le pasa. Para ello hace la siguiente operación:
    //(importeBase - descuentos) * iva
    //Todos estos datos obtenidos de la factura que se le pasa

    public double TotalAPagar (Factura factura){
        double total_pago = 0.0;
        total_pago = (calcularBaseFactura(factura) - factura.getDescuento())* factura.getIva();
        return total_pago;

    }


}