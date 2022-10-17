package bases_java;

import java.util.Scanner;

public class BoucleDoWhileBestPractice {
    public static void main(String[] args) {
//        1. Limiter le nombre de tentatives à 3
//        2. Si au bout de 3 tentative, l'utilisateur entre des codes PIN erronés, alors
//         Afficher le message appareil bloqué.Mais on lui affiche aussi un message
//         pour lui dire le nombre de mauvaises tentatives.
        var keyboardInput=new Scanner(System.in);
        // Création du code PIN
        System.out.print("Veuillez définir un code PIN : ");
        var codePin=keyboardInput.nextInt();

        // Essais de déverouillage de l'appareil
        int codePinATester=0;
        System.out.print("Veuillez entrer le code PIN pour déverouiller l'appareil :" +
                " ");

        do{
            codePinATester=keyboardInput.nextInt();
            if(codePinATester==codePin){
                System.out.println("Appareil déverouillé!!!!");
                break;
            }

            System.out.print("Code PIN erroné, veuillez recommencer : ");

        } while (true);

    }
}
