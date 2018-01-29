package com.rrsalescorp.rrsalescorporation.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by JG on 24-Dec-17.
 */

@Entity(tableName = "vehicle_categories")
public class VehicleCategory {

    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "no_of_wheels")
    int noOfWheels;

    @ColumnInfo(name = "category_name")
    String name;

    @ColumnInfo(name = "category_code")
    String code;

    public VehicleCategory(String name) {
        this.name = name;
        this.noOfWheels = 0;
        this.code = null;
    }

    @Ignore
    public VehicleCategory(String name, int noOfWheels) {
        this.name = name;
        this.noOfWheels = noOfWheels;
        this.code = null;
    }

    @Ignore
    public VehicleCategory(int noOfWheels, String name, String code) {
        this.noOfWheels = noOfWheels;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
