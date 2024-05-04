package models;

import java.util.Scanner;

import static services.ConstantMessageI.messagesMush;

public class Mush extends Joueur{
    public Mush() {
    }

    public Mush(String nom,Salle salle) {
        super(nom,salle);
    }


    public Mush(String nom) {
        super(nom);
    }

    public static void mushMessage(String message){
        messagesMush.add(message);
    }
    public void mushGroupMessage(Scanner sc){
        System.out.println("envoyez un message?(O/N) ");
        String responseMush=sc.next();
        while(responseMush=="O"){
            System.out.println("entrez votre message ");
            mushMessage(sc.nextLine());
            System.out.println("envoyez un message?(O/N) ");
            responseMush=sc.next();
        }
    }

}
