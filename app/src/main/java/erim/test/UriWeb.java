package erim.test;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by Lycéen on 02/07/2014.
 */
public class UriWeb extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri uri = Uri.parse("http://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
}
