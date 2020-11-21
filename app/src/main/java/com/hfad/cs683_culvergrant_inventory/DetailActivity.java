package com.hfad.cs683_culvergrant_inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private static String TAG = "Message: ";
    public static final String POSITION_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int position_id = (int) getIntent().getExtras().get(POSITION_ID);
        Log.i(TAG, "Detail Activity: ");
        New_Inventory unit = New_Inventory.newInventory[position_id];

        // Populate vehicle make
        TextView name = (TextView)findViewById(R.id.make);
        name.setText(unit.getMake());

        //Populate vehicle model
        TextView model = (TextView)findViewById(R.id.model);
        model.setText(unit.getModel());

        // Populate vehicle vin
        TextView vin = (TextView)findViewById(R.id.vin);
        vin.setText(unit.getVinNumber());
        Log.i(TAG, "Wondering: " + vin);

    }
}