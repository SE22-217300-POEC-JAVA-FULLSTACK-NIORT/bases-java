public class BoucleFor {
    public static void main(String[] args) {
        // connaitre le nombre dont on veut calculer le carré
        // calculer le carré sans boucle for
//        System.out.printf("Le carré de %d est %f\n",2,Math.pow(2,2));
//        System.out.printf("Le carré de %d est %f\n",3,Math.pow(3,2));
//        System.out.printf("Le carré de %d est %f\n",4,Math.pow(4,2));
//        System.out.printf("Le carré de %d est %f\n",5,Math.pow(5,2));
//        System.out.printf("Le carré de %d est %f\n",6,Math.pow(6,2));

        // pour nombre allant de 2 à 6
        //  calculer le carré de nombre
        // Fin

        // nombre=nombre+1 / nombre = nombre - 1
        // nombre +=1 / nombre -=1
        // nombre++ / nombre--
        for(int nombre=2;nombre<=6;nombre++){
            System.out.printf("Le carré de %d est %.1f\n",nombre,Math.pow(nombre,2));
        }
    }
}
