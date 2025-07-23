package com.example.women;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity5 extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    Button registerButton;
     TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Initialize views
        nameEditText = findViewById(R.id.edit_text_name);
        emailEditText = findViewById(R.id.edit_text_email);
        passwordEditText = findViewById(R.id.edit_text_password);
        registerButton = findViewById(R.id.button_register);


        // Set click listener for register button
        registerButton.setOnClickListener(v -> {
            // Retrieve registration details
            String name = nameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            // Validate registration details
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(MainActivity5.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Perform registration process (e.g., send data to server)
                // For demonstration purposes, display a toast message
                Toast.makeText(MainActivity5.this, "Registration successful", Toast.LENGTH_SHORT).show();

                // Start MainActivity2 after successful registration
                startActivity(new Intent(MainActivity5.this, MainActivity2.class));
            }
        });

        // Set click listener for login text view
        loginTextView.setOnClickListener(v -> {
            // Navigate to the login screen
            // startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            // For demonstration purposes, simply display a toast message
            Toast.makeText(MainActivity5.this, "Navigate to login screen", Toast.LENGTH_SHORT).show();
        });
    }
}
