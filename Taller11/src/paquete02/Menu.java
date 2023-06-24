package paquete02;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorInicialMenu;
    protected double valorMenu;

    public Menu(String nP, double vIM) {
        nombrePlato = nP;
        valorInicialMenu = vIM;
    }

    public void establecerNombrePlato(String nP) {
        nombrePlato = nP;
    }

    public void establecerValorInicialMenu(double vIM) {
        valorInicialMenu = vIM;
    }

    public abstract void establecerValorMenu();

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

}

// @cbhas
