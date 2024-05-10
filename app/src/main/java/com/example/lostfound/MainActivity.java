package com.example.lostfound;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable edge-to-edge display for immersive UI experience
        EdgeToEdge.enable(this);

        // Set the layout for this activity
        setContentView(R.layout.activity_main);

        // Set a click listener for the "New Ad" button
        findViewById(R.id.newAd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the Create_Advert activity
                Intent i = new Intent(MainActivity.this, Create_Advert.class);
                startActivity(i); // Start the Create_Advert activity
            }
        });

        // Set a click listener for the "List Ads" button
        findViewById(R.id.listAds).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the List_Advert activity
                Intent i = new Intent(MainActivity.this, List_Advert.class);
                startActivity(i); // Start the List_Advert activity
            }
        });
    }
}