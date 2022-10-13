import java.util.Scanner;

public class BoucleDoWhile {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        // Création du code PIN
        System.out.print("Veuillez définir un code PIN : ");
        var codePin=keyboardInput.nextInt();

        // Essais de déverouillage de l'appareil
        int codePinATester;
        System.out.print("Veuillez entre le code PIN pour déverouiller l'appareil :" +
                " ");
        // Tant que le code pin à tester est différent du code pin, alors
        // Demander à l'utilisateur de ressayer
       do{
            codePinATester=keyboardInput.nextInt();
            if(codePinATester!=codePin){
                System.out.print("Code PIN erroné, veuillez recommencer : ");
            }else {
                System.out.println("Appareil déverouillé!!!!");
            }

        } while (codePinATester!=codePin);

    }
}
