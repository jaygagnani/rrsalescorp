package com.rrsalescorp.rrsalescorporation.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by JG on 20-Jan-18.
 */

@Entity(tableName = "orders")
public class Order {
    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "customer_id")
    @ForeignKey(entity = Customer.class, parentColumns = "id", childColumns = "customer_id")
    int customerId;
    Date date;

    @ColumnInfo(name = "default_discount_flag")
    boolean defaultDiscountFlag; /*TRUE if use default Customer discount. FALSE to change discount % for this order*/

    @ColumnInfo(name = "discount_percent")
    double discountPercent;

    @ColumnInfo(name = "total_amount")
    double totalAmount;
}
