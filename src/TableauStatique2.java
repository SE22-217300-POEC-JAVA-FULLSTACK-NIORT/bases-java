import java.util.Arrays;
import java.util.Scanner;

public class TableauStatique2 {
    public static void main(String[] args) {
//        1. Tant que l'utilisateur va saisir une taille <= 0, il devra recommencer
//        2. Lors de la saisi des notes, on n'admet que des notes entre 0 et 20
//        3. Calculer la somme des notes
//        4. Calculer la moyenne des notes
//        5. Trouver la note la plus élevée
//        6. Trouver la note la plus faible
        var keyboardInput=new Scanner(System.in);
        System.out.print("Veuiller saisir le nombre de notes à entrer : ");
        var nombreNotes=keyboardInput.nextInt();

        var notesPhysique=new int[nombreNotes];

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : ",i);
            notesPhysique[i]=keyboardInput.nextInt();
        }

        for(int note:notesPhysique){
            System.out.println(note);
        }
    }
}
