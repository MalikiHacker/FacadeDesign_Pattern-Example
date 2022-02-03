package sn.maliki.interfac.nonVeg;

import sn.maliki.interfac.Hotel;
import sn.maliki.interfac.Menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menu getMenu() throws IOException {
        ArrayList<String> liste_plat = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader("./fichiers/nonVegMenu.txt"));
        String line;
        while ((line = in.readLine()) != null)
        {
            if(!liste_plat.contains(line)){
                liste_plat.add(line);
            }
        }
        in.close();
        Menu nonVegMenu = new Menu(" menu pour NonVegan");
        nonVegMenu.votreChoix(liste_plat);
        return nonVegMenu;
    }
}
