package aircstnr.loustics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MathsMultiplication extends AppCompatActivity {


    //private int table; // valeur de la table de multiplications voulue

    //public static final String ERREUR_ACTIVITY_NB_ERREURS = "erreurs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_multiplication);

        // récupération de la table voulue
        //table = getIntent().getIntExtra(Exercice5Activity.EXERCICE_5_VALUE, 1);

        // dynamisation de la création de la table
        //ListView list = (ListView)findViewById(R.id.listViewTable);

        //TextView ligne_1 = (TextView)findViewById(R.id.table_ligne_1);
        //ligne_1.setText(table + " x " + 1 + " =");

        // idem pour toutes les autes lignes



        // AJOUTER LA LIST VIEW

    }

    public void onTableValider(View view) {

        Toast.makeText(this, "Validation...", Toast.LENGTH_SHORT).show();


    }
}
