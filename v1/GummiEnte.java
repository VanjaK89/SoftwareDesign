package at.entensimulation.v1;

public class GummiEnte extends Ente{

    public GummiEnte(String name) {
        super(name, null);
    }

    @Override
    public void quaken(){
        System.out.println("Ente::" + name + " quietschen");
    }


    @Override
    public void anzeigen() {
        System.out.println("Gummiente:: Gummiente ist hier");
    }
}
