package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class CountryGallery extends AppCompatActivity {
    GridView view;
    String[] name;

    int[] flag_image={R.drawable.australia,R.drawable.austria,R.drawable.bangladesh,R.drawable.bhutan,
            R.drawable.brazil,R.drawable.canada,R.drawable.china,R.drawable.denmark,
            R.drawable.france,R.drawable.germany,R.drawable.greece,R.drawable.india,R.drawable.iran,R.drawable.iraq,
            R.drawable.indonesia,R.drawable.italy,R.drawable.japan,R.drawable.kenya,R.drawable.korea,R.drawable.kuwait,
            R.drawable.libya,R.drawable.malaysia,R.drawable.mexico,R.drawable.myanmar,R.drawable.maldives,R.drawable.nepal,
            R.drawable.netherlands,R.drawable.oman,R.drawable.pakistan,R.drawable.portugal,R.drawable.philippines,R.drawable.qatar,
            R.drawable.srilanka,R.drawable.spain,R.drawable.saudiarabia,R.drawable.singapore,R.drawable.sweden,R.drawable.switzerland,
            R.drawable.southafrica,R.drawable.thailand,R.drawable.vietnam,R.drawable.uae,R.drawable.unitedkingdom,R.drawable.usa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_gallery);

        view=(GridView) findViewById(R.id.ok);
        name=getResources().getStringArray(R.array.countery4);
        CustomAdapter adapter=new CustomAdapter(this,name,flag_image);
        view.setAdapter(adapter);


        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(CountryGallery.this, CountryInfo.class);


                intent.putExtra("image",flag_image[position]);
                intent.putExtra("text",name[position]);
                startActivity(intent);

            }
        });

    }

}
