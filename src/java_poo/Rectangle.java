package java_poo;

public class Rectangle {
     private double longueur;
     private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

//    constructeur de copie
    public Rectangle(Rectangle rect){
        longueur=rect.longueur;
        largeur=rect.largeur;
    }



    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double calculPerimetre(){
        return 2*(longueur+largeur);
    }

    public double calculSurface(){
        return longueur*largeur;
    }

    public String toString(){
        return String.format("Longueur : %f\nLargeur: %f",longueur,largeur);
//        return "Longueur "+longueur+"\nLargeur : "+largeur;
    }


    public boolean equals(Rectangle rect){
        if(rect==null){
            return false;
        }
        return largeur==rect.largeur && longueur==rect.longueur;
    }

//    A ne faire, car toString existe déjà
//    public String formatter(){
//        return String.format("Longueur : %f\nLargeur: %f",longueur,largeur);
//    }
}
