package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DeveloperProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_profile);

    }

    public  void show(View v){

        if(v.getId()==R.id.email){

            Intent intent=new Intent(DeveloperProfile.this,MailActivity.class);
            intent.putExtra("mail","sajibpal20@gmail.com");
            startActivity(intent);

        }

        if(v.getId()==R.id.mobile){

            Toast.makeText(this, "No Number ", Toast.LENGTH_SHORT).show();

        }

        if(v.getId()==R.id.facebook){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sajib.pal.121"));
            startActivity(intent);
        }




    }
}
