package at.entensimulation.v1;

public class Segelflugverhalte implements Flugverhalten{

    @Override
    public void fliegen() {
        System.out.println("Segelflugverhalten:: fliegen(): Ente segelt");
    }
}
