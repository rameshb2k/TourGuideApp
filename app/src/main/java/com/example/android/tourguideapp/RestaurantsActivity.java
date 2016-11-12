package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    //up button navigation
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.word_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.mtr_d, R.string.mtr_l));
        locations.add(new Location(R.string.ks_d, R.string.ks_l));
        locations.add(new Location(R.string.dh_d, R.string.dh_l));
        locations.add(new Location(R.string.hm_d, R.string.hm_l));
        locations.add(new Location(R.string.oc_d, R.string.oc_l));
        locations.add(new Location(R.string.ke_d, R.string.ke_l));
        locations.add(new Location(R.string.ab_d, R.string.ab_l));
        locations.add(new Location(R.string.tp_d, R.string.tp_l));
        locations.add(new Location(R.string.cp_d, R.string.cp_l));
        locations.add(new Location(R.string.ipc_d, R.string.ipc_l));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(locationAdapter);


    }


}
