package finalproject;


public class User {
 private String username;
 private String password;
 private ShoppingCart cart;

 public User(String username, String password) {
     this.username = username;
     this.password = password;
     this.cart = ShoppingCart.getInstance();
 }

 public String getUsername() {
     return username;
 }

 public void setUsername(String username) {
     this.username = username;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 public ShoppingCart getCart() {
     return cart;
 }

 public void setCart(ShoppingCart cart) {
     this.cart = cart;
 }
}
