package com.rrsalescorp.rrsalescorporation.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rrsalescorp.rrsalescorporation.R;
import com.rrsalescorp.rrsalescorporation.adapters.CategoryListAdapter;
import com.rrsalescorp.rrsalescorporation.model.VehicleCategory;
import com.rrsalescorp.rrsalescorporation.ui.MainActivity;

import java.util.ArrayList;

/**
 * Created by JG on 23-Dec-17.
 */

public class CategoriesTabFragment extends Fragment {

    private ArrayList<VehicleCategory> categories;
    private RecyclerView mRecyclerView;
    private CategoryListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.categories_tab_layout, container, false);

        categories = new ArrayList<>();
        mAdapter = new CategoryListAdapter(categories, getActivity().getApplicationContext());

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.main_recyclerview);
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(), DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setAdapter(mAdapter);

        setDummyProduct();

        return rootView;
    }

    private void setDummyProduct() {
//        String[] names = {"Honda", "Shine", "Passion", "Splendor", "Bajaj", "Hero", "Ape", "Hero Honda", "Passion Pro", "Activa", "Tata", "All"};

//        for(int i = 0; i < names.length; i++) {
//            VehicleCategory newCategory = new VehicleCategory(names[i], 2);
//            categories.add(newCategory);
//        }

//        categories = (ArrayList<VehicleCategory>) MainActivity.db.vehicleCategoryDao().getAll();

        mAdapter.notifyDataSetChanged();
    }

}
