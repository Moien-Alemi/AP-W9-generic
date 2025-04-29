package inventory;

import products.Product;
import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void addItems (T product){
        if(product == null)
            throw new RuntimeException("This Product is null");
        items.add(product);
    }

    public void applyDiscount (String productName, int discount){
        for(T product : items){
            if(product.getTitle().equals(productName)){
                double originalPrice = product.getPrice();
                product.setPrice(originalPrice - ((double)(originalPrice * discount / 100)));
            }
        }
    }

    public T findItemsById(int id){
        String ID = String.valueOf(id);
        for(T product : items){
            if(product.getId().equals(ID)){
                return product;
            }
        }
        System.out.println("Item with this ID doesn't exist in this inventory");
        return null;
    }

    public void removeItemsById(int id){
        T product = findItemsById(id);
        if (product == null) {
            System.out.println("Item with this ID doesn't exist in this inventory");
            return;
        }
        items.remove(product);
    }

    public void displayAll(){
        for (T product : items){
            System.out.println(product.toString());
            System.out.println();
        }
        System.out.println();
    }
}
