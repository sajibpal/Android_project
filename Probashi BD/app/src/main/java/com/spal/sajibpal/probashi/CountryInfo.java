package com.spal.sajibpal.probashi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


public class CountryInfo extends AppCompatActivity {

     ImageView imageView;
      TextView textView;
     String name,text;
     int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Country info");

        imageView= (ImageView) findViewById(R.id.image);
        textView= (TextView) findViewById(R.id.info);

        name=getIntent().getStringExtra("text");

        image=getIntent().getIntExtra("image",0);
        imageView.setImageResource(image);

        if(name.equals("Australia")){

            text = getResources().getString(R.string.Australiinfo);
            textView.setText(text);

        }
        if(name.equals("Austria")){

            text = getResources().getString(R.string.Austriainfo);
            textView.setText(text);

        }
        if(name.equals("Bangladesh")){

            text = getResources().getString(R.string.Bangladeshinfo);
            textView.setText(text);

        } if(name.equals("Bhutan")){

            text = getResources().getString(R.string.Bhutaninfo);
            textView.setText(text);

        }
        if(name.equals("Brazil")){

            text = getResources().getString(R.string.Brazilinfo);
            textView.setText(text);

        }
        if(name.equals("Canada")){

            text = getResources().getString(R.string.Canadainfo);
            textView.setText(text);

        }
        if(name.equals("China")){

            text = getResources().getString(R.string.Chinainfo);
            textView.setText(text);

        } if(name.equals("Denmark")){

            text = getResources().getString(R.string.Denmarkinfo);
            textView.setText(text);

        }
        if(name.equals("France")){

            text = getResources().getString(R.string.Franceinfo);
            textView.setText(text);

        }
        if(name.equals("Germany")){

            text = getResources().getString(R.string.Germanyinfo);
            textView.setText(text);

        }
        if(name.equals("Greece")){

            text = getResources().getString(R.string.Greeceinfo);
            textView.setText(text);

        } if(name.equals("India")){

            text = getResources().getString(R.string.Indiainfo);
            textView.setText(text);

        }
        if(name.equals("Iran")){

            text = getResources().getString(R.string.Iraninfo);
            textView.setText(text);

        }
        if(name.equals("Iraq")){

            text = getResources().getString(R.string.Iraqinfo);
            textView.setText(text);

        }
        if(name.equals("Indonesia")){

            text = getResources().getString(R.string.Indonesiainfo);
            textView.setText(text);

        } if(name.equals("Italy")){

            text = getResources().getString(R.string.Italyinfo);
            textView.setText(text);

        }
        if(name.equals("Japan")){

            text = getResources().getString(R.string.Japaninfo);
            textView.setText(text);

        }
        if(name.equals("Kenya")){

            text = getResources().getString(R.string.Kenyainfo);
            textView.setText(text);

        }
        if(name.equals("Korea")){

            text = getResources().getString(R.string.Koreainfo);
            textView.setText(text);

        } if(name.equals("Kuwait")){

            text = getResources().getString(R.string.Kuwaitinfo);
            textView.setText(text);

        }
        if(name.equals("Libya")){

            text = getResources().getString(R.string.Libyainfo);
            textView.setText(text);

        }
        if(name.equals("Malaysia")){

            text = getResources().getString(R.string.Malaysiainfo);
            textView.setText(text);

        }
        if(name.equals("Mexico")){

            text = getResources().getString(R.string.Mexicoinfo);
            textView.setText(text);

        } if(name.equals("Myanmar")){

            text = getResources().getString(R.string.Myanmarinfo);
            textView.setText(text);

        }
        if(name.equals("Maldives")){

            text = getResources().getString(R.string.Maldivesinfo);
            textView.setText(text);

        }
        if(name.equals("Nepal")){

            text = getResources().getString(R.string.Nepalinfo);
            textView.setText(text);

        }
        if(name.equals("Netherlands")){

            text = getResources().getString(R.string.Netherlandsinfo);
            textView.setText(text);

        } if(name.equals("Oman")){

            text = getResources().getString(R.string.Omaninfo);
            textView.setText(text);

        }
        if(name.equals("Pakistan")){

            text = getResources().getString(R.string.Pakistaninfo);
            textView.setText(text);

        }
        if(name.equals("Portugal")){

            text = getResources().getString(R.string.Portugalinfo);
            textView.setText(text);

        }
        if(name.equals("Philippines")){

            text = getResources().getString(R.string.Philippinesinfo);
            textView.setText(text);

        } if(name.equals("Qatar")){

            text = getResources().getString(R.string.Qatarinfo);
            textView.setText(text);

        }
        if(name.equals("SriLanka")){

            text = getResources().getString(R.string.SriLankainfo);
            textView.setText(text);

        }
        if(name.equals("Spain")){

            text = getResources().getString(R.string.Spaininfo);
            textView.setText(text);

        }
        if(name.equals("Saudi Arabia")){

            text = getResources().getString(R.string.SaudiArabiainfo);
            textView.setText(text);

        } if(name.equals("Singapore")){

            text = getResources().getString(R.string.Singaporeinfo);
            textView.setText(text);

        }
        if(name.equals("Sweden")){

            text = getResources().getString(R.string.Swedeninfo);
            textView.setText(text);

        }
        if(name.equals("Switzerland")){

            text = getResources().getString(R.string.Switzerlandinfo);
            textView.setText(text);

        }
        if(name.equals("South Africa")){

            text = getResources().getString(R.string.SouthAfricainfo);
            textView.setText(text);

        } if(name.equals("Thailand")){

            text = getResources().getString(R.string.Thailandinfo);
            textView.setText(text);

        }
        if(name.equals("Vietnam")){

            text = getResources().getString(R.string.Vietnaminfo);
            textView.setText(text);

        }
        if(name.equals("UAE")){

            text = getResources().getString(R.string.UAEinfo);
            textView.setText(text);

        }
        if(name.equals("United Kingdom")){

            text = getResources().getString(R.string.UnitedKingdominfo);
            textView.setText(text);

        }
        if(name.equals("USA")){

            text = getResources().getString(R.string.USAinfo);
            textView.setText(text);

        }

    }
}
