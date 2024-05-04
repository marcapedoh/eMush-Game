package models;

import static services.ConstantMessageI.messages;

public class Humain extends Joueur {
    private boolean isInfected;
    private boolean isSleeping;
    private int numberSpore;

    private boolean isSatiete;
    public int getNumberSpore() {
        return numberSpore;
    }

    public boolean isSatiete() {
        return isSatiete;
    }

    public void setSatiete(boolean satiete) {
        isSatiete = satiete;
    }

    public void setNumberSpore(int numberSpore) {
        this.numberSpore = numberSpore;
    }


    private void updateStageOfHumain(Humain humain){
        humain.isInfected=humain!=null?true:false;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public boolean isInfected() {
        return isInfected;
    }

    public void setInfected(boolean infected) {
        isInfected = infected;
    }

    public Humain(String nom,Salle salle) {
        super(nom,salle);
    }
    public static void tenLastMessage(){
        for(int i=0;i<10;i++){
            System.out.println(messages.get(messages.size()-i));
        }
    }
}
