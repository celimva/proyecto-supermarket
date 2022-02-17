package utilidades;

import modelos.Empleado;

import java.util.Comparator;

public class EmpleadoComparator implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o2.getContrato().getSalarioBase().compareTo(o1.getContrato().getSalarioBase());
    }

}