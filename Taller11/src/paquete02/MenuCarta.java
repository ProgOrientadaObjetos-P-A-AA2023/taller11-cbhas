package paquete02;

public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(double vG, double vB, double pA,
            String nP, double vIM) {
        super(nP, vIM);
        valorGuarnicion = vG;
        valorBebida = vB;
        porcentajeAdicional = pA;
    }

    public void establecerValorGuarnicion(double vG) {
        valorGuarnicion = vG;
    }

    public void establecerValorBebida(double vB) {
        valorBebida = vB;
    }

    public void establecerPorcentajeAdicional(double pA) {
        porcentajeAdicional = pA;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = (valorInicialMenu * porcentajeAdicional) / 100
                + (valorInicialMenu + valorBebida + valorGuarnicion);
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n"
                + "Menu a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: $%.1f\n"
                + "\tValor guarnicion: $%.1f\n"                
                + "\tValor bebida: $%.1f\n"
                + "\tPorcentaje adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }

}

// @cbhas
