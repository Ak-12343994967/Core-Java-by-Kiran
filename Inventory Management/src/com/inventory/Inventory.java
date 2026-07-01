package com.inventory;
import java.util.ArrayList;
import java.util.Scanner;
import com.products.Product;

public class Inventory {

    ArrayList<Product> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Inventory() {

        list.add(new Product(101, "Laptop", 65000, 5, "Electronics"));
        list.add(new Product(102, "Smartphone", 28000, 10, "Electronics"));
        list.add(new Product(103, "Mouse", 800, 25, "Accessories"));
        list.add(new Product(104, "Keyboard", 1500, 20, "Accessories"));
        list.add(new Product(105, "Monitor", 12000, 8, "Electronics"));
        list.add(new Product(106, "Printer", 9500, 6, "Office"));
        list.add(new Product(107, "Headphones", 2500, 15, "Audio"));
        list.add(new Product(108, "Webcam", 3200, 12, "Accessories"));
        list.add(new Product(109, "External Hard Disk", 5500, 10, "Storage"));
        list.add(new Product(110, "USB Pen Drive", 700, 50, "Storage"));
    }

    // Add Product
    public void addProduct() {

        System.out.print("Enter Product ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Price : ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Category : ");
        String category = sc.nextLine();

        Product p = new Product(id, name, price, quantity, category);

        list.add(p);

        System.out.println("\nProduct Added Successfully.");
    }

    public void displayInventory() {

        if (list.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }

        System.out.println("\n **INVENTORY** ");

        for (Product p : list) {

            System.out.println("----------------------------");
            System.out.println(p);
        }
    }

    // Search Product by ID
    public void searchById() {

        System.out.print("Enter Product ID : ");
        int id = sc.nextInt();

        for (Product p : list) {

            if (p.getId() == id) {

                System.out.println("\nProduct Found");
                System.out.println("----------------------");
                System.out.println(p);
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    public void updateQuantity() {

        System.out.print("Enter Product ID : ");
        int id = sc.nextInt();

        for (Product p : list) {

            if (p.getId() == id) {

                System.out.print("Enter New Quantity : ");
                int qty = sc.nextInt();

                p.setQuantity(qty);

                System.out.println("Quantity Updated Successfully.");
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

  
    public void expensiveProduct() {

        if (list.isEmpty()) {

            System.out.println("Inventory Empty.");
            return;
        }

        Product expensive = list.get(0);

        for (Product p : list) {

            if (p.getPrice() > expensive.getPrice()) {

                expensive = p;
            }
        }

        System.out.println("\nMost Expensive Product");
        System.out.println("----------------------");
        System.out.println(expensive);
    }

 
    public void totalInventoryValue() {

        double total = 0;

        for (Product p : list) {

            total += p.getPrice() * p.getQuantity();
        }

        System.out.println("\nTotal Inventory Value = ₹" + total);
    }
}