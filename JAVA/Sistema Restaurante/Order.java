import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date orderDate;
    private List<Dish> dishes;
    private double totalAmount;

    public Order(Date orderDate) {
        this.orderDate = orderDate;
        this.dishes = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
        totalAmount += dish.getPrice();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Getters
}