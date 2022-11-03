package at.entensimulation.v1.ZamCafe;

public class CaffeHaus {
    public static void main(String[] args) {
        Getraenk g = new Espresso();
        g = new Sirup(g);
        g = new Milch(g);
        g = new Milch(g);
        System.out.println(g.kostet());
        System.out.println(g.getBeschreibung());




    }
}
