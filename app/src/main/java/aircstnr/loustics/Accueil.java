package aircstnr.loustics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void onConnexion(View view) {
        Toast.makeText(this, "Connexion", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Connexion.class);
        startActivity(intent);

    }

    public void onInscription(View view) {
        Toast.makeText(this, "Inscription", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Inscription.class);
        startActivity(intent);
    }
}
