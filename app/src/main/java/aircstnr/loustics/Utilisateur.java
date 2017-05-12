package aircstnr.loustics;


public class Utilisateur {

    private int val = 4; // test pour git
    private String prenom;
    private String nom;
    // ajouter un membre "avatar" de type image


    public Utilisateur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Utilisateur() {
        // constructeur vide, l'utilisateur peut ne pas être défini ATTENTION
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
