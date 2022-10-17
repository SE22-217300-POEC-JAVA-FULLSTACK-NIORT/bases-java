package bases_java;

import java.util.ArrayList;

public class TableauDynamiques {
    public static void main(String[] args) {
        // int
        // Integer
        ArrayList<Integer> notesDePhysique=new ArrayList();
        // add : ajouter à la fin
        notesDePhysique.add(12);
        notesDePhysique.add(14);

        // size : Avoir la taille du table
        System.out.printf("Taille : %d\n",notesDePhysique.size());
        notesDePhysique.add(19);
        System.out.printf("Taille : %d\n",notesDePhysique.size());

        // get : lire une donnée à partir de son index
        System.out.printf("Elément à l'index 0 : %d\n",notesDePhysique.get(0));

        // remove : retirer un élément par son index
        notesDePhysique.remove(0);
        System.out.printf("Elément à l'index 0 : %d\n",notesDePhysique.get(0));

        // set : remplacer une valeur par son index
        notesDePhysique.set(0,27);
        System.out.printf("Elément à l'index 0 : %d\n",notesDePhysique.get(0));
        System.out.printf("Taille : %d\n",notesDePhysique.size());
    }
}

// 2 3 4 5 6 7 8
// tableau.remove(0)
// 3 4 5 6 7 8
// tableau.set(1,90)
// 3 90 5 6 7 8

