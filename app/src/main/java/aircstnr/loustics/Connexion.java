package aircstnr.loustics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Connexion extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        // récupération de la liste des utilisateurs
        final List<Utilisateur> utilisateurs = UtilisateurDAO.selectAll();

        // objet graphique listView
        listView = (ListView) findViewById(R.id.listViewUtilisateurs);

        // création d'un adapter pour la liste des utilisateurs
        ArrayAdapter<Utilisateur> adapter = new ArrayAdapter<Utilisateur>(this, android.R.layout.simple_list_item_1, utilisateurs);

        // attribution de l'adapter à la listView
        listView.setAdapter(adapter);

        // ajout du listener pour les items de la liste
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //System.out.println(view);
    }
}
