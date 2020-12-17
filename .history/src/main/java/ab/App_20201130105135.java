package ab;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {

        // Creation des agences
        Agence nantesAgence = new Agence("Agence Nantes", "Nantes");
        Agence brestAgence = new Agence("Agence Brest", "Brest");

        // Creation des vehicules
        Vehicule mazda = new Vehicule("Mazda", "rouge", 9);
        Vehicule peugeot = new Vehicule("Peugeot", "rouge", 25);
        Vehicule ferrari = new Vehicule("Ferrari", "rouge", 32);
        Vehicule dacia = new Vehicule("Dacia", "verte", 56);
        Vehicule citroen = new Vehicule("Citroen", "grise", 16);

        // Creation client
        Client bobby = new Client("Bobby");
        Client alex = new Client("Alex");

        // Ajout vehicules
        nantesAgence.ajouterVehicule(mazda);
        nantesAgence.ajouterVehicule(citroen);
        brestAgence.ajouterVehicule(peugeot);
        brestAgence.ajouterVehicule(ferrari);
        brestAgence.ajouterVehicule(dacia);

        // Louer vehicules
        nantesAgence.louerVehicule(bobby, mazda);
        nantesAgence.louerVehicule(bobby, citroen);
        brestAgence.louerVehicule(alex, dacia);

        // Lister vehicules
        // nantesAgence.listerVehicules();
        nantesAgence.listerVehiculesLibres();
        // brestAgence.listerVehicules();
        brestAgence.listerVehiculesLibres();

        n

    }
}
