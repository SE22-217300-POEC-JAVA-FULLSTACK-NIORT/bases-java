package java_poo;

import java.util.ArrayList;
import java.util.Arrays;

public class MainGeometrie {
    public static void main(String[] args) {
        var rect=new Rectangle(200,45);
//        var rect2=rect;Ceci va copier la référence
        var rect2=new Rectangle(rect);

//        System.out.println(rect==rect2);
        System.out.println("Affichage avant modifications\n=========================\n" +
                "\n");
//        System.out.printf("Longueur rect : %f.\n",rect.getLongueur());
//        System.out.printf("Largeur rect : %f.\n\n",rect.getLargeur());

//        System.out.printf("Longueur rect2 : %f.\n",rect2.getLongueur());
//        System.out.printf("Largeur rect2 : %f.\n\n",rect2.getLargeur());
        System.out.println(rect);
        System.out.println(rect2);
        System.out.printf("Avant modification :  %b\n",rect.equals(rect2));

        System.out.println("Affichage après modifications\n=========================\n" +
                "\n");

        rect2.setLongueur(700);
        rect2.setLargeur(340);

//        System.out.printf("Longueur rect : %f.\n",rect.getLongueur());
//        System.out.printf("Largeur rect : %f.\n\n",rect.getLargeur());

//        System.out.printf("Longueur rect2 : %f.\n",rect2.getLongueur());
//        System.out.printf("Largeur rect2 : %f.\n\n",rect2.getLargeur());

        System.out.println(rect);
        System.out.println(rect2);
        System.out.printf("Après modification :  %b\n",rect.equals(rect2));

    }
}
