package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Immigration extends AppCompatActivity {

    TextView txtrequirmrnt,txtbangladesh,txtforeigner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immigration);

        txtrequirmrnt= (TextView) findViewById(R.id.requirmrnt);
        txtbangladesh= (TextView) findViewById(R.id.bangladesh);
        txtforeigner= (TextView) findViewById(R.id.foreigner);
    }

    public void show(View v){

        if(v.getId()==R.id.requirmrnt){

            Intent intent=new Intent(Immigration.this,CountryDetails.class);
            intent.putExtra("name","immigration");
            startActivity(intent);

        }

        if(v.getId()==R.id.bangladesh){

            Intent intent=new Intent(Immigration.this,Website.class);
            intent.putExtra("web","http://www.immi.gov.bd/bd_depart.php");
            startActivity(intent);

        }
        if(v.getId()==R.id.foreigner){

            Intent intent=new Intent(Immigration.this,Website.class);
            intent.putExtra("web","http://www.immi.gov.bd/frner_depart.php");
            startActivity(intent);
        }
    }
}
