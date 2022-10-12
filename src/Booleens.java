import java.util.Scanner;

public class Booleens {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre age : ");
        int age=keyboardInput.nextInt();
        boolean estEtudiant=true;
        boolean estMilitaire=false;
        boolean estMajeur=age>=18;

        if(estMajeur){
            System.out.println("Vous êtes majeur.");
        }else{
            System.out.println("Vous êtes mineur");
        }
    }
}
