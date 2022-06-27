package com.mycompany.retounoydos;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RetoUnoyDos {

    public static void main(String[] args) {

        Menu();

    }

    public static boolean validarNumero(String valor) {
        if (valor.matches("[0-9]*")) {
            return true;
        } else {
            return false;
        }
    }

    public static String Menu() {
        String menu = JOptionPane.showInputDialog(null, "Seleccione una opción: \n\n"
                + "1. Realizar una operación\n"
                + "2. Salir", "Menu Principal", JOptionPane.INFORMATION_MESSAGE);

        if (menu.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Error", 0);
            return Menu();
        }

        boolean validar = validarNumero(menu);

        if (validar) {

            switch (Integer.parseInt(menu)) {
                case 1:
                    Operacion();
                case 2:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida", "Error", 0);
                    return Menu();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Solo números", "Error", 0);
            return Menu();

        }

        return menu;
    }

    public static String Operacion() {
        String operador = JOptionPane.showInputDialog(null, "Seleccione una operación: \n\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División\n"
                + "5. Potencia\n"
                + "6. Raíz Cuadrada\n"
                + "7. Salir",
                 "Operaciones", JOptionPane.INFORMATION_MESSAGE);

        if (operador.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Error", 0);
            return Operacion();
        }

        boolean validar = validarNumero(operador);

        if (validar) {
            int n1;
            int n2;
            String[] numeros;

            switch (Integer.parseInt(operador)) {
                case 1:
                    numeros = Numeros();
                    n1 = Integer.parseInt(numeros[0]);
                    n2 = Integer.parseInt(numeros[1]);
                    ;

                    ClsSuma suma = new ClsSuma(n1, n2);
                    suma.mostrarResultado();
                    return Operacion();

                case 2:
                    numeros = Numeros();
                    n1 = Integer.parseInt(numeros[0]);
                    n2 = Integer.parseInt(numeros[1]);
                    ;

                    ClsResta resta = new ClsResta(n1, n2);
                    resta.mostrarResultado();
                    return Operacion();

                case 3:
                    numeros = Numeros();
                    n1 = Integer.parseInt(numeros[0]);
                    n2 = Integer.parseInt(numeros[1]);
                    ;

                    ClsMultiplicacion multiplicacion = new ClsMultiplicacion(n1, n2);
                    multiplicacion.mostrarResultado();
                    return Operacion();

                case 4:
                    numeros = Numeros();
                    n1 = Integer.parseInt(numeros[0]);
                    n2 = Integer.parseInt(numeros[1]);

                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre cero", "Error", 0);
                        return Operacion();
                    } else {
                        ClsDivision division = new ClsDivision(n1, n2);
                        division.mostrarResultado();
                        return Operacion();
                    }

                case 5:
                    numeros = Numeros();
                    n1 = Integer.parseInt(numeros[0]);
                    n2 = Integer.parseInt(numeros[1]);
                    ;

                    ClsPotencia potencia = new ClsPotencia(n1, n2);
                    potencia.mostrarResultado();
                    return Operacion();

                case 6:
                    numeros = Numero();
                    n1 = Integer.parseInt(numeros[0]);
                    n2 = Integer.parseInt(numeros[1]);
                    ;

                    ClsRaiz raiz = new ClsRaiz(n1, n2);
                    raiz.mostrarResultado();
                    return Operacion();

                case 7:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida", "Error", 0);
                    return Operacion();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Solo números", "Error", 0);
            return Operacion();
        }

        return operador;
    }

    public static String[] Numeros() {

        String n1 = JOptionPane.showInputDialog(null, "Digite el primer numero", "Primer Número", JOptionPane.INFORMATION_MESSAGE);
        if (n1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Error", 0);
            return Numeros();
        }

        boolean validarN1 = validarNumero(n1);
        if (validarN1) {
            String n2 = JOptionPane.showInputDialog(null, "Digite el segundo numero", "Segundo Número", JOptionPane.INFORMATION_MESSAGE);
            if (n2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Error", 0);
                return Numeros();
            }

            boolean validarN2 = validarNumero(n2);
            if (validarN2) {
                String[] numeros = new String[2];
                numeros[0] = n1;
                numeros[1] = n2;
                return numeros;
            } else {
                JOptionPane.showMessageDialog(null, "Solo números", "Error", 0);
                return Numeros();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Solo números", "Error", 0);
            return Numeros();
        }
    }

    public static String[] Numero() {

        String n1 = JOptionPane.showInputDialog(null, "Digite el numero", "Número", JOptionPane.INFORMATION_MESSAGE);

        if (n1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Error", 0);
            return Numero();
        }

        boolean validarN1 = validarNumero(n1);

        if (validarN1) {
            String[] numeros = new String[2];
            numeros[0] = n1;
            numeros[1] = n1;
            return numeros;

        } else {
            JOptionPane.showMessageDialog(null, "Solo números", "Error", 0);
            return Numero();
        }

    }

}
