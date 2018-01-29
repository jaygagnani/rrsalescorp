package com.rrsalescorp.rrsalescorporation.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.rrsalescorp.rrsalescorporation.model.Customer;

import java.util.List;

/**
 * Created by JG on 19-Jan-18.
 */

@Dao
public interface CustomerDao {
    @Query("SELECT * FROM customers")
    List<Customer> getAll();

    @Query("SELECT * FROM customers WHERE id = :id LIMIT 1")
    Customer findById(int id);

    @Query("SELECT * FROM customers WHERE customer_name LIKE :name")
    Customer findByName(String name);

    @Query("SELECT * FROM customers WHERE company_name LIKE :companyName")
    Customer findByCompanyName(String companyName);

    @Insert
    void insertNew(Customer... customers);

    @Delete
    void delete(Customer customer);
}