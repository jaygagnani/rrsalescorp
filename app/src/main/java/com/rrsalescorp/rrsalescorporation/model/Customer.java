package com.rrsalescorp.rrsalescorporation.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by JG on 23-Dec-17.
 */

@Entity(tableName = "customers")
public class Customer {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    int id;

    @ColumnInfo(name = "customer_name")
    String customerName;

    @ColumnInfo(name = "company_name")
    String companyName;

    @ColumnInfo(name = "job_title")
    String jobTitle;

    @ColumnInfo(name = "mobile_no")
    String mobileNo;

    @ColumnInfo(name = "office_no")
    String officeNo;

    @ColumnInfo(name = "alt_phone_no")
    String altPhoneNo;

    @ColumnInfo(name = "email")
    String email;

    @Embedded
    String address;

//    @Embedded
//    @ColumnInfo(name = "office_address")
//    String officeAddress;
//
//    @Embedded
//    @ColumnInfo(name = "billing_address")
//    String billingAddress;
//
//    @Embedded
//    @ColumnInfo(name = "shipping_address")
//    String shippingAddress;

    @ColumnInfo(name = "discount_percent")
    double discountPercent;

    @Ignore
    public Customer(String customerName, String companyName, String jobTitle, String mobileNo, String officeNo, String altPhoneNo, String email, String officeAddress, String billingAddress, String shippingAddress, double discountPercent) {
        this.customerName = customerName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.mobileNo = mobileNo;
        this.officeNo = officeNo;
        this.altPhoneNo = altPhoneNo;
        this.email = email;
//        this.officeAddress = officeAddress;
//        this.billingAddress = billingAddress;
//        this.shippingAddress = shippingAddress;
        this.discountPercent = discountPercent;
    }

    public Customer(String customerName, String companyName, String jobTitle, String mobileNo, String officeNo, String altPhoneNo, String email, String address, double discountPercent) {
        this.customerName = customerName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.mobileNo = mobileNo;
        this.officeNo = officeNo;
        this.altPhoneNo = altPhoneNo;
        this.email = email;
        this.address = address;
        this.discountPercent = discountPercent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }

    public String getAltPhoneNo() {
        return altPhoneNo;
    }

    public void setAltPhoneNo(String altPhoneNo) {
        this.altPhoneNo = altPhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public String getOfficeAddress() {
//        return officeAddress;
//    }
//
//    public void setOfficeAddress(String officeAddress) {
//        this.officeAddress = officeAddress;
//    }
//
//    public String getBillingAddress() {
//        return billingAddress;
//    }
//
//    public void setBillingAddress(String billingAddress) {
//        this.billingAddress = billingAddress;
//    }
//
//    public String getShippingAddress() {
//        return shippingAddress;
//    }

//    public void setShippingAddress(String shippingAddress) {
//        this.shippingAddress = shippingAddress;
//    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
