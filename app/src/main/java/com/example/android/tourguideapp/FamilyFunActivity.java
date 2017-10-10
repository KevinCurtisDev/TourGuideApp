package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by kevincurtis on 07/06/2017.
 */

public class FamilyFunActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    // Create a list of words
    final ArrayList<Descriptions> describe = new ArrayList<Descriptions>();
        describe.add(new Descriptions(getResources().getString(R.string.aquatic_desc), getResources().getString(R.string.aquatic_loc_desc), R.drawable.aquatic));
        describe.add(new Descriptions(getResources().getString(R.string.cinema_desc), getResources().getString(R.string.cinema_loc_desc), R.drawable.cinema));
        describe.add(new Descriptions(getResources().getString(R.string.zoo_desc), getResources().getString(R.string.zoo_loc_desc), R.drawable.zoo));
        describe.add(new Descriptions(getResources().getString(R.string.jump_desc), getResources().getString(R.string.jump_loc_desc), R.drawable.jump));

    // Create an {@link DescriptionAdapter}, whose data source is a list of {@link Word}s. The
    // adapter knows how to create list items for each item in the list.
    DescriptionAdapter adapter = new DescriptionAdapter(this, describe, R.color.descBackground);

    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
    // There should be a {@link ListView} with the view ID called list, which is declared in the
    // word_list.xml layout file.
    ListView listView = (ListView) findViewById(R.id.list);

    // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
    // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

}
}
