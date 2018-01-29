package com.rrsalescorp.rrsalescorporation.ui;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

import com.rrsalescorp.rrsalescorporation.R;
import com.rrsalescorp.rrsalescorporation.adapters.MainActivityPagerAdapter;
import com.rrsalescorp.rrsalescorporation.data.room_database.AppDatabase;
import com.rrsalescorp.rrsalescorporation.ui.dialog.AddCategoryDialog;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
//    private SectionsPagerAdapter mSectionsPagerAdapter;
    private MainActivityPagerAdapter mMainActivityPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    private FloatingActionButton fabAddCategory, fabAddProduct, fabAddCustomer, fabAddOrder;

    public static AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mMainActivityPagerAdapter = new MainActivityPagerAdapter(getSupportFragmentManager(), 3);

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mMainActivityPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        fabAddProduct = (FloatingActionButton) findViewById(R.id.fab_addProduct);
        fabAddCategory = (FloatingActionButton) findViewById(R.id.fab_addCategory);
        fabAddCustomer = (FloatingActionButton) findViewById(R.id.fab_addCustomer);
        fabAddOrder = (FloatingActionButton) findViewById(R.id.fab_addOrder);

        db = Room.databaseBuilder(this, AppDatabase.class, "rrsales").allowMainThreadQueries().build();

        setFabMenuBtnClickListener();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setFabMenuBtnClickListener() {
        fabAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddProductActivity.class);
                startActivity(intent);
            }
        });

        fabAddCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = new AddCategoryDialog();
                dialogFragment.show(getSupportFragmentManager(), "add category");
            }
        });

        fabAddCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddCustomerActivityOld.class);
                startActivity(intent);
            }
        });

        fabAddOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Add Order coming up soon!", Toast.LENGTH_SHORT).show();
                String name = db.vehicleCategoryDao().getAll().get(0).getName();
                int count = db.vehicleCategoryDao().countCategories();
                Toast.makeText(getApplicationContext(), "Vehicle: " + name + "\n Count: " + count, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
