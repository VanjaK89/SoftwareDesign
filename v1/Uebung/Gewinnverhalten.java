package at.entensimulation.v1.Uebung;

public class Gewinnverhalten implements Provisionverhalten{

    @Override
    public double provision(Mitarbeiter m) {
        System.out.println("Gewinverhalten::You get provision in the amount of 10% from the win");
        double count = 0;
        count = m.getGewinn() * 0.1;
        return count;
    }
}
