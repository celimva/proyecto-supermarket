package modelos;

import java.util.Objects;

public class Empleado extends Persona{

    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;

    public Empleado(int identificador, String dni, String nombre, String apellidos, String direccion, String numTelefono, Empresa empresa, Contrato contrato) {

        super(identificador, dni, nombre, apellidos, direccion);
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(getNumTelefono(), empleado.getNumTelefono()) && Objects.equals(getEmpresa(), empleado.getEmpresa()) && Objects.equals(getContrato(), empleado.getContrato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumTelefono(), getEmpresa(), getContrato());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numTelefono='" + numTelefono + '\'' +
                ", empresa=" + empresa +
                ", contrato=" + contrato +
                '}';
    }

    public int compareTo(Empleado o2) {
    }
}
