package at.entensimulation.v1.ZamCafe;

public class CafeLatte extends Getraenk{
    public CafeLatte() {

        beschreibung = "Cafe Latte";
    }

    @Override
    public double kostet() {
        return 3.6;
    }
}
