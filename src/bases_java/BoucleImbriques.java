package bases_java;

import java.util.Scanner;

public class BoucleImbriques {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);
        System.out.print("Nombre de départ : ");
        var nombreDepart=keyboardInput.nextInt();

        System.out.print("Nombre limite : ");
        var nombreLimite=keyboardInput.nextInt();

        for(int i=nombreDepart;i<=nombreLimite;i++){
            for(int j=2;j<=13;j++){
                var produit=i*j;
                System.out.printf("%d x %d = %d\n",i,j,produit);
            }
            System.out.println("\n");
        }
    }
}
