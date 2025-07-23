package com.example.women;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    Button loginButton;
    TextView registerTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextNumberPassword);
        loginButton = findViewById(R.id.button7);
        registerTextView = findViewById(R.id.text_register);

        // Set click listener for login button
        loginButton.setOnClickListener(v -> {
            // Retrieve email and password input
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            // Check if email and password are not empty
            if (!email.isEmpty() && !password.isEmpty()) {
                // Implement your login logic here
                // For demonstration purposes, display a toast message
                Toast.makeText(MainActivity.this, "Logging in...", Toast.LENGTH_SHORT).show();

                // Start MainActivity2
                startActivity(new Intent(MainActivity.this, MainActivity5.class));
            } else {
                Toast.makeText(MainActivity.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
