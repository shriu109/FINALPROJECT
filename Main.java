package finalproject;


// Main.java
public class Main {
    public static void main(String[] args) {
        User user = new User("john_doe", "password123");
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(new Electronics("E1", "Smartphone", 699.99));
        catalog.addProduct(new Clothing("C1", "T-Shirt", 19.99));

        user.getCart().addProduct(catalog.getProductById("E1"));
        user.getCart().addProduct(catalog.getProductById("C1"));

        PaymentGateway paymentGateway = new MockPaymentGateway();
        Logger logger = new Logger();
        OrderProcessor orderProcessor = new OrderProcessor(paymentGateway, logger);

        Order order = orderProcessor.createOrder(user);
        if (order != null) {
            System.out.println("Order placed successfully for user: " + user.getUsername());
            System.out.println("Total Amount: " + order.getTotalAmount());
        } else {
            System.out.println("Order failed for user: " + user.getUsername());
        }
    }
}
