/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);    // Find the View that shows the numbers category

        //Set a click listener on attractions view
        TextView attractions = (TextView) findViewById(R.id.attractions);

        // Set a click listener on that attractions View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the attractions View is clicked on.
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });

        //Set a click listener on Restaurants view
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that Restaurants View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the attractions View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        //Set a click listener on Shopping view
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that Shopping View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the attractions View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });
        //Set a click listener on Shopping view
        TextView events = (TextView) findViewById(R.id.events);

        // Set a click listener on that Shopping View
        events.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the attractions View is clicked on.
            @Override
            public void onClick(View view) {
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
            }
        });


    }




    }
