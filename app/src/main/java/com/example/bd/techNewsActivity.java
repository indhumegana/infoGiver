package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class techNewsActivity extends AppCompatActivity {
    TextView tn3,tn4,tn5,tn6,tn7,tn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_news);

        tn3=findViewById(R.id.tn3);
        tn4=findViewById(R.id.tn4);
        tn5=findViewById(R.id.tn5);
        tn6=findViewById(R.id.tn6);
        tn7=findViewById(R.id.tn7);
        tn8=findViewById(R.id.tn8);

        tn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNews("https://thetechportal.com/");
            }
        });

        tn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                gotoNews("https://techcrunch.com/");
            }
        });

        tn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               gotoNews("https://www.wired.com/");
            }
        });

        tn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNews("https://www.techradar.com/");
            }
        });

        tn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNews("https://www.macrumors.com/");
            }
        });

        tn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNews("https://www.digitaltrends.com/");
            }
        });
    }

    public void gotoNews(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}