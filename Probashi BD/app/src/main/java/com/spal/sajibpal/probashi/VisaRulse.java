package com.spal.sajibpal.probashi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class VisaRulse extends AppCompatActivity {

    PDFView pdfview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa_rulse);

        pdfview= (PDFView) findViewById(R.id.pdf);
        pdfview.fromAsset("visa_policy.pdf").load();
    }
}
