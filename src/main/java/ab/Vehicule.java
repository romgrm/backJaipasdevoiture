package ab;

public class Vehicule {
    String marque;
    String couleur;
    int niveauCarburant;
    boolean estLouee;
    Client locataire;

    public Vehicule(String marque, String couleur, int niveauCarburant) {
        this.marque = marque;
        this.couleur = couleur;
        this.niveauCarburant = niveauCarburant;
        if (niveauCarburant < 10) {
            System.out.println("Attention, le niveau de carburant pour la " + this.marque + " n'est que de "
                    + this.niveauCarburant + ", nous allons faire le plein");
            this.niveauCarburant = 100;
            System.out.println("Plein effectué, le niveau de carburant est maintenant de: " + this.niveauCarburant);
        }
    }

}
