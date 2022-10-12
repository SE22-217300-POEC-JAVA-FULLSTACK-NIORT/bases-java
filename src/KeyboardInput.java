import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=keyboardInput.nextLine();
        System.out.printf("Nom : %s",nom);
    }
}
