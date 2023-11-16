package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hacthonActivity extends AppCompatActivity {
     TextView h1,h2,h3,h4,h5,h6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacthon);

        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);
        h3=findViewById(R.id.h3);
        h4=findViewById(R.id.h4);
        h5=findViewById(R.id.h5);
        h6=findViewById(R.id.h6);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               gotohac("https://devpost.com/software");
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotohac("https://www.bing.com/ck/a?!&&p=ef3ebb596c969e34JmltdHM9MTY4OTgxMTIwMCZpZ3VpZD0xZGJkZGM5NC00ZTZhLTY5YjYtMzkzNS1jZTY0NGZjNzY4YzgmaW5zaWQ9NTE5NA&ptn=3&hsh=3&fclid=1dbddc94-4e6a-69b6-3935-ce644fc768c8&psq=hackathonIO&u=a1aHR0cHM6Ly93d3cuaGFja2F0aG9uLmlvL2xvZ2lu&ntb=1");
            }
        });

        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotohac("https://www.bing.com/ck/a?!&&p=dccda7517c912263JmltdHM9MTY4OTgxMTIwMCZpZ3VpZD0xZGJkZGM5NC00ZTZhLTY5YjYtMzkzNS1jZTY0NGZjNzY4YzgmaW5zaWQ9NTIwNA&ptn=3&hsh=3&fclid=1dbddc94-4e6a-69b6-3935-ce644fc768c8&psq=major+league+hacking&u=a1aHR0cHM6Ly9tbGguaW8v&ntb=1");
            }
        });

        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotohac("https://www.bing.com/ck/a?!&&p=05c122b763f33122JmltdHM9MTY4OTgxMTIwMCZpZ3VpZD0xZGJkZGM5NC00ZTZhLTY5YjYtMzkzNS1jZTY0NGZjNzY4YzgmaW5zaWQ9NTE5NQ&ptn=3&hsh=3&fclid=1dbddc94-4e6a-69b6-3935-ce644fc768c8&psq=devfolio&u=a1aHR0cHM6Ly9kZXZmb2xpby5jby8&ntb=1");
            }
        });

        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotohac("https://www.bing.com/ck/a?!&&p=2f88fc0af24297dbJmltdHM9MTY4OTgxMTIwMCZpZ3VpZD0xZGJkZGM5NC00ZTZhLTY5YjYtMzkzNS1jZTY0NGZjNzY4YzgmaW5zaWQ9NTE5OA&ptn=3&hsh=3&fclid=1dbddc94-4e6a-69b6-3935-ce644fc768c8&psq=hackerearth&u=a1aHR0cHM6Ly93d3cuaGFja2VyZWFydGguY29tLw&ntb=1");
            }
        });

        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotohac("https://www.bing.com/ck/a?!&&p=fd59bea3fa65cca7JmltdHM9MTY4OTgxMTIwMCZpZ3VpZD0xZGJkZGM5NC00ZTZhLTY5YjYtMzkzNS1jZTY0NGZjNzY4YzgmaW5zaWQ9NTIwMw&ptn=3&hsh=3&fclid=1dbddc94-4e6a-69b6-3935-ce644fc768c8&psq=hackclub&u=a1aHR0cHM6Ly9oYWNrY2x1Yi5jb20v&ntb=1");
            }
        });
    }

    public void gotohac(String s){
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}