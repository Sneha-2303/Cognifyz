package com.example.button_interaction; // Change to your app's package name

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to the button
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button myButton = findViewById(R.id.my_button);

        // Set a click listener on the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display a simple message
                Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
