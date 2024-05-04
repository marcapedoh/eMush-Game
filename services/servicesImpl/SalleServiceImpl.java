package services.servicesImpl;

import models.Salle;
import services.SalleService;

import java.util.List;

public class SalleServiceImpl implements SalleService {

    @Override
    public void addObjectToStoragePack(String object) {
        if(object!=null){
            Salle.addObjectToPack(object);
        }
    }

}
