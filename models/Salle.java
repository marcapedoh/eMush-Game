package models;

import java.util.List;
import java.util.Objects;

public class Salle {
    private String location;
    private static List<Salle> listSalle;
    private List<Joueur> joueurs;
    private List<Objet> listObjects;

    public List<Objet> getListObjects() {
        return listObjects;
    }

    public void setListObjects(List<Objet> listObjects) {
        this.listObjects = listObjects;
    }

    public Salle() {
    }


    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public Salle(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private static List<String> espaceSt;
    public Salle(String location,List<String> espaceSt) {
        this.location=location;
        Salle.espaceSt = espaceSt;
    }
    public List<String> getEspaceSt() {
        return espaceSt;
    }

    public void setEspaceSt(List<String> espaceSt) {
        Salle.espaceSt = espaceSt;
    }


    public static void addSalle(Salle salle){
        listSalle.add(salle);
    }
    public static List<Salle> listOfSalle(){
        return Salle.listSalle;
    }

}
