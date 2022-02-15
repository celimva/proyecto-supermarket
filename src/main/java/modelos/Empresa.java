package modelos;

import java.util.List;
import java.util.Objects;

public class Empresa {

    private int identificador;
    private String codigoEmpresa;
    private List<Empleado> empleado;
    Enum TipoEmpresa;

    public Empresa(int identificador, String codigoEmpresa, List<Empleado> empleado, Enum tipoEmpresa) {
        this.identificador = identificador;
        this.codigoEmpresa = codigoEmpresa;
        this.empleado = empleado;
        TipoEmpresa = tipoEmpresa;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public Enum getTipoEmpresa() {
        return TipoEmpresa;
    }

    public void setTipoEmpresa(Enum tipoEmpresa) {
        TipoEmpresa = tipoEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;
        Empresa empresa = (Empresa) o;
        return getIdentificador() == empresa.getIdentificador() && getCodigoEmpresa().equals(empresa.getCodigoEmpresa()) && getEmpleado().equals(empresa.getEmpleado()) && getTipoEmpresa().equals(empresa.getTipoEmpresa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getCodigoEmpresa(), getEmpleado(), getTipoEmpresa());
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "identificador=" + identificador +
                ", codigoEmpresa='" + codigoEmpresa + '\'' +
                ", empleado=" + empleado +
                ", TipoEmpresa=" + TipoEmpresa +
                '}';
    }
}