package utilidades;

import modelos.Contrato;
import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.*;

import static modelos.TipoContrato.*;


public class UtilidadesEmpresa {
    /* public List<Empleado> getEmpleadosPorContrato(Empresa empresa,
TipoContrato tipoContrato).
Que devuelve la lista de empleados pertenecientes a la empresa y que
tienen un contrato del tipo que se le pasa.
*/
    public List<Empleado> getEmpleadosPorContrato(Empresa emp,TipoContrato tipoContrato){
        List<Empleado> obtenerEmpleados= new ArrayList<>();
        for(Empleado e: emp.getEmpleado()){
            if (e.getContrato().equals(tipoContrato)) {
                obtenerEmpleados.add(e);
            }
        }
        return obtenerEmpleados;
    }

    /* public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa
empresa).
Que devuelve todos los empleados de la empresa cuyo salario es mayor
o igual que 1000 € ordenados de mayor a menor salario.
*/
    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa){
        List<Empleado> mileurista = new ArrayList<>();
        for(Empleado trabajador : empresa.getEmpleado()){
            if(trabajador.getContrato().getSalarioBase() >= 1000){;
                mileurista.add(trabajador);}
        }
        mileurista.sort(new EmpleadoComparator());
        return mileurista;
    }



    /* c. public double fondoSalarialEmpresa(Empresa empresa)
Que devuelve la suma de los salarios de todos los empleados de la
empresa.*/
    public double fondoSalarialEmpresa(Empresa empresa){
        double suma_salarios = 0;
        for(Empleado trabajador: empresa.getEmpleado()){
            suma_salarios= suma_salarios + trabajador.getContrato().getSalarioBase();

        }
        return suma_salarios;

    }

    /*d. public Empleado getMejorPagado(List<Empresa> empresas)
Que devuelve el empleado que m&aacute;s cobra de todos los empleados de las
empresas que se pasan como par&aacute;metros.*/

    public Empleado getMejorPagado(List<Empresa> empresas){
        Empleado mejorPagado = null;
        Double mejorSalario= 0.0;
        for (Empresa compania: empresas) {
            for (Empleado trabajador: compania.getEmpleado()){
                Double sueldo = trabajador.getContrato().getSalarioBase();
                if(mejorSalario < sueldo){
                    mejorSalario = trabajador.getContrato().getSalarioBase();
                    mejorPagado = trabajador;

                }
            }
        }
        return mejorPagado;
    }

    /* public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas)
    Que devuelve un mapa de los empleados de la empresa agrupados por su tipo de contrato.

*/public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas) {
        Map<TipoContrato, List<Empleado>> empleadoPorContrato = new HashMap<>();
        empleadoPorContrato.put(PRACTICAS, new ArrayList<>());
        empleadoPorContrato.put(TEMPORAL, new ArrayList<>());
        empleadoPorContrato.put(INDEFINIDO, new ArrayList<>());
        empleadoPorContrato.put(OBRAYSERVICIO, new ArrayList<>());

        for (Empleado trabajador : empresas.getEmpleado()) {

            switch (trabajador.getContrato().getTipoContrato()) {

                case PRACTICAS:
                    empleadoPorContrato.get(PRACTICAS).add(trabajador);

                case TEMPORAL:
                    empleadoPorContrato.get(TEMPORAL).add(trabajador);
                case INDEFINIDO:
                    empleadoPorContrato.get(INDEFINIDO).add(trabajador);
                case OBRAYSERVICIO:
                    empleadoPorContrato.get(OBRAYSERVICIO).add(trabajador);


            }

        }
        return empleadoPorContrato;
    }
    /* public Map<Empresa, Map<TipoContrato, List<Empleado>>
getEmpleadosPorTipoContrato(List<Empresa> empresas)
Que hace lo mismo que el apartado anterior pero a partir de una lista de
empresas.*/
    public Map<Empresa, Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(List<Empresa> empresas){
       Map<Empresa> mapaEmpresa = new HashMap<>();
       Map<TipoContrato, List<Empleado> mapaempleado = new HashMap<>();
       for(Empresa e: empresas){
           mapaEmpresa.put(e.getTipoEmpresa());
       }
    }
}