package modelos;

import java.util.Objects;

public class Persona {
    private int identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona(int identificador, String dni, String nombre, String apellidos, String direccion) {
        this.identificador = identificador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getIdentificador() == persona.getIdentificador() && Objects.equals(getDni(), persona.getDni()) && Objects.equals(getNombre(), persona.getNombre()) && Objects.equals(getApellidos(), persona.getApellidos()) && Objects.equals(getDireccion(), persona.getDireccion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getDni(), getNombre(), getApellidos(), getDireccion());
    }

    @Override
    public String toString() {
        return "persona{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
