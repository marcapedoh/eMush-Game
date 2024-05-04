package models;

import java.util.List;

public class Objet {
    private String objetName;

    private Salle salle;

    private static List<Objet> listObject;

    public static void addObjectToCollection(Objet objet){
        listObject.add(objet);
    }
    public static List<Objet> getCollectionOfObjects(){
        return  Objet.listObject;
    }
    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public String getObjetName() {
        return objetName;
    }

    public void setObjetName(String objetName) {
        this.objetName = objetName;
    }

    public Objet(String objetName) {
        this.objetName = objetName;
    }

    @Override
    public String toString() {
        return "Objet{" +
                "objetName='" + objetName + '\'' +
                '}';
    }
}
