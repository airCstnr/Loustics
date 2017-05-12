package aircstnr.loustics;

import java.util.List;

public class UtilisateurDAO {
    public static List<Utilisateur> selectAll() {
        return Utilisateur.listAll(Utilisateur.class);
    }
}
