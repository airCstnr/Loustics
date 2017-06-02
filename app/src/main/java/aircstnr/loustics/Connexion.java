package aircstnr.loustics;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.List;

public class Connexion extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    List<Utilisateur> utilisateurs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        // récupération de la liste des utilisateurs
        utilisateurs = UtilisateurDAO.selectAll();

        // objet graphique listView
        listView = (ListView) findViewById(R.id.listViewUtilisateurs);

        // création d'un adapter pour la liste des utilisateurs
        //ArrayAdapter<Utilisateur> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, utilisateurs);

        // Solution customisée
        ArrayAdapter<Utilisateur> adapter = new ArrayAdapter<Utilisateur>(this, R.layout.activity_utilisateur_ligne_connexion, utilisateurs) {
            @NonNull
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                // Inflate LAYOUT
                if(convertView == null){
                    LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    convertView = (ViewGroup)inflater.inflate(R.layout.activity_utilisateur_ligne_connexion, null);
                }

                // VIEW
                TextView text1 = (TextView) convertView.findViewById(R.id.text1);
                TextView text2 = (TextView) convertView.findViewById(R.id.text2);

                // Charger la vue avec les données
                Utilisateur Utilisateur = utilisateurs.get(position);
                text1.setText(Utilisateur.getNom());
                text2.setText(Utilisateur.getPrenom());

                //
                return convertView;
            }
        };
        
        
        
        
        // attribution de l'adapter à la listView
        listView.setAdapter(adapter);

        // ajout du listener pour les items de la liste
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println(utilisateurs.get(position).toString());
    }
}
