package com.example.insertarimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        loadImage();
    }

    private void initWidgets() {
        imageView = findViewById(R.id.iv_fotoPerfil);
    }

    private void loadImage() {
        Picasso.get()
                .load("http://i.imgur.com/DvpvklR.png").into(imageView);


    }
}