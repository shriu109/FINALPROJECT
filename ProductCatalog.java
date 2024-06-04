package finalproject;

//ProductCatalog.java
import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
 private List<Product> products;

 public ProductCatalog() {
     this.products = new ArrayList<>();
 }

 public List<Product> getProducts() {
     return products;
 }

 public void setProducts(List<Product> products) {
     this.products = products;
 }

 public void addProduct(Product product) {
     this.products.add(product);
 }

 public void removeProduct(Product product) {
     this.products.remove(product);
 }

 public Product getProductById(String id) {
     for (Product product : products) {
         if (product.getId().equals(id)) {
             return product;
         }
     }
     return null;
 }

 public List<Product> getProductsByName(String name) {
     List<Product> result = new ArrayList<>();
     for (Product product : products) {
         if (product.getName().equalsIgnoreCase(name)) {
             result.add(product);
         }
     }
     return result;
 }
}