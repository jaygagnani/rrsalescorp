package com.rrsalescorp.rrsalescorporation.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rrsalescorp.rrsalescorporation.R;

/**
 * Created by JG on 23-Dec-17.
 */

public class OrdersTabFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.orders_tab_layout, container, false);
    }
}
