package com.grouploss.grouploss;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by coolm_000 on 8/14/2014.
 */
public class WorkoutbuddyScreen extends Main_Activity {

    private String[] navMenuTitles;
    private TypedArray navMenuIcons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workoutbuddy);



        navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items); // load titles from strings.xml

        navMenuIcons = getResources()
                .obtainTypedArray(R.array.nav_drawer_icons);//load icons from strings.xml

        set(navMenuTitles, navMenuIcons);

    }
    public void searching (){
        Toast.makeText(WorkoutbuddyScreen.this, "Searching Now!", Toast.LENGTH_LONG).show();

    }
}
