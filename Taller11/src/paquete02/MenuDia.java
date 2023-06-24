package paquete02;

public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(double vP, double vB,
            String nP, double vIM) {
        super(nP, vIM);
        valorPostre = vP;
        valorBebida = vB;
    }

    public void establecerValorPostre(double b) {
        valorPostre = b;
    }

    public void setValorBebida(double b) {
        valorBebida = b;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorBebida + valorPostre;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: $%.2f\n"
                + "\tValor bebida: $%.2f\n"
                + "\tValor postre: $%.2f\n"
                + "\tValor del Menu: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorBebida,
                valorPostre,
                valorMenu);

        return cadena;
    }

}

// @cbhas
