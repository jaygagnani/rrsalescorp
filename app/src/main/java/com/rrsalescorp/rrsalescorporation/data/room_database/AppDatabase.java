package com.rrsalescorp.rrsalescorporation.data.room_database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.rrsalescorp.rrsalescorporation.data.dao.CustomerDao;
import com.rrsalescorp.rrsalescorporation.data.dao.ProductDao;
import com.rrsalescorp.rrsalescorporation.data.dao.VehicleCategoryDao;
import com.rrsalescorp.rrsalescorporation.model.Customer;
import com.rrsalescorp.rrsalescorporation.model.Product;
import com.rrsalescorp.rrsalescorporation.model.VehicleCategory;

/**
 * Created by JG on 20-Jan-18.
 */

@Database(entities = {Customer.class, Product.class, VehicleCategory.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CustomerDao customerDao();
    public abstract ProductDao productDao();
    public abstract VehicleCategoryDao vehicleCategoryDao();
}
