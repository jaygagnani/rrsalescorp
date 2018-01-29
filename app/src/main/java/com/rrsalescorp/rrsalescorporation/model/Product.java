package com.rrsalescorp.rrsalescorporation.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by JG on 23-Dec-17.
 */

@Entity(tableName = "products")
public class Product {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    int id;

    @ColumnInfo(name = "stock_qty")
    int stockQty;

    @ColumnInfo(name = "min_order_qty")
    int minOrderQty;

    @ColumnInfo(name = "product_name")
    String name;
    
    @ColumnInfo(name = "product_code")
    String code;

    @ColumnInfo(name = "unit_of_measurement")
    String unitOfMeasurement;

    @ColumnInfo(name = "shelf_location")
    String shelfLocation;

    @ColumnInfo(name = "color")
    String color;

    @ColumnInfo(name = "size")
    String size;

    @ColumnInfo(name = "no_of_wheels")
    String noOfWheels;

    @ColumnInfo(name = "vehicle_category")
    @ForeignKey(entity = VehicleCategory.class, parentColumns = "id", childColumns = "vehicle_category")
    String vehicleCat;

    @ColumnInfo(name = "cost_price")
    double costPrice;

    @ColumnInfo(name = "sell_price")
    double sellPrice;

    @ColumnInfo(name = "net_weight")
    double netWeight;

    @ColumnInfo(name = "net_volume")
    double netVolume;

    public Product(String name, String noOfWheels, String vehicleCat, double sellPrice) {
        this.name = name;
        this.noOfWheels = noOfWheels;
        this.vehicleCat = vehicleCat;
        this.sellPrice = sellPrice;
    }

    @Ignore
    public Product(int stockQty, int minOrderQty, String name, String code, String unitOfMeasurement, String shelfLocation, String color, String size, String noOfWheels, String vehicleCat, double costPrice, double sellPrice, double netWeight, double netVolume) {
        this.stockQty = stockQty;
        this.minOrderQty = minOrderQty;
        this.name = name;
        this.code = code;
        this.unitOfMeasurement = unitOfMeasurement;
        this.shelfLocation = shelfLocation;
        this.color = color;
        this.size = size;
        this.noOfWheels = noOfWheels;
        this.vehicleCat = vehicleCat;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.netWeight = netWeight;
        this.netVolume = netVolume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public int getMinOrderQty() {
        return minOrderQty;
    }

    public void setMinOrderQty(int minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(String noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getVehicleCat() {
        return vehicleCat;
    }

    public void setVehicleCat(String vehicleCat) {
        this.vehicleCat = vehicleCat;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getNetVolume() {
        return netVolume;
    }

    public void setNetVolume(double netVolume) {
        this.netVolume = netVolume;
    }
}
