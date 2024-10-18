package org.example.Presentation;

import org.example.Dao.Etudiant;
import org.example.Dao.EtudiantDAODictionary;
import org.example.Metier.EtudiantManager;

public class Presentation {public static void main(String [] args){
    EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();
    EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

    Etudiant e1 = new Etudiant(1,"Heba","Ladraa","ladraaheba@gmail.com");
    Etudiant e2 = new Etudiant(2,"hiba","sbai","sbaihiba@gmail.com");
    Etudiant e3 = new Etudiant(3,"kawtar","oumida","oumidakawtar@gmail.com");
    Etudiant e4 = new Etudiant( 4,"ikram","samami","ikramsamami@gmail.com");

    etudiantManager.addEtudiant(e1);
    etudiantManager.addEtudiant(e2);
    etudiantManager.addEtudiant(e3);
    etudiantManager.addEtudiant(e4);

    System.out.println("before update : ");
    for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
        System.out.println(etudiant);
    }

    Etudiant etudiantModifie = new Etudiant(4, "ghita", "sbai", "sbaighita@gmail.com");
    etudiantManager.updateEtudiant(etudiantModifie);

    System.out.println("After update : ");
    for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
        System.out.println(etudiant);
    }

}
}
