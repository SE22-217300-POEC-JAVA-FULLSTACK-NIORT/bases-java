package bases_java;

import java.util.Arrays;

public class TableauStatique {
    public static void main(String[] args) {
        // pour les tableau des int : [0,0,0,0,0]
        // pour les tableau des doubles/float : [0.0,0.0,0.0,0.0,0.0]
        // pour les tableau des boolean : [false,false,false,false,false]
        // pour les tableau des String : [null,null,null,null,null]
        int[] notesPhysique=new int[5];

//        Affichage sans boucle
//        System.out.printf("Note 0 : %d\n",notesPhysique[0]);
//        System.out.printf("Note 1 : %d\n",notesPhysique[1]);
//        System.out.printf("Note 2 : %d\n",notesPhysique[2]);
//        System.out.printf("Note 3 : %d\n",notesPhysique[3]);
//        System.out.printf("Note 4 : %d\n",notesPhysique[4]);

        notesPhysique[0]=12;
        notesPhysique[1]=15;
        notesPhysique[2]=18;
        notesPhysique[3]=20;
        notesPhysique[4]=17;


//        Affichage avec la boucle for
        System.out.println("Affichage avec for classique\n=========================");
        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : %d\n",i,notesPhysique[i]);//note[0] : 12
        }
        System.out.println("\n\n");
//        Affichage avec for each
        System.out.println("Affichage avec for each\n=========================");
        for(int valeur:notesPhysique){
            System.out.println(valeur);
        }
//        System.out.println(Arrays.toString(notesPhysique));

    }
}
