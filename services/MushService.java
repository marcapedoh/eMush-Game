package services;

import models.Humain;
import models.Mush;

public interface MushService {
    void breakSomethingOnDeadalus(String nameOfThing);

    Boolean transformHumanToMush(Humain humain);
    int makeSpore();
   void invotoryShowingForMush(Mush mush);
   int verifyNumberOfSpore(Mush mush);
}
