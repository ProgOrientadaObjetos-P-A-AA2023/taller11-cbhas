package paquete02;

import java.util.ArrayList;

public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> menus;
    private double valorTotal;
    private double valorSubtotal;
    private double valorIVA;

    public Cuenta(String nC, ArrayList<Menu> m, double vI) {
        nombreCliente = nC;
        menus = m;
        valorIVA = vI;
    }

    public void establecerNombreCliente(String nC) {
        nombreCliente = nC;
    }

    public void establecerMenus(ArrayList<Menu> m) {
        menus = m;
    }

    public void establecerValorTotal() {
        valorTotal = valorSubtotal + (valorSubtotal * valorIVA) / 100;
    }

    public void establecerValorSubtotal() {
        double suma = 0;
        for (int i = 0; i < menus.size(); i++) {
            suma += menus.get(i).obtenerValorMenu();
        }

        valorSubtotal = suma;
    }

    public void establecerValorIVA(double vI) {
        valorIVA = vI;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Menu> obtenerMenus() {
        return menus;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    public double obtenerValorSubtotal() {
        return valorSubtotal;
    }

    public double obtenerValorIVA() {
        return valorIVA;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s",
                nombreCliente);

        for (int i = 0; i < menus.size(); i++) {
            cadena = String.format("%s%s",
                    cadena,
                    menus.get(i));
        }

        cadena = String.format("%s\n"
                + "Subtotal: $%.1f\n"
                + "IVA: %.1f\n"
                + "Total: $%.3f\n",
                cadena,
                valorSubtotal,
                valorIVA,
                valorTotal);

        return cadena;
    }

}

// @cbhas
