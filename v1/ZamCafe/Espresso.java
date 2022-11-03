package at.entensimulation.v1.ZamCafe;

public class Espresso extends Getraenk{


    public Espresso() {
        beschreibung = "Espresso";
    }


    @Override
    public double kostet() {
        return 2.5;
    }
}
