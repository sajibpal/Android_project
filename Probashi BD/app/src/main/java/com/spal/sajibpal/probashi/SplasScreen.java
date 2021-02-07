package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplasScreen extends AppCompatActivity {

    ProgressBar bar;
    int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView(R.layout.activity_splas_screen);
        bar=(ProgressBar) findViewById(R.id.proge);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                work();
                next();
            }
        });
        thread.start();
    }

    public  void  work(){

        for(val=5;val<=100;val+=10) {

            try{

                Thread.sleep(300);

            }catch (Exception j){


            }
        }

    }
    public  void next(){

        Intent intent=new Intent(SplasScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
