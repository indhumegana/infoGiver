package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AboutPage_Adapter aboutPageAdapter;
    private LinearLayout about_pages_indicator;
    private MaterialButton Search_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about_pages_indicator=findViewById(R.id.about_pages_indicator);
        Search_btn=findViewById(R.id.Search_btn);

        Search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });

        setupAboutItems();

        ViewPager2 aboutApp=findViewById(R.id.about_app);
        aboutApp.setAdapter(aboutPageAdapter);

        setupAboutIndicators();
        setCurrentImageIndicator(0);
        aboutApp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentImageIndicator(position);
            }
        });
    }


    private void setupAboutItems(){
        List<AboutPage_items> aboutPage_items=new ArrayList<>();

        AboutPage_items item1=new AboutPage_items();
        item1.setTitle("");
        item1.setDescription("Wanna Learn more about us Swipe");
        item1.setImage(R.drawable.slide1);

        AboutPage_items item2=new AboutPage_items();
        item2.setTitle("");
        item2.setDescription("");
        item2.setImage(R.drawable.slide2);

        AboutPage_items item3=new AboutPage_items();
        item3.setTitle("");
        item3.setDescription("");
        item3.setImage(R.drawable.slide3);

        AboutPage_items item4=new AboutPage_items();
        item4.setTitle("");
        item4.setDescription("Click on search to explore");
        item4.setImage(R.drawable.slide4);

        aboutPage_items.add(item1);
        aboutPage_items.add(item2);
        aboutPage_items.add(item3);
        aboutPage_items.add(item4);

        aboutPageAdapter=new AboutPage_Adapter(aboutPage_items);


    }

    private void setupAboutIndicators(){
        ImageView[] indicators=new ImageView[aboutPageAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0,8,0);
        for (int i=0;i<indicators.length;i++){
            indicators[i]=new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.about_indicator_unactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            about_pages_indicator.addView(indicators[i]);
        }
    }

    private void setCurrentImageIndicator(int index){
        int childcount=about_pages_indicator.getChildCount();
        for(int i=0;i<childcount;i++){
            ImageView imageView=(ImageView) about_pages_indicator.getChildAt(i);
            if(i==index) {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.about_indicator_active)
                );
               } else{
                    imageView.setImageDrawable(
                            ContextCompat.getDrawable(getApplicationContext(),R.drawable.about_indicator_unactive)
                    );
               }
        }
    }
}