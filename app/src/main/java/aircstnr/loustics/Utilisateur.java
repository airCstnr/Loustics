package aircstnr.loustics;

import com.orm.SugarRecord;

public class Utilisateur extends SugarRecord {

    private String prenom;
    private String nom;
    // ajouter un membre "avatar" de type image


    public Utilisateur(String prenom, String nom) {
        setPrenom(prenom);
        setNom(nom);
    }

    // constructeur vide pour SugarORM
    public Utilisateur() {
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

    @Override
    public String toString() {
        return prenom + ' ' + nom;
    }
}
