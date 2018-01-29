package com.rrsalescorp.rrsalescorporation.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.rrsalescorp.rrsalescorporation.R;

public class AddProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

//        ImageView toolbarImage = (ImageView) findViewById(R.id.product_top_image);
//        toolbarImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent imagePicker = new Intent();
//                imagePicker.setType("image/*");
//                imagePicker.setAction(Intent.ACTION_GET_CONTENT);
//                startActivityForResult(Intent.createChooser(imagePicker, "Select Product Image"), 1);
//            }
//        });

        Spinner vehicleCategory = (Spinner) findViewById(R.id.product_category_add);

        // Initializing a String Array
        String[] categories = new String[]{
                "Select Category...",
                "Honda",
                "Splendor",
                "Passion",
                "Activa"
        };

        ArrayAdapter<String> categoryArrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, categories) {
            @Override
            public boolean isEnabled(int position) {
//                return super.isEnabled(position);
                if (position == 0) {
                    return false;
                }
                else {
                    return true;
                }
            }
        };

        categoryArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        vehicleCategory.setAdapter(categoryArrayAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home) {
            this.finish();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
