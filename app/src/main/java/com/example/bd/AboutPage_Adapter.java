package com.example.bd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AboutPage_Adapter extends RecyclerView.Adapter<AboutPage_Adapter.AboutPageViewHolder>{

    private List<AboutPage_items> aboutPage_items;

    public AboutPage_Adapter(List<AboutPage_items> aboutPage_items) {
        this.aboutPage_items = aboutPage_items;
    }


    @NonNull
    @Override
    public AboutPageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AboutPageViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_about,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull AboutPageViewHolder holder, int position) {
        holder.setAbout_data(aboutPage_items.get(position));
    }

    @Override
    public int getItemCount() {
        return aboutPage_items.size();
    }

    class AboutPageViewHolder extends RecyclerView.ViewHolder {
        private TextView texttitle;
        private TextView textDescription;
        private ImageView imageAbout;

        AboutPageViewHolder(@NonNull View itemView) {
            super(itemView);

            texttitle=itemView.findViewById(R.id.text_Title);
            textDescription=itemView.findViewById(R.id.text_Description);
            imageAbout=itemView.findViewById(R.id.image_about);
        }

        void setAbout_data(AboutPage_items aboutPage_items){
            texttitle.setText(aboutPage_items.getTitle());
            textDescription.setText(aboutPage_items.getDescription());
            imageAbout.setImageResource(aboutPage_items.getImage());
        }

    }

}
