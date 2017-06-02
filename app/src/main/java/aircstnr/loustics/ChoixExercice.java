package aircstnr.loustics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ChoixExercice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_exercice);
    }

    public void onChoixCG(View view) {
        Toast.makeText(this, "Culture Générale", Toast.LENGTH_SHORT).show();
    }

    public void onChoixMaths(View view) {
        Toast.makeText(this, "Mathématiques", Toast.LENGTH_SHORT).show();
    }



}
