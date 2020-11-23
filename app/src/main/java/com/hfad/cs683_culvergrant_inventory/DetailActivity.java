package com.hfad.cs683_culvergrant_inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import static com.hfad.cs683_culvergrant_inventory.New_Inventory.newInventory;

public class DetailActivity extends AppCompatActivity {
    private static String TAG = "Message: ";
    private Button mButton;
    public static final String POSITION_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int position_id = (int) getIntent().getExtras().get(POSITION_ID);
        Log.i(TAG, "Detail Activity: " + position_id);
        New_Inventory unit = newInventory[position_id];

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


        // Create onClickListener
        mButton = findViewById(R.id.sub_inv);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
                    int id = radioGroup.getCheckedRadioButtonId();
                    Log.i(TAG, "Option Selected: " + id);

                    switch(id) {
                        case R.id.inv_sold:
                            // Unit is sold
                            Log.i(TAG, "Inventory Status: Sold" + position_id);
                            unit.setStatus("Sold");
                            break;
                        case R.id.inv_lot:
                            // Unit is on lot
                            unit.setStatus("Lot");
                            Log.i(TAG, "Inventory Status: Lot");
                            break;
                        case R.id.inv_unaccounted:
                            // Who knows where it is
                            unit.setStatus("Not Found");
                            Log.i(TAG, "Inventory Status: ?" + unit.getStatus());
                            break;
                        case R.id.inv_test_drive:
                            // Customer is in-vehicle
                            unit.setStatus("Test Drive");
                            Log.i(TAG, "Inventory Status: Test Drive");
                            break;
                        default:
                            unit.setStatus("");
                            break;

                    }


                    Intent intent = new Intent(DetailActivity.this, displayPage.class);
                    startActivity(intent);
            }
        });

    }
}