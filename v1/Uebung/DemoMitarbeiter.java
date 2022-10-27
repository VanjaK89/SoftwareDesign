package at.entensimulation.v1.Uebung;

public class DemoMitarbeiter {
    public static void main(String[] args) {
        System.out.println("Main::Starting out");

        MitarbeiterManager mng = new MitarbeiterManager(new Gewinnverhalten());

        mng.add(new Mitarbeiter("Max", 1000, 299.70));
        mng.add(new Mitarbeiter("Susi", 1000, 299.70));
        mng.add(new Mitarbeiter("Hansi", 1000, 299.70));

        mng.berechneProvision();

        mng.setProvisionsStrategie(new Umsatzverhalten());

        mng.berechneProvision();
        System.out.println("Main::Shutting down");
    }
}
