package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class coursesActivity extends AppCompatActivity {

    TextView geeksforgeeks,tpoint,javatpoint,edx,aicte,oclassrooms,glassdoorcourse;
    TextView codewithharry,nesoacademy,telusuko,cleverprogrammer,programmingwithmosh,jlectures,jbrains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
       geeksforgeeks=findViewById(R.id.geeksforgeeks);
       tpoint=findViewById(R.id.tpoint);
       javatpoint=findViewById(R.id.javatpoint);
       edx=findViewById(R.id.edx);
       aicte=findViewById(R.id.aicte);
       oclassrooms=findViewById(R.id.oclassrooms);
       glassdoorcourse=findViewById(R.id.glassdoorcourse);
       codewithharry=findViewById(R.id.codewithharry);
       nesoacademy=findViewById(R.id.nesoacademy);
       telusuko=findViewById(R.id.telusuko);
       cleverprogrammer=findViewById(R.id.cleverProgrammer);
       programmingwithmosh=findViewById(R.id.programmingwithmosh);
       jlectures=findViewById(R.id.jlectures);
       jbrains=findViewById(R.id.jbrains);

       geeksforgeeks.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               gotoCourse("https://www.geeksforgeeks.org/");
           }
       });

       tpoint.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               gotoCourse("https://www.tutorialspoint.com/latest/prime-packs?msclkid=49c840a526aa1832e43d241ddc6a1ebc");
           }
       });

       javatpoint.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               gotoCourse("https://www.javatpoint.com/");
           }
       });

        edx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.edx.org/");
            }
        });

        aicte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.aicte-india.org/atal");
            }
        });

        oclassrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://openclassrooms.com/en/");
            }
        });

        glassdoorcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.glassdoor.com/blog/free-classes/");
            }
        });

        codewithharry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.youtube.com/results?search_query=code+with+harry");
            }
        });

        nesoacademy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.youtube.com/results?search_query=neso+academy");
            }
        });

        telusuko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.youtube.com/results?search_query=telusuko");
            }
        });

        cleverprogrammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.youtube.com/results?search_query=clever+programmer");
            }
        });

        programmingwithmosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.youtube.com/results?search_query=programming+with+mosh+java");
            }
        });

        jlectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.youtube.com/results?search_query=jennylectures");
            }
        });

        jbrains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCourse("https://www.youtube.com/results?search_query=java+brains");
            }
        });


    }

    //function to redirect to that specific link
    public void gotoCourse(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}