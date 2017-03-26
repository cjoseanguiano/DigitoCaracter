package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
//Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char valor = 0;

        valor = (char) JOptionPane.showInputDialog(null, "Ingresa el valor").charAt(valor);

        if (Character.isDigit(valor)) {
            System.out.println("SI ES DIGITO " + valor);
        } else {
            System.out.println("NO ES DIGITO " + valor);
        }
    }
}
