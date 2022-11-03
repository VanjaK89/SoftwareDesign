package at.entensimulation.v1.ZamCafe;

public abstract class ZutatDecorator extends Getraenk{
    protected Getraenk getraenk;

    public ZutatDecorator(Getraenk getraenk){
        this.getraenk = getraenk;
    }
    //zwinge alle Klassen die davon ableiten die Methode zu überschreiben
    public abstract String getBeschreibung();
}
