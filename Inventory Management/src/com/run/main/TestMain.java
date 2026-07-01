package com.run.main;
import java.util.Scanner;
import com.inventory.Inventory;

public class TestMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        int choice;

        do {
            System.out.println(" PRODUCT INVENTORY SYSTEM \n");
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Quantity");
            System.out.println("5. Find Most Expensive Product");
            System.out.println("6. Calculate Total Inventory Value");
            System.out.println("7. Exit");
            System.out.print("\nEnter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    inventory.addProduct();
                    break;

                case 2:
                    inventory.displayInventory();
                    break;

                case 3:
                    inventory.searchById();
                    break;

                case 4:
                    inventory.updateQuantity();
                    break;

                case 5:
                    inventory.expensiveProduct();
                    break;

                case 6:
                    inventory.totalInventoryValue();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}