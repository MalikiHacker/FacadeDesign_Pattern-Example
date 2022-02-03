package sn.maliki.facade;

import sn.maliki.HotelGerant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static int  choice;

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> liste_des_choix = new ArrayList<Integer>();
        liste_des_choix.add(0);
        liste_des_choix.add(1);
        liste_des_choix.add(2);
        liste_des_choix.add(3);

        do {
        System.out.print("========= Restaurant Campbell-Faty ============ \n");
        System.out.print("            0. Pas affamé, envie de quitter              \n");
        System.out.print("            1. Menu Vegan.              \n");
        System.out.print("            2. Menu Non Vegan.              \n");
        System.out.print("            3. Menu pour Vegan et Non Vegan.            \n");
        System.out.print("Veuillez faire votre choix: ");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        choice=Integer.parseInt(br.readLine());

        HotelGerant hg = new HotelGerant();
        switch (choice) {
            case 0:
            {
                System.out.println("Merci d'être passé, nous espérons vous revoir le plutôt possible.");
            }
            break;
            case 1:
            {
                hg.getVegMenu();
            }
            break;
            case 2:
            {
                hg.getNonVegMenu();
            }
            break;
            case 3:
            {
                hg.getVegNonBothMenu();
            }
            break;
            default:
            {
                System.out.println(" Ce choix n'est pas pris en compte, il doit être un chiffre qui est soit 1 soit 2 soit 3");
            }
        }
    }while(!liste_des_choix.contains(choice));
}
}
