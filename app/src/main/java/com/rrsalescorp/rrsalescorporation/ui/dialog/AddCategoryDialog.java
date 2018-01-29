package com.rrsalescorp.rrsalescorporation.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.rrsalescorp.rrsalescorporation.R;
import com.rrsalescorp.rrsalescorporation.model.VehicleCategory;
import com.rrsalescorp.rrsalescorporation.ui.MainActivity;

/**
 * Created by JG on 31-Dec-17.
 */

public class AddCategoryDialog extends DialogFragment {

    EditText categoryName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View dialogView = inflater.inflate(R.layout.dialog_add_category, container, false);
        categoryName = (EditText) dialogView.findViewById(R.id.add_category);

        return dialogView;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        return super.onCreateDialog(savedInstanceState);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        builder.setView(inflater.inflate(R.layout.dialog_add_category, null))
                .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String categoryName1 = categoryName.getText().toString();
                        Toast.makeText(getContext(), "Category Name: " + categoryName1, Toast.LENGTH_SHORT).show();
                        VehicleCategory category = new VehicleCategory(categoryName1);
                        MainActivity.db.vehicleCategoryDao().insertOne(category);
//                        new AsyncTask<VehicleCategory, Void, Void>() {
//                            @Override
//                            protected Void doInBackground(VehicleCategory... objects) {
//                                MainActivity.db.vehicleCategoryDao().insertOne(objects[0]);
//                                Toast.makeText(getContext(), "New Category Saved.", Toast.LENGTH_SHORT).show();
//
//                                return null;
//                            }
//                        }.execute(category);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        AddCategoryDialog.this.getDialog().cancel();
                    }
                });

        return builder.create();
    }
}
