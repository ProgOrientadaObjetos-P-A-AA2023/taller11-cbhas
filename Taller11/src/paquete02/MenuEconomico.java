package paquete02;

public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(double pD, String nP, double vIM) {
        super(nP, vIM);
        porcentajeDescuento = pD;
    }

    public void establecerPorcentajeDesc(double d) {
        porcentajeDescuento = d;
    }

    @Override
    public void establecerValorMenu() {
        double porcentaje = (valorInicialMenu * porcentajeDescuento) / 100;
        valorMenu = valorInicialMenu - porcentaje;
    }

    public double obtenerPorcentajeDesc() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nMenu Economico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: $%.2f\n"
                + "\tPorcentaje Descuento: %.2f porciento.\n"
                + "\tValor del Menu: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                porcentajeDescuento,
                valorMenu);

        return cadena;
    }

}

// @cbhas
