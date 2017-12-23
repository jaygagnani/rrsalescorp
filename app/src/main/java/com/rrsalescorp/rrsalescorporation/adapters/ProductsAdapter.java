package com.rrsalescorp.rrsalescorporation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rrsalescorp.rrsalescorporation.R;
import com.rrsalescorp.rrsalescorporation.model.Product;

import java.util.ArrayList;

/**
 * Created by JG on 23-Dec-17.
 */

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    private ArrayList<Product> mProducts = new ArrayList<>();
    private Context mContext;

    public ProductsAdapter(ArrayList<Product> mProducts, Context mContext) {
        this.mProducts = mProducts;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.products_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Product product = mProducts.get(position);
        holder.productName.setText(product.getName());
        holder.productCategory.setText(product.getVehicleCat() + " - " + product.getNoOfWheelsCat() + " Wheeler");
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
