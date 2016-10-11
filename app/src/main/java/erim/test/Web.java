package erim.test;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends Activity {

    private WebView WebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_webview);
        WebView1 = (WebView) findViewById(R.id.webView1);
        WebView1.getSettings().setJavaScriptEnabled(true);
        WebView1.loadUrl("http://www.gamingroom.tv/");
        this.WebView1.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

    }

}


