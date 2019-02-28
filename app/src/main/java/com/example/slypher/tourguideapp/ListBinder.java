package com.example.slypher.tourguideapp;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * I followed this tutorial for the implementation of data bindings with the listview
 * http://blog.trsquarelab.com/2016/01/data-binding-in-android-listview.html
 */

public class ListBinder {
    @BindingAdapter("bind:imageRes")
    public static void bindImage(ImageView view, int r) {
        view.setImageResource(r);
    }

    @BindingAdapter("bind:items")
    public static void bindList(ListView view, ArrayList<Location> locations) {
        LocationAdapter adapter = new LocationAdapter((Activity)view.getContext(), locations);
        view.setAdapter(adapter);
    }
}
