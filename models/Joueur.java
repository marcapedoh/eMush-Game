package models;

import java.util.*;

import static services.ConstantMessageI.messages;

public class Joueur{
    private int pointM;
    private int pointA;
    private int pointMo;
    private int pointV;
    private Salle salle;

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPointV() {
        return pointV;
    }

    public void setPointV(int pointV) {
        this.pointV = pointV;
    }

    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    public void setNumberOfObjects(int numberOfObjects) {
        Joueur.numberOfObjects = numberOfObjects;
    }

    private List<Objet> inventaire;

    public List<Objet> getInventaire() {
        return inventaire;
    }

    public void setInventaire(List<Objet> inventaire) {
        this.inventaire = inventaire;
    }

    private static int numberOfObjects;
    private static List<Joueur> listJoueur;
    private static List<Joueur> managedPlayers;

    public List<Joueur> getManagedPlayers() {
        return managedPlayers;
    }

    public void setManagedPlayers(List<Joueur> managedPlayers) {
        managedPlayers = managedPlayers;
    }

    public static void addManagedPlayer(Joueur joueur){
        managedPlayers.add(joueur);
    }


    public List<Joueur> getListJoueur() {
        return listJoueur;
    }

    public void setListJoueur(List<Joueur> listJoueur) {
        this.listJoueur = listJoueur;
    }
    public static void addPlayer(Joueur joueur){
        listJoueur.add(joueur);
    }

    public static List<Joueur> collectionPlayers(){
        return listJoueur;
    }
    public Joueur(String nom) {
        this.pointM = 12;
        this.pointA = 12;
        this.pointMo = 0;
        this.playerName=nom;
    }

    public int getPointMo() {
        return pointMo;
    }

    public void setPointMo(int pointMo) {
        if(pointMo<=14){
            this.pointMo = pointMo;
        }
    }

    public Joueur(String nom,Salle salle) {
        this.pointM = 12;
        this.pointA = 12;
        this.pointMo = 0;
        this.playerName=nom;
        this.salle=salle;
    }
    public Joueur(){
        this.pointM = 12;
        this.pointA = 12;
        this.pointMo = 0;
    }



    public int getPointM() {
        return pointM;
    }

    public void setPointM(int pointM) {
        this.pointM = pointM;
    }

    public int getPointA() {
        return pointA;
    }

    public void setPointA(int pointA) {
        this.pointA = pointA;
    }
    private static void bringObjectToOurInventory(Salle salle,Joueur joueur, Scanner sc) {
        System.out.println("Voulez-vous ajouté à votre inventaire personnel cet objet? (O/N) ");
        String retour= sc.next();
        List<Objet> listObjet=new ArrayList<>();
        if(Objects.equals(retour, "O")){
            System.out.println("Entrez le nom de l'objet");
            String nom= sc.nextLine();
            for(Objet item: salle.getListObjects()){
                    if(Objects.equals(joueur.getSalle().getLocation(), salle.getLocation()) && Objects.equals(item.getObjetName(), nom) && joueur.getNumberOfObjects()<3){
                        salle.getListObjects().remove(
                                item
                        );
                        listObjet.add(item);
                        joueur.setNumberOfObjects(joueur.getNumberOfObjects()+1);
                    }
                    if(joueur.getNumberOfObjects()==3){
                        System.out.println("vous ne pouvez pas ajouter plus de 3 objets à votre inventaire!");
                    }
            }
            joueur.setInventaire(listObjet);
        }
    }
    private static void depositedAnObject(Salle salle,Objet objet,Joueur joueur, Scanner sc) {
        System.out.println("Voulez-vous déposez un objet? (O/N) ");
        String retour= sc.next();
        List<Objet> list=new ArrayList<>();
        if(Objects.equals(retour, "O")){
            if(objet.getObjetName()!="spore") {
                if (Objects.equals(joueur.getSalle().getLocation(), salle.getLocation())) {
                    list.add(objet);
                    salle.setListObjects(list);
                }
            }else System.out.println("Vous ne pouvez pas ajouté un spore à l'inventaire");
        }
    }
    private static void sendMessageSection(Scanner sc) {
        System.out.println("envoyez un message?(O/N) ");
        String response=sc.next();
        while(Objects.equals(response, "O")){
            System.out.println("entrez votre message ");
            groupMessage(sc.nextLine());
            System.out.println("envoyez un message?(O/N) ");
            response=sc.next();
        }
    }
    public static void groupMessage(String message){
        messages.add(message);
    }
}