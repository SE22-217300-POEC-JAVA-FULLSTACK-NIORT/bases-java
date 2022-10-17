package bases_java;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=keyboardInput.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=keyboardInput.nextLine();

        System.out.print("Votre age : ");
        int age=keyboardInput.nextInt();

        System.out.print("Votre poids : ");
        double poids=keyboardInput.nextDouble();

        System.out.print("\n\n");

        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d ans\nPoids : %.2f Kg\n",nom,
                prenom,age,poids);
    }
}



