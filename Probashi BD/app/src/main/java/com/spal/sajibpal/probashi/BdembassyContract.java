package com.spal.sajibpal.probashi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BdembassyContract extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    ImageView callView,webview,mailview;
    String text,countryname,number,webste,mailaddress,embassy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdembassy_contract);

        textView= (TextView) findViewById(R.id.contract);
        callView= (ImageView) findViewById(R.id.call);
        webview= (ImageView) findViewById(R.id.website);
        mailview= (ImageView) findViewById(R.id.mail);

        countryname=getIntent().getStringExtra("name");
        callView.setOnClickListener(this);
        webview.setOnClickListener(this);
        mailview.setOnClickListener(this);


        if (countryname.equals("Bangladesh")) {

            text=getResources().getString(R.string.bangladesh);
            textView.setText(text);
            number ="+88-02-41030444";
            webste="https://probashi.gov.bd";
            mailaddress="secretary@probashi.gov.bd";

        }
        if (countryname.equals("Bhutan(Thimphu)")) {

            text=getResources().getString(R.string.BhutanThimphu);
            textView.setText(text);
            number ="+975-2-322-539";
            webste="www.bangladeshembassy.bt";
            mailaddress="mission.thimphu@mofa.gov.bd";

        }
        if (countryname.equals("India(Agartala)")) {

            text=getResources().getString(R.string.IndiaAgartala);
            textView.setText(text);
            number ="+91-0381-232-4807";
            webste="https://www.bahcagt.org";
            mailaddress="mission.agartala@mofa.gov.bd";

        }
        if (countryname.equals("India(Guwahati)")) {

            text=getResources().getString(R.string.IndiaGuwahati);
            textView.setText(text);
            number ="+91-0361-2200-153";
            webste="http://www.bdahcguwahati.com/";
            mailaddress="guwahati@mofa.gov.bd";

        }
        if (countryname.equals("India(Kolkata)")) {

            text=getResources().getString(R.string.IndiaKolkata);
            textView.setText(text);
            number="+91-33-4012- 7500 ";
            webste="https://bdhc-kolkata.org/";
            mailaddress="mission.kolkata@mofa.gov.bd";

        }
        if (countryname.equals("India(Mumbai)")) {

            text=getResources().getString(R.string.IndiaMumbai);
            textView.setText(text);
            number ="+91-22-22180-101";
            webste="No Website";
            mailaddress="mission.mumbai@mofa.gov.bd";

        }
        if (countryname.equals("India(New Delhi)")) {

            text=getResources().getString(R.string.IndiaNewDelhi);
            textView.setText(text);
            number ="+91-11-2412-1389-94";
            webste="http://www.bdhcdelhi.org/";
            mailaddress="bdhcdelhi@gmail.com";

        }
        if (countryname.equals("Maldives")) {

            text=getResources().getString(R.string.Maldivess);
            textView.setText(text);
            number ="+960-3315-541";
            webste="www.bdhcmaldives.mv";
            mailaddress="bdootmal@dhivehinet.net.mv";

        }
        if (countryname.equals("Pakistan(Islamabad)")) {

            text=getResources().getString(R.string.PakistanIslamabad);
            textView.setText(text);
            number ="+92-51-227-9267";
            webste="https://www.bdhcpk.org/";
            mailaddress="mission.islamabad@mofa.gov.bd";

        }
        if (countryname.equals("Pakistan(Karachi)")) {

            text=getResources().getString(R.string.PakistanKarachi);
            textView.setText(text);
            number ="+92-21-3534-0029";
            webste="http://www.bddhc-karachi.org/cms/";
            mailaddress="bddhckarachi@gmail.com";

        }
        if (countryname.equals("Brunei")) {

            text=getResources().getString(R.string.Brunei);
            textView.setText(text);
            number ="+673-2342- 420";
            webste="https://bdhcbrunei.org/";
            mailaddress="mission.bandarseribegawan@mofa.gov.bd";

        }
        if (countryname.equals("Indonesia")) {

            text=getResources().getString(R.string.Indonesiai);
            textView.setText(text);
            number ="+62-21- 5262-173";
            webste="http://www.bdembassyjakarta.org/bangladesh2013/";
            mailaddress="mission.jakarta@mofa.gov.bd";

        }
        if (countryname.equals("Malaysia")) {

            text=getResources().getString(R.string.Malaysia);
            textView.setText(text);
            number ="+6-03-26040946";
            webste="http://www.bangladesh-highcomkl.com";
            mailaddress="mission.kualalumpur@mofa.gov.bd";

        }
        if (countryname.equals("Myanmar(Sittwe)")) {

            text=getResources().getString(R.string.MyanmarSittwe);
            textView.setText(text);
            number ="+95-43-222-41";
            webste="No Website";
            mailaddress="mission.sittwe@mofa.gov.bd";

        }
        if (countryname.equals("Myanmar(Yangon)")) {

            text=getResources().getString(R.string.MyanmarYangon);
            textView.setText(text);
            number ="+95-1-515-275";
            webste="https://www.bdembassyyangon.org";
            mailaddress="mission.yangon@mofa.gov.bd";

        }
        if (countryname.equals("Philippines")) {

            text=getResources().getString(R.string.Philippine);
            textView.setText(text);
            number ="+63-02- 8817-5001";
            webste="http://bangladeshembassymanila.org/";
            mailaddress="NO Mail";

        }
        if (countryname.equals("Vietnam")) {

            text=getResources().getString(R.string.Vietnam);
            textView.setText(text);
            number ="+84-24-3771-6625";
            webste="http://www.bangladeshembassy.vn/";
            mailaddress="NO Mail";

        }
        if (countryname.equals("Bahrain(Manama)")) {

            text=getResources().getString(R.string.BahrainManama);
            textView.setText(text);
            number ="+973-1723-3925";
            webste="http://www.bdembassy.org.bh";
            mailaddress="mission.manama@mofa.gov.bd";

        }
        if (countryname.equals("Iran(Tehran)")) {

            text=getResources().getString(R.string.IranTehran);
            textView.setText(text);
            number ="+98-21-8860-1781";
            webste="http://www.bdembtehran.org";
            mailaddress="info@bangladoot.ir";

        }
        if (countryname.equals("Iraq(Baghdad)")) {

            text=getResources().getString(R.string.IraqBaghdad);
            textView.setText(text);
            number ="No number";
            webste="No Website";
            mailaddress="bangladoot.baghdad.dip@gmail.com";

        }
        if (countryname.equals("Jordan(Amman)")) {

            text=getResources().getString(R.string.JordanAmman);
            textView.setText(text);
            number ="+962-6-552-9192";
            webste="https://www.bdembassyjordan.com/";
            mailaddress="mission.amman@mofa.gov.bd";

        }
        if (countryname.equals("Kuwait(Kuwait City)")) {

            text=getResources().getString(R.string.KuwaitKuwaitCity);
            textView.setText(text);
            number ="+965-2491-3219";
            webste="No Website";
            mailaddress="mission.kuwait.@mofa.gov.bd";

        }
        if (countryname.equals("Lebanon(Beirut)")) {

            text=getResources().getString(R.string.LebanonBeirut);
            textView.setText(text);
            number ="+961-1842-586";
            webste="http://bangladeshembassybeirut.org/";
            mailaddress="No Mail";

        }
        if (countryname.equals("Oman(Muscat)")) {

            text=getResources().getString(R.string.OmanMuscat);
            textView.setText(text);
            number ="+968-2469-8660";
            webste="http://bdembassyoman.org/en/";
            mailaddress=" mission.muscat@mofa.gov.bd";

        }
        if (countryname.equals("Qatar(Doha)")) {

            text=getResources().getString(R.string.QatarDoha);
            textView.setText(text);
            number ="+974 -4467-1927";
            webste="http://www.bdembassydoha.org/";
            mailaddress="mission.doha@mofa.gov.bd";

        }
        if (countryname.equals("Saudi Arabia(Jeddah)")) {

            text=getResources().getString(R.string.SaudiArabiaJeddah);
            textView.setText(text);
            number ="6878465";
            webste="http://www.bcgjeddah.com/";
            mailaddress="cg@bcgjeddah.com";

        }
        if (countryname.equals("Saudi Arabia(Riyadh)")) {

            text=getResources().getString(R.string.SaudiArabiaRiyadh);
            textView.setText(text);
            number ="+ 966-11-419-5300";
            webste="http://www.bangladeshembassy.org.sa/";
            mailaddress="mission.riyadh@mofa.gov.bd";

        }
        if (countryname.equals("UAE(Abu Dhabi)")) {

            text=getResources().getString(R.string.UAEAbuDhabi);
            textView.setText(text);
            number ="+971-2-446-5100";
            webste="https://www.bdembassy.ae.org/";
            mailaddress="mission.abudhabi@mofa.gov.bd";

        }
        if (countryname.equals("UAE(Dubai Consulate General)")) {

            text=getResources().getString(R.string.UAEDubaiConsulateGeneral);
            textView.setText(text);
            number ="+971-4 -265-1116";
            webste="https://cgbdubai.org/";
            mailaddress="mission.dubai@mofa.gov.bd";

        }

        if (countryname.equals("Nepal")) {

            text=getResources().getString(R.string.nepal);
            textView.setText(text);
            number ="(+977)1-439 0130";
            webste="https://bangladoot.org.np";
            mailaddress="mission.kathmandu@mofa.gov.bd";

        }


        if (countryname.equals("SriLanka")) {

            text=getResources().getString(R.string.SriLanka);
            textView.setText(text);
            number ="+94-11-2695-744";
            webste="https://www.bhccolombo.lk";
            mailaddress="bdhclanka@mofa.gov.bd";

        }

        if (countryname.equals("Malaysia")) {

            text=getResources().getString(R.string.Malaysia);
            textView.setText(text);
            number ="+6-03-26040946";
            webste="http://www.bangladesh-highcomkl.com";
            mailaddress=" mission.kualalumpur@mofa.gov.bd";

        }

        if (countryname.equals("Spain")) {

            text=getResources().getString(R.string.Spain);
            textView.setText(text);
            number ="+34914-019-932";
            webste="http://www.bangladeshembassy.es/";
            mailaddress="bdembm01@gmail.com";

        }

        if (countryname.equals("Singapore")) {

            text=getResources().getString(R.string.Singapore);
            textView.setText(text);
            number ="+65-6255- 0075";
            webste="http://www.bdhc.sg/";
            mailaddress="mission.singapore@mofa.gov.bd";

        }
        if (countryname.equals("Thailand")) {

            text=getResources().getString(R.string.Thailand);
            textView.setText(text);
            number ="+66-2-390-5107-08";
            webste="http://www.bdhc.sg";
            mailaddress="mission.bangkok@mofa.gov.bd";

        }

        if (countryname.equals("Australia(Canberra)")) {

            text=getResources().getString(R.string.AustraliaCanberra);
            textView.setText(text);
            number ="61-2-6290-0511";
            webste="https://www.bhcanberra.com/";
            mailaddress="consular.canberra@mofa.gov.bd ";

        }
        if (countryname.equals("Australia(Sydney)")) {

            text=getResources().getString(R.string.AustraliaSydney);
            textView.setText(text);
            number ="+61-2-832 69 777";
            webste="https://cgbdsydney.gov.bd/";
            mailaddress="mission.sydney@mofa.gov.bd";

        }
        if (countryname.equals("China(Beijing)")) {

            text=getResources().getString(R.string.ChinaBeijing);
            textView.setText(text);
            number ="+86-10-6532-2521";
            webste="https://www.bdembassybeijing.org/";
            mailaddress="cc-bdembassybeijing@hotmail.com";

        }
        if (countryname.equals("China(Hong Kong)")) {

            text=getResources().getString(R.string.ChinaHongKong);
            textView.setText(text);
            number ="+852-2827-4278";
            webste="http://www.bangladeshconsulate.hk/";
            mailaddress="mission.hongkong@mofa.gov.bd ";

        }
        if (countryname.equals("China(Kunming)")) {

            text=getResources().getString(R.string.ChinaKunming);
            textView.setText(text);
            number ="+86-871-6432-9670";
            webste="http://www.bangladeshconsulate.com.cn/";
            mailaddress="cgbdkunming@yahoo.com";

        }
        if (countryname.equals("Japan")) {

            text=getResources().getString(R.string.Japanis);
            textView.setText(text);
            number ="+81-3-3234-5801";
            webste="http://bdembjp.mofa.gov.bd/";
            mailaddress="bdembassy.tokyo@mofa.gov.bd";

        }
        if (countryname.equals("Korea")) {

            text=getResources().getString(R.string.Koreais);
            textView.setText(text);
            number ="+82-2-796-4056";
            webste="http://bdembassykorea.org/";
            mailaddress="mission.seoul@mofa.gov.bd";

        }
        if (countryname.equals("Austria")) {

            text=getResources().getString(R.string.Austria);
            textView.setText(text);
            number ="+43-1-3681111";
            webste="http://www.bangladeshembassy.at/";
            mailaddress="mission.vienna@mofa.gov.bd";

        }
        if (countryname.equals("Belgium")) {

            text=getResources().getString(R.string.Belgium);
            textView.setText(text);
            number ="+32-2-640 -55 00 ";
            webste="http://www.bangladesh-embassy.be/";
            mailaddress="mission.brussels@mofa.gov.bd";

        }
        if (countryname.equals("Denmark")) {

            text=getResources().getString(R.string.Denmark);
            textView.setText(text);
            number ="+45- 3964 -33 03";
            webste="http://www.bangladeshembassy.dk/";
            mailaddress="mission.copenhagen@mofa.gov.bd";

        }
        if (countryname.equals("France")) {

            text=getResources().getString(R.string.France);
            textView.setText(text);
            number ="+33(0)1 46 51- 90 33";
            webste="https://www.bangladoot-paris.org/";
            mailaddress="helpdesk@bangladoot-paris.org";

        }
        if (countryname.equals("Germany")) {

            text=getResources().getString(R.string.Germany);
            textView.setText(text);
            number ="+49(0)-30-3989-7500";
            webste="https://www.bangladeshembassy.de/";
            mailaddress="info.berlin@mofa.gov.bd";

        }
        if (countryname.equals("Greece")) {

            text=getResources().getString(R.string.Greece);
            textView.setText(text);
            number ="+30-2106720250";
            webste="https://bdembassy.gr/";
            mailaddress="mission.athens@mofa.gov.bd";

        }
        if (countryname.equals("Italy(Milan)")) {

            text=getResources().getString(R.string.ItalyMilan);
            textView.setText(text);
            number ="+39-02-8706-8580";
            webste="http://www.bcgmilan.gov.bd/";
            mailaddress="consulategeneralmilan849@gmail.com";

        }
        if (countryname.equals("Italy(Rome)")) {

            text=getResources().getString(R.string.ItalyRome);
            textView.setText(text);
            number ="+39-06-8083-595";
            webste="https://www.bdembassyrome.it/home/";
            mailaddress="bdvisarome@gmail.com";

        }
        if (countryname.equals("Netherlands")) {

            text=getResources().getString(R.string.Netherland);
            textView.setText(text);
            number ="+31-70-328-3722";
            webste="http://www.bangladeshembassy.nl";
            mailaddress="mission.hague@mofa.gov.bd";

        }
        if (countryname.equals("Portugal")) {

            text=getResources().getString(R.string.Portugal);
            textView.setText(text);
            number ="+351-21-3010-840";
            webste="No Website";
            mailaddress="mission.lisbon@mofa.gov.bd";

        }
        if (countryname.equals("Sweden")) {

            text=getResources().getString(R.string.Swedens);
            textView.setText(text);
            number ="+46-8-730- 5850";
            webste="http://bangladoot.se/";
            mailaddress="doot@bangladeshembassy.se";

        }
        if (countryname.equals("Switzerland")) {

            text=getResources().getString(R.string.Switzerlands);
            textView.setText(text);
            number ="+41-22 906 80 20";
            webste="https://www.genevamission.mofa.gov.bd/forms";
            mailaddress="permanentmission.geneva@mofa.gov.bd";

        }
        if (countryname.equals("United Kingdom(Birmingham)")) {

            text=getResources().getString(R.string.UnitedKingdomBirmingham);
            textView.setText(text);
            number ="+44 -121 -622-3650";
            webste="https://www.bdhcbirmingham.org/";
            mailaddress="mission.birmingham@mofa.gov.bd";

        }
        if (countryname.equals("United Kingdom(London)")) {

            text=getResources().getString(R.string.UnitedKingdomLondon);
            textView.setText(text);
            number ="+44-20-7584 0081-4";
            webste="Website:https://bhclondon.org.uk/";
            mailaddress="info@ bhclondon.org.uk";

        }
        if (countryname.equals("United Kingdom(Manchester)")) {

            text=getResources().getString(R.string.UnitedKingdomManchester);
            textView.setText(text);
            number ="(0) 161-3710577";
            webste="http://bahcmanchester.org.uk/";
            mailaddress="mission.manchester@mofa.gov.bd";

        }

        if (countryname.equals("Brazil(Brasilia)")) {

            text=getResources().getString(R.string.BrazilBrasilia);
            textView.setText(text);
            number ="+55-61-3367-3699";
            webste="No Website";
            mailaddress="bdoot.brasilia@mofa.gov.bd";

        }
        if (countryname.equals("Canada(Ottawa)")) {

            text=getResources().getString(R.string.CanadaOttawa);
            textView.setText(text);
            number ="+1-613-236-0138";
            webste="https://www.bdhcottawa.ca/";
            mailaddress="mission.ottawa@mofa.gov.bd";

        }
        if (countryname.equals("Canada(Toronto)")) {

            text=getResources().getString(R.string.CanadaToronto);
            textView.setText(text);
            number ="647-812-2791-2";
            webste="https://bdcgtoronto.ca/";
            mailaddress="mission.toronto@mofa.gov.bd";

        }
        if (countryname.equals("Mexico")) {

            text=getResources().getString(R.string.Mexico);
            textView.setText(text);
            number ="+52 -55-5540-4740";
            webste="No Website";
            mailaddress="mexicocity.mission@mofa.gov.bd";

        }
        if (countryname.equals("USA(Los Angeles)")) {

            text=getResources().getString(R.string.USALosAngeles);
            textView.setText(text);
            number ="1-323-932-0100";
            webste="http://www.bangladeshconsulatela.com/";
            mailaddress="mission.losangeles@mofa.gov.bd";

        }
        if (countryname.equals("USA(New York)")) {

            text=getResources().getString(R.string.USANewYork);
            textView.setText(text);
            number ="+1-212 -599-6767";
            webste="https://www.bdcgny.org/";
            mailaddress="contact@bdcgny.org";

        }
        if (countryname.equals("USA(United Nations)")) {

            text=getResources().getString(R.string.USAUnitedNations);
            textView.setText(text);
            number ="+1 212-867-3434";
            webste="https://bdun.org/";
            mailaddress="bdpmny@gmail.com";

        }
        if (countryname.equals("USA(Washington)")) {

            text=getResources().getString(R.string.USAWashington);
            textView.setText(text);
            number ="+1-202-244-0183";
            webste="http://www.bdembassyusa.org/";
            mailaddress="mission.washington@mofa.gov.bd";

        }
        if (countryname.equals("South Africa")) {

            text=getResources().getString(R.string.SouthAfrica);
            textView.setText(text);
            number ="+27-12- 343 2105-6";
            webste="http://www:bhcpretoria.org";
            mailaddress="mission.pretoria@mofa.gov.bd";

        }
        if (countryname.equals("Libya")) {

            text=getResources().getString(R.string.Libyas);
            textView.setText(text);
            number ="+218-21-4911-199";
            webste="http://www.bangladeshembassylibya.com/";
            mailaddress="mission.tripoli@mofa.gov.bd";

        }
        if (countryname.equals("Kenya")) {

            text=getResources().getString(R.string.Kenya);
            textView.setText(text);
            number ="+254-20-387-0467";
            webste="http://www.bdootnairobi.com/";
            mailaddress="nairobi.mission@mofa.gov.bd";

        }
    }

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
                Intent intent=new Intent(BdembassyContract.this,Website.class);
                intent.putExtra("web",webste);
                startActivity(intent);
            }



        }
        if(v.getId()==R.id.mail){

            if(mailaddress.equals("No Mail")){

                Toast.makeText(this, "No Mail Address", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent intent=new Intent(BdembassyContract.this,MailActivity.class);
                intent.putExtra("mail",mailaddress);
                startActivity(intent);
            }

        }

    }
}
