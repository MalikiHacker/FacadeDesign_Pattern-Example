package sn.maliki.interfac.veg;

import sn.maliki.interfac.Hotel;
import sn.maliki.interfac.Menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenu() throws IOException {
        ArrayList<String> liste_plat = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader("./fichiers/vegMenu.txt"));
        String line;
        while ((line = in.readLine()) != null)
        {
            if(!liste_plat.contains(line)){
                liste_plat.add(line);
            }
        }
        in.close();
        Menu vegMenu = new Menu(" menu pour Vegan");
        vegMenu.votreChoix(liste_plat);
        return vegMenu;
    }
}
