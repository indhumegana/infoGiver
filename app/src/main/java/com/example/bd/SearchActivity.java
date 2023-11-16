package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;



public class SearchActivity extends AppCompatActivity {

     LinearLayout internships,courses,jobs,programming_languages,tech_news,hacthons,ai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //assigning id's
        internships=findViewById(R.id.internships);
        courses=findViewById(R.id.courses);
        jobs=findViewById(R.id.jobs);
        programming_languages=findViewById(R.id.programming_languages);
        tech_news=findViewById(R.id.tech_news);
        hacthons=findViewById(R.id.hacthons);
        ai=findViewById(R.id.Ai_apps);

        //onclick listeners
        internships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SearchActivity.this, internshipActivity.class);
                startActivity(i);
            }
        });

        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SearchActivity.this,coursesActivity.class);
                startActivity(i);
            }
        });

       jobs.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(SearchActivity.this, jobsActivity.class);
               startActivity(i);
           }
       });

       programming_languages.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(SearchActivity.this, programmingLangActivity.class);
               startActivity(i);
           }
       });

       tech_news.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(SearchActivity.this, techNewsActivity.class);
               startActivity(i);
           }
       });

       hacthons.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(SearchActivity.this,hacthonActivity.class);
               startActivity(i);
           }
       });
       ai.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(SearchActivity.this, Aiactivity.class);
               startActivity(i);
           }
       });



    }
}




