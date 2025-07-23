package com.example.women;

import android.os.Bundle;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Safetyrules extends AppCompatActivity {

     ImageView imageView10, imageView16, imageView17, imageView18, imageView19, imageView20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seafetyrules);

        // Find ImageView objects by their IDs
        imageView10 = findViewById(R.id.imageView10);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);

        // Example: Set click listener for imageView10
        imageView10.setOnClickListener(v -> {
            // Do something when imageView10 is clicked
        });

        // You can similarly set click listeners or perform any other actions for other ImageViews
    }
}
