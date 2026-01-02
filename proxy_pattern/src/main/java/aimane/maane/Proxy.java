package aimane.maane;

import java.util.Random;

public class Proxy implements Standard {
    //private StandardImpl1 target=new StandardImpl1();
    @Override
    public void process() {
        System.out.println("Vérification du contexte de sécurité");
        boolean b=new Random().nextBoolean();
        if(b) {
            System.out.println("Accès autorisé");
            StandardImpl1 target=new StandardImpl1();
            target.process();
        } else {
            throw new RuntimeException("Accès refusé");
        }
    }
}
