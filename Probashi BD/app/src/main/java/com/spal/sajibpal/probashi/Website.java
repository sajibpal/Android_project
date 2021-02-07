package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class Website extends AppCompatActivity {

    WebView view;
    String address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        view=(WebView) findViewById(R.id.webs);
        address=getIntent().getStringExtra("web");


            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(address));
            startActivity(intent);



    }

    public void onBackPressed(){

        if(view.canGoBack()){

            view.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
}
