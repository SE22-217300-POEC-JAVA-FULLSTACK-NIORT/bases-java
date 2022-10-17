package java_poo;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double calculPerimetre(){
        return 2*Math.PI*rayon;
    }

    public double calculSurface(){
        return Math.pow(rayon,2)*Math.PI;
    }
}
