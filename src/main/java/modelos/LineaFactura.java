package modelos;

import java.util.Objects;

public class LineaFactura {
    private int identificaador;
    private Factura factura;
    private Producto producto;
    private int cantidad;



    public LineaFactura(int identificaador, Factura factura, Producto producto, int cantidad) {
        this.identificaador = identificaador;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public LineaFactura(int identificaador, int cantidad) {
        this.identificaador = identificaador;
        this.cantidad = cantidad;
    }
    public int getIdentificaador() {
        return identificaador;
    }

    public void setIdentificaador(int identificaador) {
        this.identificaador = identificaador;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LineaFactura{" +
                "identificaador=" + identificaador +
                ", factura=" + factura +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineaFactura)) return false;
        LineaFactura that = (LineaFactura) o;
        return getIdentificaador() == that.getIdentificaador() && getCantidad() == that.getCantidad() && getFactura().equals(that.getFactura()) && getProducto().equals(that.getProducto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificaador(), getFactura(), getProducto(), getCantidad());
    }
}
