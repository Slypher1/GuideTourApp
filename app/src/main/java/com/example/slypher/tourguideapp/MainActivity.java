package com.example.slypher.tourguideapp;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.slypher.tourguideapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_KEY_LOCATION = "Location";
    public static int indexMenu = 1;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Manage Action Bar
        setSupportActionBar(binding.toolbar);
        final ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        Fragment startFragment = new ExploreFragment();
        // Return to previous status of activity
        switch (indexMenu){
            case 1:
                startFragment = new ExploreFragment();
                actionbar.setTitle(R.string.menu1);
                break;
            case 2:
                startFragment = new FoodFragment();
                actionbar.setTitle(R.string.menu2);
                break;
            case 3:
                startFragment = new FunFragment();
                actionbar.setTitle(R.string.menu3);
                break;
            case 4:
                startFragment = new SleepFragment();
                actionbar.setTitle(R.string.menu4);
                break;
        }

        getSupportFragmentManager().beginTransaction().add(R.id.content_frame, startFragment).commit();

        binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // set item as selected to persist highlight
                item.setChecked(true);
                // close drawer when item is tapped
                binding.drawerLayout.closeDrawers();

                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.nav_explore:
                        indexMenu = 1;
                        fragment = new ExploreFragment();
                        actionbar.setTitle(R.string.menu1);
                        break;
                    case R.id.nav_food:
                        indexMenu = 2;
                        fragment = new FoodFragment();
                        actionbar.setTitle(R.string.menu2);
                        break;
                    case R.id.nav_fun:
                        indexMenu = 3;
                        fragment = new FunFragment();
                        actionbar.setTitle(R.string.menu3);
                        break;
                    case R.id.nav_sleep:
                        indexMenu = 4;
                        fragment = new SleepFragment();
                        actionbar.setTitle(R.string.menu4);
                        break;
                }

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack so the user can navigate back
                transaction.replace (R.id.content_frame, fragment);
                transaction.addToBackStack (null);

                transaction.commit ();

                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                binding.drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
