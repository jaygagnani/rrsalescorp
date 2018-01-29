package com.rrsalescorp.rrsalescorporation.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.rrsalescorp.rrsalescorporation.model.Product;

import java.util.List;

/**
 * Created by JG on 19-Jan-18.
 */

@Dao
public interface ProductDao {
    @Query("SELECT * FROM products")
    List<Product> getAll();

    @Query("SELECT * FROM products WHERE id = :id LIMIT 1")
    Product findById(int id);

    @Query("SELECT * FROM products WHERE product_name LIKE :name")
    Product findByName(String name);

    @Query("SELECT * FROM products WHERE product_code LIKE :code LIMIT 1")
    Product findByCode(String code);

    @Query("SELECT * FROM products WHERE vehicle_category LIKE :vehicleCat")
    Product findByVehicleCat(String vehicleCat);

    @Query("SELECT * FROM products WHERE no_of_wheels = :noOfWheels")
    Product findByNoOfWheels(int noOfWheels);

    @Insert
    void insertNew(Product... products);

    @Delete
    void delete(Product product);
}
