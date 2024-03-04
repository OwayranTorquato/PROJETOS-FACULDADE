import java.time.LocalDate;

public class Pickup extends Delivery {
    public Pickup(LocalDate deliveryDate, Integer deliveryCode){
        super(deliveryDate, deliveryCode);
    }
}
