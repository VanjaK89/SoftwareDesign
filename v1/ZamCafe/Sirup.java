package at.entensimulation.v1.ZamCafe;

public class Sirup extends ZutatDecorator{

    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return 0.5 + getraenk.kostet();
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " , Sirup";
    }
}
