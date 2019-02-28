package com.example.slypher.tourguideapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.slypher.tourguideapp.databinding.LocationListBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {

    LocationListBinding binding;
    private LocationList listLocation;

    public ExploreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding =  DataBindingUtil.inflate(inflater, R.layout.location_list, container, false);
        View rootView = binding.getRoot();

        listLocation = new LocationList(getContext(), R.string.menu1);
        binding.setListOfLocation(listLocation);

        binding.list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent locationIntent = new Intent(getActivity(), LocationActivity.class);
                locationIntent.putExtra(MainActivity.INTENT_KEY_LOCATION, binding.getListOfLocation().locations.get(i));
                startActivity(locationIntent);
            }
        });

        return rootView;
    }

}
