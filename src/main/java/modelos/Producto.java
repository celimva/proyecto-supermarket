package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
    private int identificador;
    private String codigo;
    private String descripcion;
    private LocalDate fechaCaducidad;
    private double precio;
    private TipoProducto tipoProducto;
    private Almacen almacen;


    public Producto(int identificador, String codigo, String descripcion, LocalDate fechaCaducidad, double precio, TipoProducto tipoProducto, Almacen plmacen) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.almacen = almacen;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return getIdentificador() == producto.getIdentificador() && Double.compare(producto.getPrecio(), getPrecio()) == 0 && Objects.equals(getCodigo(), producto.getCodigo()) && Objects.equals(getDescripcion(), producto.getDescripcion()) && Objects.equals(getFechaCaducidad(), producto.getFechaCaducidad()) && getTipoProducto() == producto.getTipoProducto() && Objects.equals(getAlmacen(), producto.getAlmacen());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getCodigo(), getDescripcion(), getFechaCaducidad(), getPrecio(), getTipoProducto(), getAlmacen());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", precio=" + precio +
                ", tipoProducto=" + tipoProducto +
                ", almacen=" + almacen +
                '}';
    }
}