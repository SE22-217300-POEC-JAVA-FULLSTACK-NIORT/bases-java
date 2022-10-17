package bases_java;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        // Création du code PIN
        System.out.print("Veuillez définir un code PIN : ");
        var codePin=keyboardInput.nextInt();

        // Essais de déverouillage de l'appareil
        int codePinATester=0;

        // Tant que le code pin à tester est différent du code pin, alors
        // Demander à l'utilisateur de ressayer
        while (codePinATester!=codePin){
            System.out.print("Veuillez entre le code PIN pour déverouiller l'appareil :" +
                    " ");
            codePinATester=keyboardInput.nextInt();
            if(codePinATester!=codePin){
                System.out.println("Code PIN erroné, veuillez recommencer.");
            }else {
                System.out.println("Appareil déverouillé!!!!");
            }

        }

    }
}
