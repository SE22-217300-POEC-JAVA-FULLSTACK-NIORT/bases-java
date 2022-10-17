package bases_java;

import java.util.Scanner;

public class E1SigneNombre {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre=keyboardInput.nextInt();
        boolean estPair=nombre%2==0;
        String parite=estPair?"pair":"impair";//opérateur ternaire

//        Sans opérateur ternaire
//        if(estPair){
//            parite="pair";
//        }else{
//            parite="impair";
//        }
//
        if(nombre>0){
            System.out.printf("%d est positif et %s",nombre,parite);
        } else if (nombre<0) {
            System.out.printf("%d est negatif et %s",nombre,parite);
        }else{
            System.out.println("0 et pair");
        }
    }
}
