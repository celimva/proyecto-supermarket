package modelos;

import java.util.Objects;

public class Cliente extends Persona{

    private TipoCliente TipoCliente;

    public Cliente(int identificador, String dni, String nombre, String apellidos, String direccion, modelos.TipoCliente tipoCliente) {
        super(identificador, dni, nombre, apellidos, direccion);
        TipoCliente = tipoCliente;
    }

    public modelos.TipoCliente getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(modelos.TipoCliente tipoCliente) {
        TipoCliente = tipoCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return getTipoCliente() == cliente.getTipoCliente();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoCliente());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "TipoCliente=" + TipoCliente +
                '}';
    }
}