package services;

import models.Humain;

public interface HumainService {
    boolean returnOnEarth();
    boolean cureHuman(Humain humain);
    boolean repareElementOnPILGRED(String element);
    boolean isSleepingOnBed(Humain humain);
    void eatStandardFood(Humain humain);
    void eatCookedFood(Humain humain);
    void deathHuman();
    void grantMouvementPoint();
    void invotoryShowingForHumain(Humain humain);
}
