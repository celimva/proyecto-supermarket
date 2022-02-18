package utilidades;

import modelos.Cliente;

/* El método devuelve true si el dni del cliente que se le pasa,
tiene 9 caracteres y de los cuáles los 8 primeros son números
y el último una letra, y devuelve false en caso contrario.*/

public class UtilidadesCliente {
    public static boolean esDniValido(Cliente cliente) {
        boolean areDigits = true;

        char[] caracteres = cliente.getDni().substring(0, 8).toCharArray();

        for (char caracter : caracteres) {
            if (!Character.isDigit(caracter)) {
                areDigits = false;
            }
        }

        return cliente.getDni().length() == 9 && areDigits && Character.isLetter(cliente.getDni().charAt(8));
    }

}

