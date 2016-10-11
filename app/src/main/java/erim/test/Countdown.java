package erim.test;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.os.CountDownTimer;
import java.util.Calendar;

public class Countdown extends Activity {
    TextView horloge = null;
    long milli;
    long sec;
    long min;
    long heure;
    long jour;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);

        horloge = (TextView)findViewById(R.id.horloge);
        Calendar fin = Calendar.getInstance();
        fin.set(2015/*année*/, Calendar.AUGUST/*mois 0=janvier*/, 23/*jours*/, 17/*heures*/, 55/*minutes*/, 0/*secondes*/);
        Calendar maintenant;
        maintenant = Calendar.getInstance();
        long diff = fin.getTimeInMillis() - maintenant.getTimeInMillis();
        MyCount counter = new MyCount(diff,1000);
        counter.start();
    }
    //countdowntimer is an abstract class, so extend it and fill in methods
    public class MyCount extends CountDownTimer{
        public MyCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }
        @Override
        public void onFinish() {
            horloge.setText("done!");
        }
        @Override
        public void onTick(long millisUntilFinished) {
            milli = millisUntilFinished % 1000;
            sec = ((millisUntilFinished - milli)/ 1000) % 60;
            min = ((millisUntilFinished - milli - sec)/ (1000 * 60) % 60);
            heure = ((millisUntilFinished - milli - sec - min)/ (1000 * 60 * 60) % 24);
            jour = ((millisUntilFinished - milli - sec - min - heure)/ (1000 * 60 * 60 * 24));
            horloge.setText(String.valueOf(jour) + "Jours " + String.valueOf(heure) + "Heures " + String.valueOf(min) + "min " + String.valueOf(sec) + "sec");
            //placer if
        }
    }}