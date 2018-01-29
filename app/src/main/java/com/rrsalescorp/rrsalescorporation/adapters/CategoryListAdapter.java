package com.rrsalescorp.rrsalescorporation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.rrsalescorp.rrsalescorporation.R;
import com.rrsalescorp.rrsalescorporation.model.VehicleCategory;

import java.util.ArrayList;

/**
 * Created by JG on 24-Dec-17.
 */

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder> {

    private static final String TAG = "CategoryListAdapter";
    private ArrayList<VehicleCategory> mCategories = new ArrayList<>();
    private Context mContext;

    public CategoryListAdapter(ArrayList<VehicleCategory> mCategories, Context mContext) {
        this.mCategories = mCategories;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.category_list_item, parent, false);
        ViewHolder viewHolder = new CategoryListAdapter.ViewHolder(view, mContext);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        VehicleCategory vehicleCategory = mCategories.get(position);
        holder.categoryName.setText(vehicleCategory.getName());
        holder.categoryName.setTag(vehicleCategory);
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView categoryName;
        Context context;

        public ViewHolder(View itemView, final Context context) {
            super(itemView);

            this.context = context;

            categoryName = (TextView) itemView.findViewById(R.id.product_vehicle_category);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, ((VehicleCategory)categoryName.getTag()).getName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
