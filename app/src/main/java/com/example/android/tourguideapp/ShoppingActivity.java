package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

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
        locations.add(new Location(R.string.res_d, R.string.res_l));
        locations.add(new Location(R.string.mar_d, R.string.mar_l));
        locations.add(new Location(R.string.bri_d, R.string.bri_l));
        locations.add(new Location(R.string.mgr_d, R.string.mgr_l));
        locations.add(new Location(R.string.ubc_d, R.string.ubc_l));
        locations.add(new Location(R.string.for_d, R.string.for_l));
        locations.add(new Location(R.string.sam_d, R.string.sam_l));
        locations.add(new Location(R.string.lev_d, R.string.lev_l));
        locations.add(new Location(R.string.psy_d, R.string.psy_l));
        locations.add(new Location(R.string.cin_d, R.string.cin_l));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations, R.color.category_shopping);

        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(locationAdapter);


    }


}
