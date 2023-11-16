package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class internshipActivity extends AppCompatActivity {

    TextView linkedin,indeed,google,microsoft,uber,glassdoor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internship);

        linkedin=findViewById(R.id.linkedin);
        indeed=findViewById(R.id.indeed);
        google=findViewById(R.id.google);
        microsoft=findViewById(R.id.microsoft);
        uber=findViewById(R.id.uber);
        glassdoor=findViewById(R.id.glassdoor);

        //when user click on that textview it will take them to that particular site
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInternship("https://in.linkedin.com/?original_referer=https%3A%2F%2Fwww.bing.com%2F");
            }
        });

        indeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInternship("https://in.indeed.com/Internship-jobs?vjk=02594d4bd29deb18");
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInternship("https://careers.google.com/students/");
            }
        });

        microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInternship("https://www.microsoft.com/en-in/msidc/internship.aspx");
            }
        });

        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInternship("https://www.uber.com/in/en/careers/");
            }
        });

        glassdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInternship("https://www.glassdoor.co.in/Job/india-internship-jobs-SRCH_IL.0,5_IN115_KO6,16.htm");
            }
        });
    }

    //function to redirect to that specific link
    public void gotoInternship(String s){
      Uri uri=Uri.parse(s);
      startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}