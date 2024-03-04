import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Owayran Torquato", "Rua londrina - 465, Jardim Santa Terezinha");

        Items item1 = new Items("Batata Frita",2,10.99,0.500);
        Items item2 = new Items("Hamburguer", 1, 24.99, 0.750);

        Express expressOrder1 = new Express(LocalDate.now(), 001, 1.99);
        expressOrder1.setCustomer(customer1);
        expressOrder1.addItem(item1);
        expressOrder1.addItem(item2);

        expressOrder1.showInfo();
        System.out.println("Total value of the order: " + expressOrder1.calculateTotalValue());
    }
}