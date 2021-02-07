package com.spal.sajibpal.probashi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    GridView view;
    String[] name;
    AlertDialog.Builder bilder;
    CardView countryinfo,bdembassy,forieanembassy,onlinevisa,immigation,workpermit;
    AdView mAdView;
    InterstitialAd minterstialad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        countryinfo= (CardView) findViewById(R.id.countryinfo);
        countryinfo= (CardView) findViewById(R.id.bdembassy);
        countryinfo= (CardView) findViewById(R.id.workpermit);
        countryinfo= (CardView) findViewById(R.id.onlinevisa);
        countryinfo= (CardView) findViewById(R.id.forieanembassy);
        countryinfo= (CardView) findViewById(R.id.immigation);

        MobileAds.initialize(this,"ca-app-pub-6756845076909977~4580536708");
        interstitialAdshow();
    }


   public void showmenu(View v){

       if (v.getId()==R.id.workpermit) {

           if (minterstialad.isLoaded()) {

               minterstialad.show();

               minterstialad.setAdListener(new AdListener(){
                   @Override
                   public void onAdClosed() {

                       Intent intent = new Intent(MainActivity.this, Country.class);
                       intent.putExtra("option", "Country");
                       minterstialad.loadAd(new AdRequest.Builder().build());
                       startActivity(intent);
                   }
               });

           } else {

               Intent intent = new Intent(MainActivity.this, Country.class);
               intent.putExtra("option", "Country");
               startActivity(intent);
           }
       }
       if (v.getId()==R.id.bdembassy) {

           if (minterstialad.isLoaded()) {

               minterstialad.show();

               minterstialad.setAdListener(new AdListener(){
                   @Override
                   public void onAdClosed() {

                       Intent intent = new Intent(MainActivity.this, Country.class);
                       intent.putExtra("option", "bdEmbassy");
                       minterstialad.loadAd(new AdRequest.Builder().build());
                       startActivity(intent);
                   }
               });

           } else {

               Intent intent = new Intent(MainActivity.this, Country.class);
               intent.putExtra("option", "bdEmbassy");
               startActivity(intent);

           }

       }
       if (v.getId()==R.id.immigation) {

           Intent intent = new Intent(MainActivity.this, Immigration.class);
           startActivity(intent);

       }
       if (v.getId()==R.id.onlinevisa) {

           Intent intent = new Intent(MainActivity.this, OnlineVisa.class);
           startActivity(intent);

       }
       if (v.getId()==R.id.countryinfo) {

           if (minterstialad.isLoaded()) {

               minterstialad.show();

               minterstialad.setAdListener(new AdListener(){
                   @Override
                   public void onAdClosed() {

                       Intent intent = new Intent(MainActivity.this,CountryGallery.class);
                       minterstialad.loadAd(new AdRequest.Builder().build());
                       startActivity(intent);
                   }
               });

           } else {

               Intent intent = new Intent(MainActivity.this,CountryGallery.class);
               startActivity(intent);

           }


       }
       if (v.getId()==R.id.forieanembassy) {

           if (minterstialad.isLoaded()) {

               minterstialad.show();

               minterstialad.setAdListener(new AdListener(){
                   @Override
                   public void onAdClosed() {

                       Intent intent = new Intent(MainActivity.this, Country.class);
                       intent.putExtra("option", "forieanEmbassy");
                       minterstialad.loadAd(new AdRequest.Builder().build());
                       startActivity(intent);
                   }
               });

           } else {

               Intent intent = new Intent(MainActivity.this, Country.class);
               intent.putExtra("option", "forieanEmbassy");
               startActivity(intent);
           }

       }

   }

    private void interstitialAdshow() {

        minterstialad = new InterstitialAd(this);
        minterstialad.setAdUnitId("ca-app-pub-6756845076909977/8798644002");
        minterstialad.loadAd(new AdRequest.Builder().build());
    }

    public  boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.setting,menu);

        return super.onCreateOptionsMenu(menu);
    }
    public  boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId()==R.id.back){

            startActivity(new Intent(MainActivity.this,MailActivity.class).putExtra("mail","sajibpal20@gmail.com"));
        }
        if(item.getItemId()==R.id.about){

            startActivity(new Intent(MainActivity.this,DeveloperProfile.class));
        }

        return super.onOptionsItemSelected(item);
    }

    public  void onBackPressed(){

        bilder=new AlertDialog.Builder(MainActivity.this);

        bilder.setTitle("Exit Application ?");
        bilder.setMessage("Are you sure,You want to exit!");

        bilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        bilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        AlertDialog alert=bilder.create();
        alert.show();
      }

 }

