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

        for (Vehicule i : this.stockVehicules) { // Pour chaque vehicule dans stockVehicules, ajouter nom à la liste
            liste += i.marque + " ";

        }
        System.out.println(liste);
    }

    // Lister vehicules
    public void listerVehiculesLibres() {
        String liste = "Voitures libres à " + this.lieu + " : ";

        // pour chaque vehicule du vehiculeStock

        for (Vehicule i : this.stockVehicules) { // Pour chaque vehicule dans stockVehicules, ajouter marque à la liste
            if (i.estLouee == false) {
                liste += i.marque + " ";
            }

        }
        System.out.println(liste);
    }

    void louerVehicule(Client client, Vehicule vehicule) { // Prends en argument un client et une voiture
        for (Vehicule i : this.stockVehicules) {
            if (i.estLouee == true || i.locataire == client) {
                System.out.println(
                        "La voiture " + (i.marque) + " a déja été louée à " + (i.locataire.nomClient).toString());
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
