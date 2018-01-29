package com.rrsalescorp.rrsalescorporation.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

/**
 * Created by JG on 20-Jan-18.
 */

public class Address {
    @ColumnInfo(name = "address_line1")
    public String addressLine1;

    @ColumnInfo(name = "address_line2")
    public String addressLine2;

    public String street;
    public String city;

    @ColumnInfo(name = "post_code")
    public int postCode;
}
