package finalproject;

//Order.java
import java.util.List;

public class Order {
 private User user;
 private List<Product> products;
 private double totalAmount;

 public Order(User user, List<Product> products, double totalAmount) {
     this.user = user;
     this.products = products;
     this.totalAmount = totalAmount;
 }

 public User getUser() {
     return user;
 }

 public List<Product> getProducts() {
     return products;
 }

 public double getTotalAmount() {
     return totalAmount;
 }
}
