package services.servicesImpl;

import models.Humain;
import models.Joueur;
import models.Mush;
import models.Objet;
import services.HumainService;

public class HumainServiceImpl implements HumainService {

    private Joueur joueur;

    public HumainServiceImpl(Joueur joueur) {
        this.joueur = joueur;
    }

    @Override
    public boolean returnOnEarth() {
        boolean possible=true;
        if(joueur!=null){
            for(Joueur joueur: joueur.getListJoueur()){
                if(joueur instanceof Mush){
                    possible= false;
                }

            }
        }
        return possible;
    }

    @Override
    public boolean cureHuman(Humain humain) {
        if ((humain != null && humain.isInfected())) {
            humain.setInfected(false);
        } else {
            humain.setInfected(true);
        }
        return humain.isInfected();
    }

    @Override
    public boolean repareElementOnPILGRED(String element) {
        if(element!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean isSleepingOnBed(Humain humain) {
        humain.setSleeping(humain != null && humain.isSleeping());
        humain.setPointA((humain != null && humain.isSleeping())?humain.getPointA()+1:humain.getPointA());
        return humain.isSleeping();
    }

    @Override
    public void eatStandardFood(Humain humain) {
        humain.setPointA((humain != null && humain.isSleeping())?humain.getPointA()+2:humain.getPointA());
        humain.setPointMo((humain != null && humain.isSleeping())?humain.getPointMo()-1:humain.getPointMo());
    }

    @Override
    public void eatCookedFood(Humain humain) {
        humain.setPointA((humain != null && humain.isSleeping())?humain.getPointA()+4:humain.getPointA());
        humain.setPointMo((humain != null && humain.isSleeping())?humain.getPointMo()+3:humain.getPointMo());
        humain.setSatiete((humain != null && humain.isSatiete()));
    }

    @Override
    public void deathHuman() {
        for (Joueur joueur:Humain.collectionPlayers()){
            if(joueur instanceof Humain && joueur.getPointV()==0){
                Humain.collectionPlayers().remove(
                        joueur
                );
                System.out.println("fin de partie pour le joueur "+joueur.getPlayerName());
            }
        }
    }

    @Override
    public void grantMouvementPoint() {
        for(Joueur joueur1: joueur.getListJoueur()){
            joueur1.setPointM(joueur1.getPointM()+1);
            if(joueur1.getPointM()==0){
                joueur1.setPointA(joueur1.getPointA()-1);
                joueur1.setPointM(joueur1.getPointM()+2);
            }
        }
    }

    @Override
    public void invotoryShowingForHumain(Humain humain) {
        System.out.println("la liste des inventaires");
        for(Objet inventory:humain.getInventaire()){
            System.out.println(inventory.toString());
        }
    }
}
