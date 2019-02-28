package com.example.slypher.tourguideapp;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.slypher.tourguideapp.databinding.ListItemBinding;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location>{

    ListItemBinding binding;

    public LocationAdapter(Activity context, ArrayList<Location> locations){
        super(context,0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.list_item, parent, false);
        } else {
            binding = DataBindingUtil.getBinding(convertView);
        }

        Location currentLocation = getItem(position);

        binding.setLocation(currentLocation);

        binding.executePendingBindings();

        return binding.getRoot();
    }
}
