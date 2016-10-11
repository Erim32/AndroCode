package erim.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sommaire extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sommaire);


        final Button button1 = (Button) findViewById(R.id.button_helloworld);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sommaire.this,	HelloWolrd.class);
                startActivity(intent);

            }
        });



        final Button button2 = (Button) findViewById(R.id.button_uriweb);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sommaire.this,	UriWeb.class);
                startActivity(intent);

            }
        });

        final Button button3 = (Button) findViewById(R.id.button_web);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sommaire.this,	Web.class);
                startActivity(intent);
            }
        });


        final Button button4 = (Button) findViewById(R.id.button_countdown);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Intent intent = new Intent(Sommaire.this,	Countdown.class);
               startActivity(intent);
            }
        });


        final Button button5 = (Button) findViewById(R.id.button_notif);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
           // Toast.makeText(getApplicationContext(), "Non fonctionnel", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Sommaire.this,	Notif.class);
            startActivity(intent);
            }
        });

        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Intent intent = new Intent(Sommaire.this,	Countdown_2.class);
               startActivity(intent);
                

            }
        });

        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Non utilise", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Sommaire.this,	Bouton.class);
                startActivity(intent);
            }
        });

/*      final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Non utilise", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MenuPrincipal.this,	Futur.class);
                //startActivity(intent);
            }
        });

        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Non utilise", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MenuPrincipal.this,	Futur.class);
                //startActivity(intent);
            }
        });

        final Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Non utilise", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MenuPrincipal.this,	Futur.class);
                //startActivity(intent);
            }
        });

        final Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Non utilise", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MenuPrincipal.this,	Futur.class);
                //startActivity(intent);
            }
        });

        final Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Non utilise", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MenuPrincipal.this,	Futur.class);
                //startActivity(intent);
            }
        });
*/
    }
}
