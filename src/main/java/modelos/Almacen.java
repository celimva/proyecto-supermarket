package modelos;

import java.util.Objects;

public class Almacen {
    private int identificador;
    private String nombre;
    private int capacidad;


    public Almacen(int identificador, String nombre, int capacidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Almacen)) return false;
        Almacen almacen = (Almacen) o;
        return getIdentificador() == almacen.getIdentificador() && getCapacidad() == almacen.getCapacidad() && Objects.equals(getNombre(), almacen.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getNombre(), getCapacidad());
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
