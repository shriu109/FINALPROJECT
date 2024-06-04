package finalproject;

//OrderProcessor.java
import java.util.List;

public class OrderProcessor {
 private PaymentGateway paymentGateway;
 private Logger logger;

 public OrderProcessor(PaymentGateway paymentGateway, Logger logger) {
     this.paymentGateway = paymentGateway;
     this.logger = logger;
 }

 public Order createOrder(User user) {
     ShoppingCart cart = user.getCart();
     List<Product> products = cart.getProducts();
     double totalAmount = calculateTotalAmount(products);

     Order order = new Order(user, products, totalAmount);

     boolean paymentSuccessful = paymentGateway.processPayment(totalAmount);
     if (paymentSuccessful) {
         logger.log("Order processed for user: " + user.getUsername());
         cart.clear();
         return order;
     } else {
         logger.log("Payment failed for user: " + user.getUsername());
         return null;
     }
 }

 private double calculateTotalAmount(List<Product> products) {
     double total = 0.0;
     for (Product product : products) {
         total += product.getPrice();
     }
     return total;
 }
}