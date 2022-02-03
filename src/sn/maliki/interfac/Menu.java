package sn.maliki.interfac;

import java.util.ArrayList;

public class Menu {
    String typeMenu;

    public Menu(String typeMenu) {
        this.typeMenu = typeMenu;
    }

    public String getTypeMenu() {
        return typeMenu;
    }

    public void votreChoix(ArrayList list){
        System.out.println(" Vous avez choisi le " + this.getTypeMenu());
        System.out.println("La liste des plats de ce menu sont :");
        list.forEach((plat) -> System.out.println("\t - " + plat));
        System.out.println("================== Merci pour votre fidélité ===============");

    }
}
