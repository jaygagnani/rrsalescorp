package com.rrsalescorp.rrsalescorporation.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.rrsalescorp.rrsalescorporation.model.VehicleCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JG on 20-Jan-18.
 */

@Dao
public interface VehicleCategoryDao {
    @Query("SELECT * FROM vehicle_categories")
//    ArrayList<VehicleCategory> getAll();
    List<VehicleCategory> getAll();

    @Query("SELECT * FROM vehicle_categories WHERE id = :id LIMIT 1")
    VehicleCategory findById(int id);

    @Query("SELECT * FROM vehicle_categories WHERE category_name LIKE :name")
    VehicleCategory findByName(String name);

    @Query("SELECT * FROM vehicle_categories WHERE category_code LIKE :code LIMIT 1")
    VehicleCategory findByCode(String code);

    @Query("SELECT * FROM vehicle_categories WHERE no_of_wheels = :noOfWheels")
    VehicleCategory findByNoOfWheels(int noOfWheels);

    @Query("SELECT COUNT(*) FROM vehicle_categories")
    int countCategories();

    @Insert
    void insertOne(VehicleCategory categorie);

    @Insert
    void insertAll(VehicleCategory... categories);

    @Delete
    void delete(VehicleCategory category);
}
