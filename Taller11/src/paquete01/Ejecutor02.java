package paquete01;

import java.util.ArrayList;
import paquete02.*;

public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        ArrayList<Menu> lista = new ArrayList();

        for (int i = 0; i < datos001.length; i++) {

            String nombrePlato = datos001[i][0];
            double valorInicial = Double.parseDouble(datos001[i][1]);
            double valorHelado = Double.parseDouble(datos001[i][2]);
            double valorPastel = Double.parseDouble(datos001[i][3]);
            Menu mN = new MenuNiños(valorHelado, valorPastel,
                    nombrePlato, valorInicial);
            lista.add(mN);

        }

        for (int i = 0; i < datos002.length; i++) {
            String nombrePlato = datos002[i][0];
            double valorInicial = Double.parseDouble(datos002[i][1]);
            double porcenteajeDescuento = Double.parseDouble(datos002[i][2]);
            Menu mE = new MenuEconomico(porcenteajeDescuento, nombrePlato,
                    valorInicial);
            lista.add(mE);
        }

        for (int i = 0; i < datos003.length; i++) {
            double valorPostre = Double.parseDouble(datos003[i][2]);
            double valorBebida = Double.parseDouble(datos003[i][3]);
            String nombrePlato = datos003[i][0];
            double valorInicial = Double.parseDouble(datos003[i][1]);

            Menu mD = new MenuDia(valorPostre, valorBebida, nombrePlato,
                    valorInicial);
            lista.add(mD);
        }

        for (int i = 0; i < datos004.length; i++) {

            double valorGuarnicion = Double.parseDouble(datos004[i][2]);
            double valorBebida = Double.parseDouble(datos004[i][3]);
            double porcentajeAdicional = Double.parseDouble(datos004[i][4]);
            String nombrePlato = datos004[i][0];
            double valorInicial = Double.parseDouble(datos004[i][1]);

            Menu mC = new MenuCarta(valorGuarnicion, valorBebida,
                    porcentajeAdicional, nombrePlato, valorInicial);
            lista.add(mC);
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        Cuenta miCuenta = new Cuenta("Sebastián Cadlerón", lista, 10);
        miCuenta.establecerValorSubtotal();
        miCuenta.establecerValorTotal();
        System.out.printf("%s", miCuenta);
    }
    
}
