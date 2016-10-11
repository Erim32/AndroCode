package erim.test;

/**
 * Created by Lycéen on 05/07/2014.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bouton extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bouton);

        final Button button = (Button) findViewById(R.id.button_bouton1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This is a Toast", Toast.LENGTH_SHORT).show();

            }
        });

    }

}