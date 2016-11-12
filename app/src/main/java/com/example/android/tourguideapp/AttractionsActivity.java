package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

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
        locations.add(new Location(R.string.lal_d, R.string.lal_l, R.drawable.lalbagh));
        locations.add(new Location(R.string.cpark_d, R.string.cpark_l, R.drawable.cubbon_park));
        locations.add(new Location(R.string.vs_d, R.string.vs_l, R.drawable.vidhana_soudha));
        locations.add(new Location(R.string.bp_d, R.string.bp_l, R.drawable.bangalore_palace));
        locations.add(new Location(R.string.jnp_d, R.string.jnp_l, R.drawable.jn_planetarium));
        locations.add(new Location(R.string.bt_d, R.string.bt_l, R.drawable.bull_temple));
        locations.add(new Location(R.string.wl_d, R.string.wl_l, R.drawable.wonder_la));
        locations.add(new Location(R.string.bnp_d, R.string.bnp_l, R.drawable.bn_park));
        locations.add(new Location(R.string.smb_d, R.string.smb_l, R.drawable.st_mary));
        locations.add(new Location(R.string.it_d, R.string.it_l, R.drawable.iskcon));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations, R.color.category_attractions);

        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(locationAdapter);


    }


}
