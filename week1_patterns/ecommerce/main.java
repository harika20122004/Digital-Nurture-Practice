package ecommerce;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Wireless Mouse", 599.0);
        Product p2 = new Product(102, "Keyboard", 999.0);
        Product p3 = new Product(103, "USB-C Cable", 299.0);

        Cart cart = new Cart();

        cart.addProduct(p1);
        cart.addProduct(p3);

        cart.showCart();
    }
}
