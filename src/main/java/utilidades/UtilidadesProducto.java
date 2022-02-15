package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {
    /*El método devuelve la lista de productos del tipo que se le pasa
como parámetro.*/

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo) {
        List<Producto> listaProductos = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getTipoProducto().equals(tipo)) {
                listaProductos.add(producto);
            }
        }
        return listaProductos;
    }

    /* El método devuelve la lista de productos del almacen que se le pasa
como parámetro.*/
    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen) {
        List<Producto> ProductosDelAlmacen = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getAlmacen().equals(almacen)) {
                ProductosDelAlmacen.add(producto);
            }
        }
        return ProductosDelAlmacen;
    }
}
