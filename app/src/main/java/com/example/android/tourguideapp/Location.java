package com.example.android.tourguideapp;

import android.util.Log;

/**
 * Created by Ramesh on 10/12/2016.
 */

public class Location {

    private int mDescriptionId;
    private int mContactId;
    private int mImageResourceId = HAS_NO_IMAGE;
    public static final int HAS_NO_IMAGE = -1;


    public Location(int descriptionId, int contactId) {
        this.mDescriptionId = descriptionId;
        this.mContactId = contactId;
    }

    public Location(int descriptionId, int contactId, int imageResourceId) {
        this.mDescriptionId = descriptionId;
        this.mContactId = contactId;
        this.mImageResourceId = imageResourceId;
    }

    public int getDescriptionId() {
        return mDescriptionId;
    }

    public int getContactId() {
        return mContactId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != HAS_NO_IMAGE;
    }

}
