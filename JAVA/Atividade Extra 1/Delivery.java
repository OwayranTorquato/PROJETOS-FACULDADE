import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Delivery {

private Integer deliveryCode;
private LocalDate deliveryDate;
private List<Items> items;
private Customer customer;


// Constructor
public Delivery (LocalDate deliveryDate, Integer deliveryCode) {
    this.deliveryDate = deliveryDate;
    this.deliveryCode = deliveryCode;
    this.items = new ArrayList<>();
}

// Setters
public void setDeliveryCode(Integer deliveryCode){
    this.deliveryCode = deliveryCode;
}
public void setDeliveryDate(LocalDate deliveryDate){
    this.deliveryDate = deliveryDate;
}
public void setCustomer (Customer customer){
    this.customer = customer;
}

// Getters
public LocalDate getDeliveryDate(){
    return deliveryDate;
}
public Integer getDeliveryCode(){
    return deliveryCode;
}
public List<Items> getItems(){
    return items;
}
public Customer getCustomer() {
    return customer;
}

//Methods
public void addItem(Items item) {
    items.add(item);
}
public double calculateSubtotal() {
    double totalValue = 0;
    for (Items item : items) {
        totalValue += item.calculateTotalValue();
    }
    return totalValue;
}
public double calculateTotalValue() {
    return calculateSubtotal();
}
public void showInfo(){
    System.out.println("Delivery Code: " + deliveryCode);
    System.out.println("Delivery Date: " + deliveryDate);

    for (Items item : items) {
        System.out.println("Product: " + item.getProduct());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Value: " + item.getValue());
        System.out.println("Weight: " + item.getWeight());
        System.out.println();
}
}
}