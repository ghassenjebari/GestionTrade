package com.example.pidev;

import model.ClotureAchat;
import model.DétailsLivraison;
import model.EstimationOffreLivre;
import model.PropositionLivre;
import model.enums.Etat;
import model.enums.EtatCloture;
import model.enums.EtatLivrasion;
import service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        PropositionLivreService ps = new PropositionLivreService();
        EstimationOffreLivreService e=new EstimationOffreLivreService();
        DétailsLivraisonService d=new DétailsLivraisonService();
        ClotureAchatService c=new ClotureAchatService();



        ClientService clientService =new ClientService();
       PropositionLivre p1 = new PropositionLivre
                (0, clientService.get(1), "L'Insoutenable Légèreté de l'être ",
                        "(1984)","Bon etat ");

        PropositionLivre p2 = new PropositionLivre
                (0, clientService.get(1), "J'irai cracher sur vos tombes",
                        "((1946))","etat passable");

        PropositionLivre p3 = new PropositionLivre
                (0, clientService.get(1), "Voyage au bout de la nuit",
                        "1932","Bon etat,");

        PropositionLivre p4 = new PropositionLivre
                (0, clientService.get(1), "Voyage au bout de la nuit",
                        "1932","Bon etat,");


        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);


        System.out.println(clientService.get(1));
        List<PropositionLivre> propositionLivreList = new ArrayList<>();
        propositionLivreList=ps.getall();

        EstimationOffreLivre estimationOffreLivre= new EstimationOffreLivre
                (p1,500,Etat.En_attente);

        estimationOffreLivre=e.add(estimationOffreLivre);
        //  System.out.println(e.getall());



        DétailsLivraison détailsLivraison=new DétailsLivraison(e.get(1),"corniche", EtatLivrasion.EnAttente);

        détailsLivraison=d.add(détailsLivraison);
        //System.out.println(d.getall());


        ClotureAchat clotureAchat=new ClotureAchat(d.get(3),600, EtatCloture.Acceptée,"bonne etat");
        c.add(clotureAchat);
        System.out.println(c.getall());











    }
}
