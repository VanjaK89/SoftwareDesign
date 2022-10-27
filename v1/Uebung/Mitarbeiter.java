package at.entensimulation.v1.Uebung;

public class Mitarbeiter {
    private String name;
    private double umsatz;
    private double gewinn;

    public Mitarbeiter(String name, double umsatz, double gewinn) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
    }

    public String getName() {
        return name;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public double getGewinn() {
        return gewinn;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "name='" + name + '\'' +
                ", umsatz=" + umsatz +
                ", gewinn=" + gewinn +
                '}';
    }
}
