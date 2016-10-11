package erim.test;


import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.os.CountDownTimer;


public class Countdown_2 extends Activity {
    TextView horloge = null;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown_2);


        horloge = (TextView) findViewById(R.id.horloge_2);
        //150000 = value in ms
        new CountDownTimer(150000, 1000) {

            public void onTick(long millisUntilFinished) {
                horloge.setText(""+ millisUntilFinished / 1000);
            }

            public void onFinish() {
                horloge.setText("Fini!");
            }



        }
                .start();
    }
}