package utilidades;

import modelos.Contrato;
import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.*;

import static modelos.TipoContrato.*;
import static modelos.TipoEmpresa.PYME;


public class UtilidadesEmpresa {
    /* public List<Empleado> getEmpleadosPorContrato(Empresa empresa,
TipoContrato tipoContrato).
Que devuelve la lista de empleados pertenecientes a la empresa y que
tienen un contrato del tipo que se le pasa.
*/
    public static List<Empleado> getEmpleadosPorContrato(Empresa emp, TipoContrato tipoContrato) {
        List<Empleado> obtenerEmpleados = new ArrayList<>();
        for (Empleado e : emp.getEmpleado()) {
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
    public static List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa) {
        List<Empleado> mileurista = new ArrayList<>();
        for (Empleado trabajador : empresa.getEmpleado()) {
            if (trabajador.getContrato().getSalarioBase() >= 1000) {
                ;
                mileurista.add(trabajador);
            }
        }
        mileurista.sort(new EmpleadoComparator());
        return mileurista;
    }


    /* c. public double fondoSalarialEmpresa(Empresa empresa)
Que devuelve la suma de los salarios de todos los empleados de la
empresa.*/
    public static double fondoSalarialEmpresa(Empresa empresa) {
        double suma_salarios = 0;
        for (Empleado trabajador : empresa.getEmpleado()) {
            suma_salarios = suma_salarios + trabajador.getContrato().getSalarioBase();

        }
        return suma_salarios;

    }

    /*d. public Empleado getMejorPagado(List<Empresa> empresas)
Que devuelve el empleado que m&aacute;s cobra de todos los empleados de las
empresas que se pasan como par&aacute;metros.*/

    public static Empleado getMejorPagado(List<Empresa> empresas) {
        Empleado mejorPagado = null;
        Double mejorSalario = 0.0;
        for (Empresa compania : empresas) {
            for (Empleado trabajador : compania.getEmpleado()) {
                Double sueldo = trabajador.getContrato().getSalarioBase();
                if (mejorSalario < sueldo) {
                    mejorSalario = trabajador.getContrato().getSalarioBase();
                    mejorPagado = trabajador;

                }
            }
        }
        return mejorPagado;
    }

    /* public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas)
    Que devuelve un mapa de los empleados de la empresa agrupados por su tipo de contrato.

*/
    public static Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas) {
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
Que devuelve un mapa de los empleados de la empresa agrupados por su tipo de contrato a partir de una lista de
empresas.*/
    public static Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas) {
        List<Empleado> empleadoPractica = new ArrayList<>();
        List<Empleado> empleadoTemporal = new ArrayList<>();
        List<Empleado> empleadoIndefinido = new ArrayList<>();
        List<Empleado> empleadoObra = new ArrayList<>();
        Map<Empresa, Map<TipoContrato, List<Empleado>>> mapaFinal = new HashMap<>();
        Map<TipoContrato, List<Empleado>> mapaContrato = new HashMap<>();
        for (Empresa compania : empresas) {

            for (Empleado trabajador : compania.getEmpleado()) {

                switch (trabajador.getContrato().getTipoContrato()) {

                    case PRACTICAS:
                        empleadoPractica.add(trabajador);
                    case TEMPORAL:
                        empleadoTemporal.add(trabajador);
                    case INDEFINIDO:
                        empleadoIndefinido.add(trabajador);
                    case OBRAYSERVICIO:
                        empleadoObra.add(trabajador);


                }

            }
            mapaContrato.put(PRACTICAS, empleadoPractica);
            mapaContrato.put(TEMPORAL, empleadoTemporal);
            mapaContrato.put(INDEFINIDO, empleadoIndefinido);
            mapaContrato.put(OBRAYSERVICIO, empleadoObra);
            mapaFinal.put(compania, mapaContrato);
        }
        return mapaFinal;
    }
  /* a. public List<Empleado> getEmpleadosPymePracticas(List<Empresas>
empresas).
Que devuelve la lista de empleados pertenecientes de las empresas
PYMES que se pasan cuyo contrato es del tipo PRACTICAS.*/

    public static List<Empleado> getEmpleadosPymePracticas(List<Empresa>empresas){
        List<Empleado> pymePractica = new ArrayList<>();
        for(Empresa compania: empresas){
            if (compania.getTipoEmpresa() == PYME) {
                for(Empleado trabajador : compania.getEmpleado()){
                    if (trabajador.getContrato().getTipoContrato()== PRACTICAS){
                        pymePractica.add(trabajador);
                    }
                }

            }
        }
        return pymePractica;
    }

    /*b. public Map<Empresa,Empleado>
getLosMejorPagadosPorEmpresa(List<Empresa> empresas).
Que devuelva un mapa con el empleado que más cobra de cada empresa.
*/
    public static Map<Empresa,Empleado> getLosMejorPagadosPorEmpresa(List<Empresa> empresas){
        Map<Empresa,Empleado> mejorPagado= new HashMap<>();
        double salario = 0;
        Empleado masPagado = null;

        for(Empresa compania: empresas){
            for(Empleado trabajador: compania.getEmpleado()){
                if(trabajador.getContrato().getSalarioBase()> salario){
                    salario= trabajador.getContrato().getSalarioBase();
                    masPagado= trabajador;
                }
            }
            mejorPagado.put(compania, masPagado);
        }
        return mejorPagado;
    }

}


