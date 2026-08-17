package com.securevault.app;

import com.securevault.core.InvalidItemValueException;
import com.securevault.core.VaultItem;

public class NewMain {

    public static void main(String[] args) {

        try {
            VaultItem validItem = new VaultItem("Diamond", 5000);
            System.out.println(validItem);

            VaultItem invalidItem = new VaultItem("Broken Item", 0);
            System.out.println(invalidItem);

        } catch (InvalidItemValueException e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
