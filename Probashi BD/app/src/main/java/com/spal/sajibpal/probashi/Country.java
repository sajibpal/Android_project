package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.gms.ads.InterstitialAd;



public class Country extends AppCompatActivity {

    ListView vlist;
    String name;
    String[] coun;
    InterstitialAd minterstialad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        this.setTitle("Country");

        vlist=(ListView) findViewById(R.id.list);


        name=getIntent().getStringExtra("option");

        if(name.equals("forieanEmbassy")){

            coun=getResources().getStringArray(R.array.contry2);
        }
        if(name.equals("Country")){

            coun=getResources().getStringArray(R.array.country3);
        }
        if(name.equals("bdEmbassy")){

            coun=getResources().getStringArray(R.array.contry);
        }

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Country.this,R.layout.countrydata,R.id.txt,coun);
        vlist.setAdapter(adapter);

        vlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


               if(name.equals("Country")){

                   Intent intent=new Intent(Country.this,CountryDetails.class);
                   intent.putExtra("name",coun[position]);
                   startActivity(intent);
               }
                if(name.equals("bdEmbassy")){

                    Intent intent=new Intent(Country.this,BdembassyContract.class);
                    intent.putExtra("name",coun[position]);
                    startActivity(intent);
                }
                if(name.equals("forieanEmbassy")){

                    Intent intent=new Intent(Country.this,EmbasyContract.class);
                    intent.putExtra("name",coun[position]);
                    startActivity(intent);
                }

            }
        });


    }


}
