package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the History category
        TextView history = (TextView) findViewById(R.id.history);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyIntent);
            }
        });

        // Find the View that shows the family fun category
        TextView nights = (TextView) findViewById(R.id.nightOut);

        // Set a click listener on that View
        nights.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nightsIntent = new Intent(MainActivity.this,  NightOutActivity.class);
                startActivity(nightsIntent);
            }
        });

        // Find the View that shows the night out category
        TextView scenery = (TextView) findViewById(R.id.scenary);

        // Set a click listener on that View
        scenery.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sceneryIntent = new Intent(MainActivity.this, ScenaryActivity.class);
                startActivity(sceneryIntent);
            }
        });


        // Find the View that shows the scenary category
        TextView family = (TextView) findViewById(R.id.familyFun);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the scenary View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyFunActivity.class);
                startActivity(familyIntent);
            }
        });
    }
}
