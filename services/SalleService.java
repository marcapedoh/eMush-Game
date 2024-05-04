package services;

import models.Humain;
import models.Joueur;
import models.Objet;
import models.Salle;

public interface SalleService {
    void addObjectToStoragePack(Salle salle,Objet object);

    void showItemsInSalle(Salle salle);
    void searchObject(Salle salle, Humain humain,String objet);
}
