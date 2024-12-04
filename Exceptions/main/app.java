package Exceptions.main;

import java.util.Scanner;
import Exceptions.Servicios.SaludoServicio;
import Exceptions.modelos.CuentaBancaria;
import Exceptions.modelos.SaldoInsuficienteException;

public class app {

    public static void main(String[] args) {
        System.out.print("\033\143");
        // mainBanco();
        mainSaludo();
    }

    public static void mainSaludo() {
        Scanner sc = new Scanner(System.in);
        try {
            SaludoServicio saludo = new SaludoServicio(sc);
            saludo.saludar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mainBanco() {
        CuentaBancaria cuentita = new CuentaBancaria(10000f);
        System.out.printf("Saldo actual de la cuenta: %.2f.\n",cuentita.getSaldoInicial());
        try {
            cuentita.retirarDinero(11000f);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Saldo actual de la cuenta: %.2f.\n",cuentita.getSaldoInicial());
    }
}
