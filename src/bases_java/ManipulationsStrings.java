package bases_java;

public class ManipulationsStrings {
    public static void main(String[] args) {
        char gender='F';
        String nomComplet="Christian Lisangola Zozor";
        char premiereLettre= nomComplet.charAt(3);

        // Compter le nombre de caractères
        System.out.printf("Nombre de caractères : %d\n",nomComplet.length());

        // Accéder aux  caractères par les indexes
//        System.out.println(premiereLettre);
        var nombreCaracteres=0;
        for(int i=0;i<nomComplet.length();i++){
            System.out.println(nomComplet.charAt(i));
            if(nomComplet.charAt(i)!=' '){
                nombreCaracteres++;
            }
        }

        System.out.println(nombreCaracteres);

    }
}

