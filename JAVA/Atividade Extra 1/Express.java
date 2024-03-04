import java.time.LocalDate;

public class Express extends Delivery {

private double freight;

//Constructor
  public Express(LocalDate deliveryDate, Integer deliveryCode, double freight) {
        super(deliveryDate, deliveryCode);
        this.freight = freight;
    }
//Setter
public void setFreight(double freight){
    this.freight = freight;
}
//Getter
public double freight(){
    return freight;
}

//Methods
@Override
public double calculateTotalValue() {
    return super.calculateTotalValue() + freight;
}

@Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Freight: " + freight);
}
public double calculateFreight() {
    double totalWeight = 0;
    for (Items item : getItems()) {
        totalWeight += item.calculateTotalWeight();
    }
    return totalWeight;
}
public double calcTotalValueExpress() {
    return calculateSubtotal() + calculateFreight();
}
}
