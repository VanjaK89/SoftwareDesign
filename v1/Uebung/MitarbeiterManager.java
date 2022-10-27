package at.entensimulation.v1.Uebung;

import java.util.ArrayList;

public class MitarbeiterManager {
    ArrayList<Mitarbeiter> mng = new ArrayList<>();
    private Provisionverhalten provisionverhalten;

    public MitarbeiterManager(Provisionverhalten provisionverhalten) {
        this.mng = mng;
        this.provisionverhalten = provisionverhalten;
    }

    public void add(Mitarbeiter m){
        mng.add(m);
        System.out.println("MitarbeiterManager:: die mitarbeiter ist erstellt " + m);
    }


    public void berechneProvision(){

        for(Mitarbeiter m: mng){
            double p = -1;
            p =  provisionverhalten.provision(m);
            System.out.println("Alle mitarbeiter: " + m + " Provision " + p);
        }
    }

    public void setProvisionsStrategie( Provisionverhalten p){
         this.provisionverhalten = p;
    }




}
