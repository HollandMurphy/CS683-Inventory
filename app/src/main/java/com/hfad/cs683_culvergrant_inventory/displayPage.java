package com.hfad.cs683_culvergrant_inventory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

public class displayPage extends AppCompatActivity {
    private static String TAG = "Message: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_page);
        // Setting the toolbar

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter<New_Inventory> listAdapter = new ArrayAdapter<> (
                this,
                android.R.layout.simple_list_item_1,
                New_Inventory.newInventory);
        ListView listInventory = (ListView) findViewById(R.id.list_inventory);
        listInventory.setAdapter(listAdapter);


        // Create OnItemClickListener

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                Log.i(TAG, "Wondering: " + position);
                if (position == 0) {
                    Log.i(TAG, "Position Clicked: " + position);
                    Intent intent = new Intent(displayPage.this, DetailActivity.class);
                    startActivity(intent);
                }
            }
        };
        // Add listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_inventory);
        listView.setOnItemClickListener(itemClickListener);

   }
}