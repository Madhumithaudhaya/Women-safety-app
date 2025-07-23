package com.example.women;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Find the SOS Button ImageView
        ImageView sosButton = findViewById(R.id.imageView8);
        // Load the up and down animation from the XML file
        Animation upDownAnimation = AnimationUtils.loadAnimation(this, R.anim.up_down_animation);
        // Apply the animation to the SOS Button
        sosButton.startAnimation(upDownAnimation);

        // Find the Title TextView
        TextView titleTextView = findViewById(R.id.text_view_title);
        // Find the Description TextView
        TextView descriptionTextView = findViewById(R.id.text_view_description);

        // Load the fade-in animation from the XML file
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in_animation);
        // Apply the animation to the Title and Description TextViews
        titleTextView.startAnimation(fadeInAnimation);
        descriptionTextView.startAnimation(fadeInAnimation);
    }
}
