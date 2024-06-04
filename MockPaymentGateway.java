package finalproject;

//MockPaymentGateway.java
public class MockPaymentGateway implements PaymentGateway {
 @Override
 public boolean processPayment(double amount) {
     return true;
 }
}
