package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;
        System.out.println("Items in Cart:");
        for (Product p : items) {
            System.out.println(p);
            total += p.getPrice();
        }
        System.out.println("Total Price: ₹" + total);
    }
}
