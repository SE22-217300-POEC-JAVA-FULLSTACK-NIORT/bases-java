package bases_java;

import java.util.ArrayList;
import java.util.Arrays;

public class Methodes {

    public static double calculDeLaSurfaceDuCercle(double r){
        return Math.pow(r,2)*Math.PI;
    }

    public static int calculDuPerimetreDeRectangle(int longueur,int largeur){
        return 2*(longueur+largeur+67);
    }

    public static int calculDeLaSommeDuTableau(ArrayList<Integer> nombres){
        var somme=0;
        for(int nombre:nombres){
            somme +=nombre;//somme=somme+nombre
        }
        return somme;
    }

    public static ArrayList<Integer> eleverNombresAuCarre(ArrayList<Integer> nombres){
        var nombresAuCarre=new ArrayList<Integer>();
//        for(int nombre:nombres){// 4 5 6 7 8 9
//            nombresAuCarre.add((int)Math.pow(nombre,2));
//        }
        for(int i=0;i<nombres.size();i++){
            nombresAuCarre.add((int)Math.pow(nombres.get(i),2));
        }
        return nombresAuCarre;
    }


    public static void main(String[] args) {
//        Cercle
        var rayon=350.5;
        var surface=calculDeLaSurfaceDuCercle(rayon);
        System.out.println(surface);

//        Calcul du perimetre et de la surface
        var longueur=550;
        var largeur=210;
        var perimetre=calculDuPerimetreDeRectangle(longueur,largeur);

        var longueur2=1000;
        var largeur2=5000;
        var perimetre2=calculDuPerimetreDeRectangle(longueur2,largeur2);

//        somme nombres
        var nombres=new ArrayList<>(Arrays.asList(4,5,6,7,8,9));//16 25 36 47 64 81
        var sommeNombres=calculDeLaSommeDuTableau(nombres);
        System.out.println(sommeNombres);
        var tableauAuCarre=eleverNombresAuCarre(nombres);
        System.out.println(tableauAuCarre);

    }
}
