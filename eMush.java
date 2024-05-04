import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class eMush {

    public static void main(String[] args){
        //créaiton des salles
        Salle.addSalle(new Salle("Tourelle Alpha Avant"));
        Salle.addSalle(new Salle("Tourelle Beta Avant"));
        Salle.addSalle(new Salle("Pont"));
        Salle.addSalle(new Salle("Jardin Hydroponique"));
        Salle.addSalle(new Salle("Laboratoire"));
        Salle.addSalle(new Salle("Couloir Avant"));
        Salle.addSalle(new Salle("Stockage Avant"));
        Salle.addSalle(new Salle("Infirmerie"));
        Salle.addSalle(new Salle("Tourelle Alpha centre"));
        Salle.addSalle(new Salle("Tourelle Beta centre"));
        Salle.addSalle(new Salle("Couloir central"));
        Salle.addSalle(new Salle("Stockage Alpha centre"));
        Salle.addSalle(new Salle("Stockage Beta centre"));
        Salle.addSalle(new Salle("Dortoir Alpha"));
        Salle.addSalle(new Salle("Nexus"));
        Salle.addSalle(new Salle("Réfectoire"));
        Salle.addSalle(new Salle("Baie Alpha"));
        Salle.addSalle(new Salle("Baie Beta"));
        Salle.addSalle(new Salle("Couloir arrière"));
        Salle.addSalle(new Salle("Stockage Alpha arrière"));
        Salle.addSalle(new Salle("Stockage Beta arrière"));
        Salle.addSalle(new Salle("Baie Alpha 2"));
        Salle.addSalle(new Salle("Baie Icarus"));
        Salle.addSalle(new Salle("Salle des moteurs"));
        Salle.addSalle(new Salle("Tourelle Alpha arrière"));
        Salle.addSalle(new Salle("Tourelle Beta arrière"));

        //création des personnages
        Joueur.addPlayer(new Joueur("Wang Chao"));
        Joueur.addPlayer(new Joueur("Zhong Chun"));
        Joueur.addPlayer(new Joueur("Eleesha Williams"));
        Joueur.addPlayer(new Joueur("Finola Keegan"));
        Joueur.addPlayer(new Joueur("Frieda Bergmann"));
        Joueur.addPlayer(new Joueur("Gioele Rinaldao"));
        Joueur.addPlayer(new Joueur("Jiang Hua"));
        Joueur.addPlayer(new Joueur("Ian Soulton"));
        Joueur.addPlayer(new Joueur("Janice Kent"));
        Joueur.addPlayer(new Joueur("Kim Jin Su"));
        Joueur.addPlayer(new Joueur("Lai Kuan-Ti"));
        Joueur.addPlayer(new Joueur("Paolo Rinaldo"));
        Joueur.addPlayer(new Joueur("Racula Tomescu"));
        Joueur.addPlayer(new Joueur("Roland Zuccali"));
        Joueur.addPlayer(new Joueur("Stephen Seagull"));
        Joueur.addPlayer(new Joueur("Terrence Archer"));

        //création des objets
        Objet.addObjectToCollection(new Objet("Armure"));
        Objet.addObjectToCollection(new Objet("Clé à molette"));
        Objet.addObjectToCollection(new Objet("4 Combinaisons"));
        Objet.addObjectToCollection(new Objet("Paire de gants de protection"));
        Objet.addObjectToCollection(new Objet("Savon"));
        Objet.addObjectToCollection(new Objet("Tablier intachable"));
        Objet.addObjectToCollection(new Objet("Trottinette"));
        Objet.addObjectToCollection(new Objet("3 Extincteurs"));
        Objet.addObjectToCollection(new Objet("Couteau"));
        Objet.addObjectToCollection(new Objet("2 Blasters"));
        Objet.addObjectToCollection(new Objet("1 Grenade"));
        Objet.addObjectToCollection(new Objet("Médikit"));
        Objet.addObjectToCollection(new Objet("2 caméras"));
        Objet.addObjectToCollection(new Objet("Souche de test mush"));
        Objet.addObjectToCollection(new Objet("30 débris métalliques"));
        Objet.addObjectToCollection(new Objet("Chat de Schödinger"));
        Objet.addObjectToCollection(new Objet("30 rations standars"));
        Objet.addObjectToCollection(new Objet("Extracteur de sprores"));
        Objet.addObjectToCollection(new Objet("Sérum rétro-fongique"));
    }







}
