package paquete01;

import java.util.ArrayList;
import paquete02.*;

public class Ejecutor01 {

    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();

        MenuNiños mN1 = new MenuNiños(1, 1.5, "Niños 01", 2);
        MenuNiños mN2 = new MenuNiños(1, 1.5, "Niños 02", 3);
        mN1.establecerValorMenu();
        mN2.establecerValorMenu();
        menus.add(mN1);
        menus.add(mN2);

        MenuEconomico mE = new MenuEconomico(25, "Econo 001", 4);
        mE.establecerValorMenu();
        menus.add(mE);

        MenuDia mD = new MenuDia(1, 1, "Dia 001", 5);
        mD.establecerValorMenu();
        menus.add(mD);

        MenuCarta mC = new MenuCarta(1.5, 2, 10, "Carta001", 6);
        mC.establecerValorMenu();
        menus.add(mC);

        Cuenta c = new Cuenta("Sebastián", menus, 10);
        c.establecerValorSubtotal();
        c.establecerValorTotal();

        System.out.print(c);
    }

}

// @cbhas
