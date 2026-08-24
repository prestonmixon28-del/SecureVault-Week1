package com.securevault.app;
import com.securevault.core.VaultManager;
import com.securevault.specialty.FragileItem;
import com.securevault.core.InvalidItemValueException;
import com.securevault.core.VaultItem;

public class NewMain {

    public static void main(String[] args) {

        try {
            VaultItem[] items = {
                    new VaultItem("gold", 5000),
                    new FragileItem("glass pane", 1200, true),
                    new VaultItem("diamond", 10000),
                    new FragileItem("painting", 3000, true),
                    new VaultItem("silver", 800)
            };

            VaultManager.selectionSort(items);

            System.out.println("sorted vault items");

            for (VaultItem item : items) {
                System.out.println(item);
            }


        } catch (InvalidItemValueException e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
