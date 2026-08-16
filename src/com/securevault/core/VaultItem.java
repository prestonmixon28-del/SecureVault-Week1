package com.securevault.core;

public class VaultItem {

    private String itemName;
    private double itemValue;

    public VaultItem(String itemName, double itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemValue() {
        return  itemValue;
    }
    @Override
    public String toString() {
        return String.format("Item, %, value: $%.2f", itemName,itemValue);
    }
}
