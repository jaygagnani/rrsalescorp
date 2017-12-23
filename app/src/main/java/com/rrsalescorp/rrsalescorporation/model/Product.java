package com.rrsalescorp.rrsalescorporation.model;

/**
 * Created by JG on 23-Dec-17.
 */

public class Product {
    int id, stockQty, minOrderQty;
    String name, code, unitOfMeasurement, shelfLocation, color, size, noOfWheelsCat, vehicleCat;
    double costPrice, sellPrice, netWeight, netVolume;

    public Product(String name, String noOfWheelsCat, String vehicleCat, double sellPrice) {
        this.name = name;
        this.noOfWheelsCat = noOfWheelsCat;
        this.vehicleCat = vehicleCat;
        this.sellPrice = sellPrice;
    }

    public Product(int stockQty, int minOrderQty, String name, String code, String unitOfMeasurement, String shelfLocation, String color, String size, String noOfWheelsCat, String vehicleCat, double costPrice, double sellPrice, double netWeight, double netVolume) {
        this.stockQty = stockQty;
        this.minOrderQty = minOrderQty;
        this.name = name;
        this.code = code;
        this.unitOfMeasurement = unitOfMeasurement;
        this.shelfLocation = shelfLocation;
        this.color = color;
        this.size = size;
        this.noOfWheelsCat = noOfWheelsCat;
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

    public String getNoOfWheelsCat() {
        return noOfWheelsCat;
    }

    public void setNoOfWheelsCat(String noOfWheelsCat) {
        this.noOfWheelsCat = noOfWheelsCat;
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
