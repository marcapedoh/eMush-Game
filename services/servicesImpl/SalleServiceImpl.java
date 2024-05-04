package services.servicesImpl;

import models.Humain;
import models.Objet;
import models.Salle;
import services.SalleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SalleServiceImpl implements SalleService {

    @Override
    public void addObjectToStoragePack(Salle salle,Objet object) {
        List<Objet> maListObjet=new ArrayList<>();
        if(object!=null && salle!=null){
            maListObjet.add(object);
            salle.setListObjects(maListObjet);
        }
    }

    @Override
    public void showItemsInSalle(Salle salle) {
        for(Objet item: salle.getListObjects()){
                System.out.println(item);
        }
    }

    @Override
    public void searchObject(Salle salle, Humain humain, String objet) {
        if(Objects.equals(objet, "Mycoscan") && salle.getLocation()==""){

        }
    }

}
