package com.rrsalescorp.rrsalescorporation.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rrsalescorp.rrsalescorporation.R;
import com.rrsalescorp.rrsalescorporation.model.Product;
import com.rrsalescorp.rrsalescorporation.ui.ProductDetailActivity;
import com.rrsalescorp.rrsalescorporation.ui.fragments.ProductDetailFragment;
import com.rrsalescorp.rrsalescorporation.ui.ProductListActivity;

import java.util.ArrayList;

/**
 * Created by JG on 23-Dec-17.
 */

public class ProductsRecyclerViewAdapter extends RecyclerView.Adapter<ProductsRecyclerViewAdapter.ViewHolder> {

    private final ProductListActivity mParentActivity;
    private ArrayList<Product> mProducts = new ArrayList<>();
    private final boolean mTwoPane;

    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            int id = (int) view.getTag();
            Product product = (Product) view.getTag();
            int id = product.getId();

            if(mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putInt(ProductDetailFragment.ARG_ITEM_ID, id);
                ProductDetailFragment productDetailFragment = new ProductDetailFragment();
                productDetailFragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.product_detail_container, productDetailFragment)
                        .commit();
            }
            else {
                Context context = view.getContext();
                Intent intent = new Intent(context, ProductDetailActivity.class);
                intent.putExtra(ProductDetailFragment.ARG_ITEM_ID, 1);

                context.startActivity(intent);
            }
        }
    };

    public ProductsRecyclerViewAdapter(ProductListActivity parent, ArrayList<Product> mProducts, boolean mTwoPane) {
        this.mParentActivity = parent;
        this.mProducts = mProducts;
        this.mTwoPane = mTwoPane;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_list_content, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Product product = mProducts.get(position);
        holder.productName.setText(product.getName());
        holder.productCategory.setText(product.getVehicleCat() + " - " + product.getNoOfWheels() + " Wheeler");
        holder.productRate.setText("Rs. " + product.getSellPrice());

        holder.itemView.setTag(product);
        holder.itemView.setOnClickListener(mOnClickListener);
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView productName;
        TextView productCategory;
        TextView productRate;
        ImageView productImage;

        public ViewHolder(View itemView) {
            super(itemView);

            productName = (TextView) itemView.findViewById(R.id.product_title);
            productCategory = (TextView) itemView.findViewById(R.id.product_category);
            productRate = (TextView) itemView.findViewById(R.id.product_rate);
        }
    }
}
