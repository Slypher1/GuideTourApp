package com.example.slypher.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

public class LocationList {

    public ArrayList<Location> locations = new ArrayList<Location>();

    /**
     * Generator of Location List
     * @param context: need to take a resource of strings.xml
     * @param category: create the list based on the category
     */
    public LocationList(Context context, int category) {

        switch (category){
            case R.string.menu1:
                locations.add(new Location(context.getString(R.string.explore1_name),
                        context.getString(R.string.explore1_open),
                        context.getString(R.string.explore1_address),
                        context.getString(R.string.explore1_telephone),
                        context.getString(R.string.explore1_email),
                        context.getString(R.string.explore1_web),
                        context.getString(R.string.explore1_description),
                        R.drawable.duomo, R.drawable.ic_duomo));

                locations.add(new Location(context.getString(R.string.explore2_name),
                        context.getString(R.string.explore2_open),
                        context.getString(R.string.explore2_address),
                        context.getString(R.string.explore2_telephone),
                        context.getString(R.string.explore2_email),
                        context.getString(R.string.explore2_web),
                        context.getString(R.string.explore2_description),
                        R.drawable.santamariapressosansatiro, R.drawable.ic_santamariapressosansatiro));

                locations.add(new Location(context.getString(R.string.explore3_name),
                        context.getString(R.string.explore3_open),
                        context.getString(R.string.explore3_address),
                        context.getString(R.string.explore3_telephone),
                        context.getString(R.string.explore3_email),
                        context.getString(R.string.explore3_web),
                        context.getString(R.string.explore3_description),
                        R.drawable.santambrogio, R.drawable.ic_santambrogio));

                locations.add(new Location(context.getString(R.string.explore4_name),
                        context.getString(R.string.explore4_open),
                        context.getString(R.string.explore4_address),
                        context.getString(R.string.explore4_telephone),
                        context.getString(R.string.explore4_email),
                        context.getString(R.string.explore4_web),
                        context.getString(R.string.explore4_description),
                        R.drawable.cenacolo, R.drawable.ic_cenacolo));

                locations.add(new Location(context.getString(R.string.explore5_name),
                        context.getString(R.string.explore5_open),
                        context.getString(R.string.explore5_address),
                        context.getString(R.string.explore5_telephone),
                        context.getString(R.string.explore5_email),
                        context.getString(R.string.explore5_web),
                        context.getString(R.string.explore5_description),
                        R.drawable.bibliotecaambrosiana, R.drawable.ic_bibliotecaambrosiana));

                locations.add(new Location(context.getString(R.string.explore6_name),
                        context.getString(R.string.explore6_open),
                        context.getString(R.string.explore6_address),
                        context.getString(R.string.explore6_telephone),
                        context.getString(R.string.explore6_email),
                        context.getString(R.string.explore6_web),
                        context.getString(R.string.explore6_description),
                        R.drawable.vignaleonardo, R.drawable.ic_vignaleonardo));
                break;
            case R.string.menu2:
                locations.add(new Location(context.getString(R.string.food1_name),
                        context.getString(R.string.food1_open),
                        context.getString(R.string.food1_address),
                        context.getString(R.string.food1_telephone),
                        context.getString(R.string.food1_email),
                        context.getString(R.string.food1_web),
                        context.getString(R.string.food1_description),
                        R.drawable.twistonclassic, R.drawable.ic_twistonclassic));

                locations.add(new Location(context.getString(R.string.food2_name),
                        context.getString(R.string.food2_open),
                        context.getString(R.string.food2_address),
                        context.getString(R.string.food2_telephone),
                        context.getString(R.string.food2_email),
                        context.getString(R.string.food2_web),
                        context.getString(R.string.food2_description),
                        R.drawable.briscola, R.drawable.ic_briscola));

                locations.add(new Location(context.getString(R.string.food3_name),
                        context.getString(R.string.food3_open),
                        context.getString(R.string.food3_address),
                        context.getString(R.string.food3_telephone),
                        context.getString(R.string.food3_email),
                        context.getString(R.string.food3_web),
                        context.getString(R.string.food3_description),
                        R.drawable.anchetrattoria, R.drawable.ic_anchetrattoria));

                locations.add(new Location(context.getString(R.string.food4_name),
                        context.getString(R.string.food4_open),
                        context.getString(R.string.food4_address),
                        context.getString(R.string.food4_telephone),
                        context.getString(R.string.food4_email),
                        context.getString(R.string.food4_web),
                        context.getString(R.string.food4_description),
                        R.drawable.craccoingalleria, R.drawable.ic_cracco));
                break;
            case R.string.menu3:
                locations.add(new Location(context.getString(R.string.fun1_name),
                        context.getString(R.string.fun1_open),
                        context.getString(R.string.fun1_address),
                        context.getString(R.string.fun1_telephone),
                        context.getString(R.string.fun1_email),
                        context.getString(R.string.fun1_web),
                        context.getString(R.string.fun1_description),
                        R.drawable.navigli, R.drawable.ic_navigli));

                locations.add(new Location(context.getString(R.string.fun2_name),
                        context.getString(R.string.fun2_open),
                        context.getString(R.string.fun2_address),
                        context.getString(R.string.fun2_telephone),
                        context.getString(R.string.fun2_email),
                        context.getString(R.string.fun2_web),
                        context.getString(R.string.fun2_description),
                        R.drawable.highlinegalleria, R.drawable.ic_highlinegalleria));

                locations.add(new Location(context.getString(R.string.fun3_name),
                        context.getString(R.string.fun3_open),
                        context.getString(R.string.fun3_address),
                        context.getString(R.string.fun3_telephone),
                        context.getString(R.string.fun3_email),
                        context.getString(R.string.fun3_web),
                        context.getString(R.string.fun3_description),
                        R.drawable.corsocomo, R.drawable.ic_corsocomo));
                break;
            case R.string.menu4:
                locations.add(new Location(context.getString(R.string.sleep1_name),
                        context.getString(R.string.sleep1_open),
                        context.getString(R.string.sleep1_address),
                        context.getString(R.string.sleep1_telephone),
                        context.getString(R.string.sleep1_email),
                        context.getString(R.string.sleep1_web),
                        context.getString(R.string.sleep1_description),
                        R.drawable.ostellobello, R.drawable.ic_ostellobello));

                locations.add(new Location(context.getString(R.string.sleep2_name),
                        context.getString(R.string.sleep2_open),
                        context.getString(R.string.sleep2_address),
                        context.getString(R.string.sleep2_telephone),
                        context.getString(R.string.sleep2_email),
                        context.getString(R.string.sleep2_web),
                        context.getString(R.string.sleep2_description),
                        R.drawable.secondopensiero, R.drawable.ic_secondopensiero));

                locations.add(new Location(context.getString(R.string.sleep3_name),
                        context.getString(R.string.sleep3_open),
                        context.getString(R.string.sleep3_address),
                        context.getString(R.string.sleep3_telephone),
                        context.getString(R.string.sleep3_email),
                        context.getString(R.string.sleep3_web),
                        context.getString(R.string.sleep3_description),
                        R.drawable.westinpalace, R.drawable.ic_westinpalace));
                break;
        }
    }

}
