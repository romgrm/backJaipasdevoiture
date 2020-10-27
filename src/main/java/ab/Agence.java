package ab;

import java.util.ArrayList;

public class Agence {
    String nomAgence;
    String lieu;
    ArrayList<Vehicule> stockVehicules; // Gère une liste de type "Vehicule"

    // Constructeur
    public Agence(String nomAgence, String lieu) {
        this.nomAgence = nomAgence;
        this.lieu = lieu;
        this.stockVehicules = new ArrayList<Vehicule>();
    }

    // Ajouter vehicule: Prends en argument un vehicule crée dans "main", puis
    // l'ajoute à la liste de l'agence dans laquelle elle est appellée
    void ajouterVehicule(Vehicule vehicule) {

        this.stockVehicules.add(vehicule);
    }

    // Lister vehicules
    public void listerVehicules() {
        String liste = "Liste complète des voitures dans le catalogue de " + this.lieu + " : ";

        // pour chaque vehicule du vehiculeStock

        for (Vehicule voiture : this.stockVehicules) { // Pour chaque vehicule dans stockVehicules, ajouter nom à la
                                                       // liste
            liste += voiture.marque + " ";

        }
        System.out.println(liste);
    }

    // Lister vehicules
    public void listerVehiculesLibres() {
        String liste = "Voitures libres à " + this.lieu + " : ";

        // pour chaque vehicule du vehiculeStock

        for (Vehicule voiture : this.stockVehicules) { // Pour chaque vehicule dans stockVehicules, ajouter marque à la
                                                       // liste
            if (voiture.estLouee == false) {
                liste += voiture.marque + " ";
            }

        }
        System.out.println(liste);
    }

    void louerVehicule(Client client, Vehicule vehicule) { // Prends en argument un client et une voiture
        for (Vehicule voiture : this.stockVehicules) {
            if (voiture.estLouee == true || voiture.locataire == client) {
                System.out.println("La voiture " + (voiture.marque) + " a déja été louée à "
                        + (voiture.locataire.nomClient).toString());
                break;
            } else {
                vehicule.estLouee = true;
                vehicule.locataire = client;
                System.out.println("La voiture " + vehicule.marque + " a été louée à " + client.nomClient);
                break;
            }
        }

    }

}
