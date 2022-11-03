package at.entensimulation.v1.ZamCafe;

public abstract class Getraenk {
    protected String beschreibung = "Unbekanntes Getraenk";

    public String getBeschreibung(){
        return beschreibung;
    }

    public abstract double kostet();

}
