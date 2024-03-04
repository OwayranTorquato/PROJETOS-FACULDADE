public class Items {

private String product;
private Integer quantity;
private double value;
private double weight;

//Constructor
public Items (String product, Integer quantity, double value, double weight){
    this.product = product;
    this.quantity = quantity;
    this.value = value;
    this.weight = weight;
}
//Setters
public void setProduct (String product){
    this.product = product;
}
public void setQuantity (Integer quantity){
    this.quantity = quantity;
}
public void setValue (double value){
    this.value = value;
}
public void setWeight(double weight){
    this.weight = weight;
}

//Getters
public String getProduct(){
    return product;
}
public Integer getQuantity(){
    return quantity;
}
public double getValue(){
    return value;
}
public double getWeight(){
    return weight;
}

//Methods
public double calculateTotalValue() {
    return quantity * value;
}
public double calculateTotalWeight() {
    return quantity * weight;
}
}
