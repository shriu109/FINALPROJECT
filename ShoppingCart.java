package finalproject;

//ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
 private static ShoppingCart instance;
 private List<Product> products;

 private ShoppingCart() {
     this.products = new ArrayList<>();
 }

 public static ShoppingCart getInstance() {
     if (instance == null) {
         instance = new ShoppingCart();
     }
     return instance;
 }

 public void addProduct(Product product) {
     products.add(product);
 }

 public void removeProduct(Product product) {
     products.remove(product);
 }

 public List<Product> getProducts() {
     return new ArrayList<>(products);
 }

 public void clear() {
     products.clear();
 }
}
