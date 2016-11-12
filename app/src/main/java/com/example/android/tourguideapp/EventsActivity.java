package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

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

        setContentView(R.layout.word_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.nof_d, R.string.nof_l));
        locations.add(new Location(R.string.bol_d, R.string.bol_l));
        locations.add(new Location(R.string.cine_d, R.string.cine_l));
        locations.add(new Location(R.string.uni_d, R.string.uni_l));
        locations.add(new Location(R.string.byob_d, R.string.byob_l));
        locations.add(new Location(R.string.demo_d, R.string.demo_l));
        locations.add(new Location(R.string.drum_d, R.string.drum_l));
        locations.add(new Location(R.string.afc_d, R.string.afc_l));
        locations.add(new Location(R.string.cpt_d, R.string.cpt_l));
        locations.add(new Location(R.string.sr_d, R.string.sr_l));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations, R.color.category_events);

        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(locationAdapter);
    }
}
