// MainActivity.java
package com.example.simpleform;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText emailInput;
    private EditText phoneInput;
    private EditText addressInput;
    private Button submitButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        nameInput = findViewById(R.id.editTextName);
        emailInput = findViewById(R.id.editTextEmail);
        phoneInput = findViewById(R.id.editTextText);
        addressInput = findViewById(R.id.editTextText2);

        submitButton = findViewById(R.id.buttonSubmit);

        // Set onClickListener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get input values
                String name = nameInput.getText().toString();
                String email = emailInput.getText().toString();
                String phoneNumber = phoneInput.getText().toString();
                String address = addressInput.getText().toString();

                // Display a toast message on submission
                Toast.makeText(MainActivity.this, "Submitted: " + name + ", " + email + "," + phoneNumber + "," + address+"" , Toast.LENGTH_LONG).show();
            }
        });
    }
}
