package at.entensimulation.v1.Uebung;

public class Umsatzverhalten implements Provisionverhalten{

    @Override
    public double provision(Mitarbeiter m) {
        System.out.println("Umsatzverhalten::You all get 5% of the salary");
        return  m.getUmsatz() * 0.05;
    }

}
