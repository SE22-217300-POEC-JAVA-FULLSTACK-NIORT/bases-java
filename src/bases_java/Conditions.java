package bases_java;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre age : ");
        int age=keyboardInput.nextInt();
        // > : supérieur à
        // < : inférieur à
        // > =  : supérieur ou égal
        // < = : inférieur ou égal
        // = = : égalité
        // ! = : différent de

        // si age >= 18 alors
        // afficher "Vous êtes majeur"
        // sinon
        // afficher "vous êtes mineur"

        if(age>=18){
            System.out.println("Vous êtes majeur.");
        }else{
            System.out.println("Vous êtes mineur");
        }

    }
}
