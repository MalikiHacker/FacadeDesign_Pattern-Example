package sn.maliki.interfac.vegNonBoth;

import sn.maliki.interfac.Hotel;
import sn.maliki.interfac.Menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VegNonBothRestaurant implements Hotel {
    @Override
    public Menu getMenu() throws IOException {
        ArrayList<String> liste_plat = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader("./fichiers/vegNonBothMenu.txt"));
        String line;
        while ((line = in.readLine()) != null)
        {
            if(!liste_plat.contains(line)){
                liste_plat.add(line);
            }
        }
        in.close();
        Menu vegNonBothMenu = new Menu(" menu pour Vegan et NonVegan");
        vegNonBothMenu.votreChoix(liste_plat);
        return vegNonBothMenu;
    }
}
