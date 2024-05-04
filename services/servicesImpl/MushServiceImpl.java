package services.servicesImpl;

import models.Humain;
import models.Joueur;
import models.Mush;
import models.Objet;
import services.MushService;

import java.time.Instant;

public class MushServiceImpl implements MushService {
    @Override
    public void breakSomethingOnDeadalus(String nameOfThing) {
        System.out.println(nameOfThing!=null? "objet détruit": "vous ne pouvez pas détruir un element vide");
    }

    @Override
    public Boolean transformHumanToMush(Humain humain) {
        models.Joueur ristourne=null;
        if(makeSpore()==1){
            humain.setInfected(humain != null && humain.isInfected() == false);
            humain.setNumberSpore((humain!=null && humain.getNumberSpore()<3)?humain.getNumberSpore()+1:humain.getNumberSpore());
            ristourne = humain.getNumberSpore()== 3? new Mush():humain;
        }
        return ristourne instanceof Mush;
    }

    @Override
    public int makeSpore() {
        int number=0;
        System.out.println("spore crée avec succès");
        number+=1;
        return number;
    }

    @Override
    public void invotoryShowingForMush(Mush mush) {
        System.out.println("la liste des inventaires");
        for(Objet inventory: mush.getInventaire()){
            System.out.println(inventory.toString());
        }
    }

    @Override
    public int verifyNumberOfSpore(Mush mush) {
        int number=0;
        for(Objet element: mush.getInventaire()){
            if(element.getObjetName()=="mush".toLowerCase()&& number<=4){
                number+=1;
            }
        }
        return number;
    }
}
