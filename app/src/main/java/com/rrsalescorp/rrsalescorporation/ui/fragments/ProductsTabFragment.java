package com.rrsalescorp.rrsalescorporation.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rrsalescorp.rrsalescorporation.R;
import com.rrsalescorp.rrsalescorporation.adapters.ProductsAdapter;
import com.rrsalescorp.rrsalescorporation.model.Product;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by JG on 23-Dec-17.
 */

public class ProductsTabFragment extends Fragment {

    private ArrayList<Product> products;
    private RecyclerView mRecyclerView;
    private ProductsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.products_tab_layout, container, false);

        products = new ArrayList<>();
        mAdapter = new ProductsAdapter(products, getActivity());

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.main_recyclerview);
        Log.d(TAG, "onCreateView: " + mRecyclerView.getWidth());
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(), DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setAdapter(mAdapter);

        setDummyProduct();

        return rootView;
    }

    private void setDummyProduct() {
        String[] names = {"abc", "bcd", "cde", "def"};
        String[] noOfWheels = {"2", "3", "3", "2"};
        String[] categories = {"cba", "dcb", "edc", "fed"};

        for(int i = 0; i < names.length; i++) {
            Product newProduct = new Product(names[i], noOfWheels[i], categories[i], 0.0);
            products.add(newProduct);
        }

        mAdapter.notifyDataSetChanged();
    }

}
