package at.entensimulation.v1;

public class FlatterFlugverhalten implements Flugverhalten{


    @Override
    public void fliegen() {
        System.out.println("FlatterFlugverhalten::fliegen(): Ente flattert ");
    }
}
