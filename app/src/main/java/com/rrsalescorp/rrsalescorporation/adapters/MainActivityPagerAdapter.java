package com.rrsalescorp.rrsalescorporation.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rrsalescorp.rrsalescorporation.ui.fragments.CustomersTabFragment;
import com.rrsalescorp.rrsalescorporation.ui.fragments.OrdersTabFragment;
import com.rrsalescorp.rrsalescorporation.ui.fragments.CategoriesTabFragment;

/**
 * Created by JG on 23-Dec-17.
 */

public class MainActivityPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public MainActivityPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                CategoriesTabFragment categoriesTabFragment = new CategoriesTabFragment();
                return categoriesTabFragment;

            case 1:
                CustomersTabFragment customersTabFragment = new CustomersTabFragment();
                return customersTabFragment;

            case 2:
                OrdersTabFragment ordersTabFragment = new OrdersTabFragment();
                return ordersTabFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
