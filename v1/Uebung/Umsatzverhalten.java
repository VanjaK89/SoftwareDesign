package at.entensimulation.v1.Uebung;

public class Umsatzverhalten implements Provisionverhalten{

    @Override
    public double provision(Mitarbeiter m) {
        System.out.println("Umsatzverhalten::You all get 5% of the salary");
        double count = 0;
        count = m.getUmsatz() * 0.05;
        return count;

    }

}
