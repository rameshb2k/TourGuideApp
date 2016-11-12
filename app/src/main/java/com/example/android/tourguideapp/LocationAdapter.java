package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Ramesh on 10/12/2016.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private int backgroundColor;
    public LocationAdapter(Activity context, ArrayList<Location> locations, int backgroundColor)  {
        super(context, 0, locations );
        this.backgroundColor = backgroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

        Location currentLocation = getItem(position);
//set the description of the location
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentLocation.getDescriptionId());
//set the contact information of the location
        TextView contactTextView = (TextView) listItemView.findViewById(R.id.contact_text_view);
        contactTextView.setText(currentLocation.getContactId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_image);
        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        View locationTextContainer = listItemView.findViewById(R.id.location_text_container);
        int color = ContextCompat.getColor(getContext(), backgroundColor);
        locationTextContainer.setBackgroundColor(color);
        return listItemView;
    }
}
