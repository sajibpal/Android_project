package com.spal.sajibpal.probashi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CountryDetails extends AppCompatActivity {


    String[] coun;
    String text;
    TextView txtheader,txtdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);

        txtheader= (TextView) findViewById(R.id.name);
        txtdetails= (TextView) findViewById(R.id.work);

        String name1=getIntent().getStringExtra("name");

        if(name1.equals("Italy")){
            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workitali);
            txtdetails.setText(text);
        }
        if(name1.equals("Span")){
            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workspan);
            txtdetails.setText(text);
        }
        if(name1.equals("France")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workfrance);
            txtdetails.setText(text);
        }
        if(name1.equals("Singapore")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.worksingrapure);
            txtdetails.setText(text);
        }
        if(name1.equals("Germany")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workgermany);
            txtdetails.setText(text);
        }

        if(name1.equals("Australia")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workaustralia);
            txtdetails.setText(text);
        }
        if(name1.equals("Spain")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workspan);
            txtdetails.setText(text);
        }
        if(name1.equals("Thailand")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workthailand);
            txtdetails.setText(text);
        }


        if(name1.equals("Bangladesh")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workbangladesh);
            txtdetails.setText(text);
        }
        if(name1.equals("India")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workindia);
            txtdetails.setText(text);
        }
        if(name1.equals("Pakistan")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workpakistan);
            txtdetails.setText(text);
        }
        if(name1.equals("SriLanka")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text= getResources().getString(R.string.worksrilonka);
            txtdetails.setText(text);
        }
        if(name1.equals("Malaysia")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workmalaysia);
            txtdetails.setText(text);
        }
        if(name1.equals("Canada")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workCanada);
            txtdetails.setText(text);
        }
        if(name1.equals("Japan")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workJapan);
            txtdetails.setText(text);
        }
        if(name1.equals("China")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workChina);
            txtdetails.setText(text);
        }
        if(name1.equals("Qatar")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workQatar);
            txtdetails.setText(text);
        }
        if(name1.equals("Saudi Arabia")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workSaudiArabia);
            txtdetails.setText(text);
        }
        if(name1.equals("South Africa")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workSouthAfrica);
            txtdetails.setText(text);
        }
        if(name1.equals("United Kingdom")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workUnitedKingdom);
            txtdetails.setText(text);
        }
        if(name1.equals("Switzerland")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workSwitzerland);
            txtdetails.setText(text);
        }
        if(name1.equals("Portugal")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workPortugal);
            txtdetails.setText(text);
        }
        if(name1.equals("Maldives")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workMaldives);
            txtdetails.setText(text);
        }
        if(name1.equals("Korea")){

            String header=name1+" Work Permit";
            txtheader.setText(header);
            text=getResources().getString(R.string.workKorea);
            txtdetails.setText(text);
        }
     //for immigration string show
        if(name1.equals("immigration")){

            String header="Requirements for Immigration";
            txtheader.setText(header);
            text=getResources().getString(R.string.immigrations);
            txtdetails.setText(text);
        }

    }
}
