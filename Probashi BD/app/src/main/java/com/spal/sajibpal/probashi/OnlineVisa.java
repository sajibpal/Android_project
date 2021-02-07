package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OnlineVisa extends AppCompatActivity {

    TextView txtaplicaton,txtcountry,txtrules;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_visa);

        txtaplicaton= (TextView) findViewById(R.id.application);
        txtcountry= (TextView) findViewById(R.id.mrv);
        txtrules= (TextView) findViewById(R.id.rules);
    }

    public void show(View v){

        if(v.getId()==R.id.application){

            Intent intent=new Intent(OnlineVisa.this,Website.class);
            intent.putExtra("web","http://www.immi.gov.bd/");
            startActivity(intent);
        }

        if(v.getId()==R.id.mrv){

            Intent intent=new Intent(OnlineVisa.this,MrvCountry.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.rules){

            Intent intent=new Intent(OnlineVisa.this,VisaRulse.class);
            startActivity(intent);
        }
    }
}
