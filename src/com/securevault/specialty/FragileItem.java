package com.securevault.specialty;

import com.securevault.core.VaultItem;

public class FragileItem extends VaultItem {

    private boolean isWrapped;
    public FragileItem(String itemName, double itemValue, boolean isWrapped) {
        super(itemName, itemValue);
        this.isWrapped = isWrapped;
    }

    @Override
    public String toString(){
        return String.format("Item: %, Value: $%.2f, wrapped: %b", getItemName(), getItemValue(), isWrapped);
    }
}