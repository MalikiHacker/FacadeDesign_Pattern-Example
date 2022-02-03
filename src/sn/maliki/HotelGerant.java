package sn.maliki;

import sn.maliki.interfac.*;
import sn.maliki.interfac.nonVeg.NonVegRestaurant;
import sn.maliki.interfac.veg.VegRestaurant;
import sn.maliki.interfac.vegNonBoth.VegNonBothRestaurant;

import java.io.IOException;

public class HotelGerant {
    public Menu getVegMenu() throws IOException {
        VegRestaurant v = new VegRestaurant();
        Menu vegMenu = v.getMenu();
        return vegMenu;
    }

    public Menu getNonVegMenu() throws IOException {
        NonVegRestaurant v = new NonVegRestaurant();
        Menu nonVegMenu = v.getMenu();
        return nonVegMenu;
    }

    public Menu getVegNonBothMenu() throws IOException {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        Menu bothMenu = v.getMenu();
        return bothMenu;
    }
}
