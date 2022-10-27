package at.entensimulation.v1;

public abstract class Ente {
    String name;
    private Flugverhalten flugverhalten; //1: fliegt, 2: fliegt nicht 3: flattert

    public Ente(String name, Flugverhalten flugverhalten){
        this.name = name;
        this.flugverhalten = flugverhalten;
    }

    public void quaken(){
        System.out.println("Ente::" + name + " quakt");
    }

    public void schwimmen(){
        System.out.println("Ente::" + name + " schwimmt");
    }

    public  void performFliegen(){
        if(flugverhalten != null){
            flugverhalten.fliegen();
        }
        else{
            System.out.println("Ente perforFliegen(): flugverhalten==null, Ente kann nicht fliegen ");
        }

    }
    public abstract void anzeigen();
}
