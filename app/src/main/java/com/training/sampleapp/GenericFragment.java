package com.training.sampleapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by louis on 28/10/15.
 */
public class GenericFragment extends Fragment {


    private String title;
    private String description;
    private int image;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public GenericFragment(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_generic, container, false);
        TextView textTitle = (TextView)rootView.findViewById(R.id.title);
        textTitle.setText(title);
        TextView descriptionTxt = (TextView)rootView.findViewById(R.id.description);
        descriptionTxt.setText(description);
        ImageView imageView  = (ImageView)rootView.findViewById(R.id.imageView);
        imageView.setImageResource(image);

        return rootView;
    }

}
