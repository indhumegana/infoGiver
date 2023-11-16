package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jobsActivity extends AppCompatActivity {

    TextView lk1,gg2,mc3,ub4,in5,nk6,tg7,tm8,flm9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

        lk1=findViewById(R.id.lk1);
        gg2=findViewById(R.id.gg2);
        mc3=findViewById(R.id.mc3);
        ub4=findViewById(R.id.ub4);
        in5=findViewById(R.id.in5);
        nk6=findViewById(R.id.nk6);
        tg7=findViewById(R.id.tg7);
        tm8=findViewById(R.id.tm8);
        flm9=findViewById(R.id.flm9);

        lk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoJob("https://in.linkedin.com/?original_referer=https%3A%2F%2Fwww.bing.com%2F");
            }
        });

        gg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              gotoJob("https://www.google.com/about/careers/applications/jobs/results/");
            }
        });

        mc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               gotoJob("https://careers.microsoft.com/v2/global/en/home.html");
            }
        });

        ub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              gotoJob("https://www.uber.com/in/en/careers/");
            }
        });

        in5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoJob("https://in.indeed.com/");
            }
        });

        nk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoJob("https://www.naukri.com/");
            }
        });

        tg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              gotoJob("https://www.tata.com/careers/jobs");
            }
        });

        tm8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               gotoJob("https://in.best-jobs-online.com/serp/2/?position=Tech+Mahindra&msclkid=511aac661daf151cc247c8df7b098c30&utm_source=bing&utm_medium=cpc&utm_campaign=IN%7CPositionKWs&utm_term=Tech%20Mahindra%20jobs&utm_content=Tech%20Mahindra");
            }
        });

        flm9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 gotoJob("https://frontlinesmedia.in/");
            }
        });

    }

    public void gotoJob(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}