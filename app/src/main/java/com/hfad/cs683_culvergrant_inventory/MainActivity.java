package com.hfad.cs683_culvergrant_inventory;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    private static String TAG = "Message: ";
    private Button mButton;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Setting the toolbar
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create onClickListener
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Spinner spinner = (Spinner) findViewById(R.id.inventory_type);
                String text = spinner.getSelectedItem().toString();
                Log.i(TAG, "Spinner Text: " + text);

                if (text.equals("New")) {
                    Log.i(TAG, "Made it: " + text);
                    Intent intent = new Intent(MainActivity.this, displayPage.class);
                    Log.i(TAG, "Wondering: " + text);
                    startActivity(intent);
                }

            }
        });

    }
}