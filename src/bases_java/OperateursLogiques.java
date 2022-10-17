package bases_java;

import java.util.Scanner;

public class OperateursLogiques {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);
        System.out.print("Entrez une note : ");
        var notePhysique=keyboardInput.nextInt();
        // [0,5] : Catastrophe
        // [6,9] : Mauvaise
        // [10,12] : Assez bien
        // [12, 15] : Bien
        // [16, 19] : Très bien
        // 20 : Excellent
        // & & : ET logique => Condition est évaluée à true si toutes les conditions
        // sont true
        // || : OU logique=> La condition est évaluée à true si au moin une des
        // conditions est à true
        if(notePhysique>=0 && notePhysique<=5 ){
            System.out.println("Catastrophe");
        } else if (notePhysique>5 && notePhysique<=9) {
            System.out.println("Mauvaise");
        }else if(notePhysique>10 && notePhysique<=12){
            System.out.println("Assez bien");
        } else if (notePhysique>12 && notePhysique<=15) {
            System.out.println("Bien");
        }else if(notePhysique>15 && notePhysique<=19){
            System.out.println("Très");
        }else if(notePhysique==20){
            System.out.println("Excellent");
        }else{
            System.out.println("Note invalide");
        }
    }
}
