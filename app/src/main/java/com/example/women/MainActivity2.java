package com.example.women;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initializing views
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView7 = findViewById(R.id.imageView7);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        // Set onClickListeners for buttons


        button2.setOnClickListener(v -> {
            // Navigate to MainActivity3
            startActivity(new Intent(MainActivity2.this, MainActivity3.class));
        });

        button3.setOnClickListener(v -> {
            // Initiate emergency call
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:911")); // Emergency number, change as per your region
            startActivity(intent);
        });

        button4.setOnClickListener(v -> {
            // Navigate to MainActivity4
            startActivity(new Intent(MainActivity2.this, MainActivity4.class));
        });

       button5.setOnClickListener(v -> {
            // Open contacts activity
            startActivity(new Intent(MainActivity2.this, Safetyrules.class));
        });
    }
}
