package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MailActivity extends AppCompatActivity {

    Button btn,btn1;
    EditText txt,txt1,txt2;
    String address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        btn=(Button) findViewById(R.id.button);
        btn1=(Button) findViewById(R.id.button1);
        txt=(EditText) findViewById(R.id.text);
        txt1=(EditText) findViewById(R.id.text1);
        txt2=(EditText) findViewById(R.id.text2);

        address=getIntent().getStringExtra("mail");
        txt2.setText(address);
    }

    public  void show(View v){
        try{
            String name=txt.getText().toString();
            String message=txt1.getText().toString();
            String address1=txt2.getText().toString();

            if(v.getId()==R.id.button){

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/mail");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {address1});
                if(address.equals("sajibpal20@gmail.com")) {

                  intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from Probashi");
                }
                intent.putExtra(Intent.EXTRA_TEXT,"name : "+name +"\nMessage : "+message);
                startActivity(intent.createChooser(intent,"Mail with"));
            }
            if(v.getId()==R.id.button1){

                txt.setText("");
                txt1.setText("");
                txt2.setText("");
            }
        }
        catch (Exception e){

            Toast.makeText(this, "Exception : "+e, Toast.LENGTH_SHORT).show();
        }

    }

}
