package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class EmbasyContract extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    ImageView callView,webview,mailview;
    String text,countryname,number,webste,mailaddress,embassy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embasy_contract);

        textView = (TextView) findViewById(R.id.contract);
        callView = (ImageView) findViewById(R.id.call);
        webview = (ImageView) findViewById(R.id.website);
        mailview = (ImageView) findViewById(R.id.mail);

        countryname = getIntent().getStringExtra("name");
        callView.setOnClickListener(this);
        webview.setOnClickListener(this);
        mailview.setOnClickListener(this);




                if (countryname.equals("Brazil")) {

                    text = getResources().getString(R.string.Brazil);
                    textView.setText(text);
                    number = "(+88 02)988.7667";
                    webste = "No Website";
                    mailaddress = "brasemb.daca@itamaraty.gov.br";

                }
                if (countryname.equals("Japan")) {

                    text = getResources().getString(R.string.Japan);
                    textView.setText(text);
                    number = "8810087";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Sweden")) {

                    text = getResources().getString(R.string.Sweden);
                    textView.setText(text);
                    number = "8824761-4";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Switzerland")) {

                    text = getResources().getString(R.string.Switzerland);
                    textView.setText(text);
                    number = "8812874-6";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Arab Republic of Egypt")) {

                    text = getResources().getString(R.string.ArabRepublic);
                    textView.setText(text);
                    number = "8822766-7";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Germany")) {

                    text = getResources().getString(R.string.Germanys);
                    textView.setText(text);
                    number = "8824735-7";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Holy See(Vatican)")) {

                    text = getResources().getString(R.string.HolySee);
                    textView.setText(text);
                    number = "8822018";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Iran")) {

                    text = getResources().getString(R.string.Iran);
                    textView.setText(text);
                    number = "8825896";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Afghanistan")) {

                    text = getResources().getString(R.string.Afghanistan);
                    textView.setText(text);
                    number = "9895994";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Morocco")) {

                    text = getResources().getString(R.string.Morocco);
                    textView.setText(text);
                    number = "8823176";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("China")) {

                    text = getResources().getString(R.string.China);
                    textView.setText(text);
                    number = "8824862";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("France")) {

                    text = getResources().getString(R.string.Frances);
                    textView.setText(text);
                    number = "8813811-4";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Indonesia")) {

                    text = getResources().getString(R.string.Indonesia);
                    textView.setText(text);
                    number = "8812260";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Iraq")) {

                    text = getResources().getString(R.string.Iraq);
                    textView.setText(text);
                    number = "8823277";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Italy")) {

                    text = getResources().getString(R.string.Italyes);
                    textView.setText(text);
                    number = "8822781-3";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Republic of Korea")) {

                    text = getResources().getString(R.string.Korea);
                    textView.setText(text);
                    number = "8812088-90";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Philippines")) {

                    text = getResources().getString(R.string.Philippines);
                    textView.setText(text);
                    number = "9881578";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Turkey")) {

                    text = getResources().getString(R.string.Turkey);
                    textView.setText(text);
                    number = "8822198";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Russia")) {

                    text = getResources().getString(R.string.Russia);
                    textView.setText(text);
                    number = "8828147";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("State of Palestine")) {

                    text = getResources().getString(R.string.Palestine);
                    textView.setText(text);
                    number = "9893895-6";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Qatar")) {

                    text = getResources().getString(R.string.Qatar);
                    textView.setText(text);
                    number = "8819930";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Myanmar")) {

                    text = getResources().getString(R.string.Myanmar);
                    textView.setText(text);
                    number = "9896373";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("USA")) {

                    text = getResources().getString(R.string.USA);
                    textView.setText(text);
                    number = "8824700-22";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Libya")) {

                    text = getResources().getString(R.string.Libya);
                    textView.setText(text);
                    number = "9895808-9";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Bhutanese")) {

                    text = getResources().getString(R.string.Bhutanese);
                    textView.setText(text);
                    number = "8826863";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Saudi Arabia")) {

                    text = getResources().getString(R.string.SaudiArabia);
                    textView.setText(text);
                    number = "8829124-31";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Nepal")) {

                    text = getResources().getString(R.string.Nepal);
                    textView.setText(text);
                    number = "9892490";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Netherlands")) {

                    text = getResources().getString(R.string.Netherlands);
                    textView.setText(text);
                    number = "8822715-8";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Norwegian")) {

                    text = getResources().getString(R.string.Norwegian);
                    textView.setText(text);
                    number = "8823065";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Thai")) {

                    text = getResources().getString(R.string.Thai);
                    textView.setText(text);
                    number = "8812795-6";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("DPRK(Korea)")) {

                    text = getResources().getString(R.string.DPRKKorea);
                    textView.setText(text);
                    number = "8811893-9";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Australia")) {

                    text = getResources().getString(R.string.Australian);
                    textView.setText(text);
                    number = "8813101-5";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("United Kingdom")) {

                    text = getResources().getString(R.string.unitedkindom);
                    textView.setText(text);
                    number = "8822705-9";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Canada")) {

                    text = getResources().getString(R.string.Canadian);
                    textView.setText(text);
                    number = "9887091-7";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("SriLanka")) {

                    text = getResources().getString(R.string.SriLankas);
                    textView.setText(text);
                    number = "6896353";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Pakistan")) {

                    text = getResources().getString(R.string.Pakistans);
                    textView.setText(text);
                    number = "8825387-9";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Brunei")) {

                    text = getResources().getString(R.string.brunie);
                    textView.setText(text);
                    number = "8819552";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("India")) {

                    text = getResources().getString(R.string.Indias);
                    textView.setText(text);
                    number = "9888189-91";
                    webste = "No Website";
                    mailaddress = "No Mail";

                }
                if (countryname.equals("Maldives")) {

                    text = getResources().getString(R.string.Maldives);
                    textView.setText(text);
                    number = "+880 2 9882199";
                    webste = "No Website";
                    mailaddress = "admin@maldiveshighcommission.org.bd";
                }
                if (countryname.equals("Malaysia")) {

                    text = getResources().getString(R.string.Malaysian);
                    textView.setText(text);
                    number = "9847759-60";
                    webste = "No Website";
                    mailaddress = "mwdhaka@kln.gov.my";
                }
                if (countryname.equals("Singapore")) {

                    text = getResources().getString(R.string.Singapores);
                    textView.setText(text);
                    number = "9880404";
                    webste = "No Website";
                    mailaddress = "No Mail";
                }
                if (countryname.equals("European Union")) {

                    text = getResources().getString(R.string.EuropeanUnion);
                    textView.setText(text);
                    number = "8824730-2";
                    webste = "No Website";
                    mailaddress = "No Mail";
                }
            }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.call){

            Intent intent=new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+number));
            startActivity(intent);
        }
        if(v.getId()==R.id.website){
             if(webste.equals("No Website")){

                 Toast.makeText(this, "No Website Address", Toast.LENGTH_SHORT).show();
             }
            else{

                 Intent intent=new Intent(EmbasyContract.this,Website.class);
                 intent.putExtra("web",webste);
                 startActivity(intent);

             }
        }
        if(v.getId()==R.id.mail){

            if(mailaddress.equals("No Mail")){

                Toast.makeText(this, "No Mail Address", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent intent=new Intent(EmbasyContract.this,MailActivity.class);
                intent.putExtra("mail",mailaddress);
                startActivity(intent);
            }

        }

    }
}


