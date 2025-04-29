import inventory.Inventory;
import products.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> books = new Inventory<>();
        Inventory<Notebook> notebooks = new Inventory<>();
        Inventory<Accessory> accessories = new Inventory<>();

        books.addItems(new Book("Little prince", 30.50, "Antoine de Saint-Exupéry", "Children", "1943"));
        books.addItems(new Book("Crime and Punishment", 22.25, "Fyodor Dostoevsky", "Novel", "1866"));

        notebooks.addItems(new Notebook("Notebook1", 5.00, 50, false));
        notebooks.addItems(new Notebook("Notebook2", 10.75, 100, true));

        accessories.addItems(new Accessory("accessory1", 66.99, "Purple"));
        accessories.addItems(new Accessory("accessory2", 79.10, "Green"));

        System.out.println("Products:");
        books.displayAll();
        notebooks.displayAll();
        accessories.displayAll();

        books.removeItemsById(1001);
        accessories.removeItemsById(3002);

        System.out.println("Books total price: " + calculateTotalPrice(books));
        System.out.println("Notebooks total price: " + calculateTotalPrice(notebooks));
        System.out.println("Accessories total price: " + calculateTotalPrice(accessories));
        System.out.println();

        Notebook notebook = notebooks.findItemsById(2001);
        Accessory accessory = accessories.findItemsById(3002);
        System.out.println();

        books.applyDiscount("Crime and Punishment", 10);
        notebooks.applyDiscount("Notebook1", 50);

        System.out.println("Products:");
        books.displayAll();
        notebooks.displayAll();
        accessories.displayAll();
    }

    public static double calculateTotalPrice (Inventory<? extends Product> inventory){
        ArrayList<? extends Product> items = inventory.getItems();
        double totalPrice = 0.0;
        for (Product product : items){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}