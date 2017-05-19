package aircstnr.loustics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }

    public void onValiderInscription(View view) {

        EditText edit_prenom = (EditText) findViewById(R.id.edit_prenom);
        EditText edit_nom = (EditText) findViewById(R.id.edit_nom);

        Utilisateur nouveau = new Utilisateur(edit_prenom.getText().toString(), edit_nom.getText().toString());

        Toast.makeText(this, "Prénom : " + nouveau.getPrenom() + "\tNom : " + nouveau.getNom(), Toast.LENGTH_SHORT).show();

        System.out.println("chaton");
        nouveau.save();

        Toast.makeText(this, "Inscription validée", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Accueil.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
