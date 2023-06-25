package paquete02;

public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(double vH, double vP, String nP,
            double vIM) {
        super(nP, vIM);
        valorHelado = vH;
        valorPastel = vP;
    }

    public void establecerValorHelado(double c) {
        valorHelado = c;
    }

    public void establecerValorPastel(double c) {
        valorPastel = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nMenu del Día:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: $%.2f\n"
                + "\tValor helado: $%.2f\n"
                + "\tValor pastel: $%.2f\n"
                + "\tValor del Menu: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorHelado,
                valorPastel,
                valorMenu);

        return cadena;
    }
    
}

// @cbhas
