import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Creating clients
        Client client1 = new Client("Joao", "123456789", new Date(1990, 5, 15), "123 Main Street");
        Client client2 = new Client("Maria", "987654321", new Date(1985, 8, 20), "456 Elm Street");

        // Creating dishes
        Dish dish1 = new Dish("Chicken with Pasta", 12.99);
        Dish dish2 = new Dish("Set Meal", 14.99);

        // Creating orders
        Order order1 = new Order(new Date());
        order1.addDish(dish1);
        order1.addDish(dish2);

        Order order2 = new Order(new Date());
        order2.addDish(dish2);

        // Creating tables
        Table table1 = new Table(1, 4);
        Table table2 = new Table(2, 6);

        // Marking tables as occupied
        table1.setOccupied(true);
        table2.setOccupied(true);

        // Displaying information
        System.out.println("Welcome to Our Restaurant!");
        System.out.println("--------------------------");
        System.out.println("Client 1: " + client1.getName());
        System.out.println("Client 1's Order:");
        for (Dish dish : order1.getDishes()) {
            System.out.println(" - " + dish.getName() + ": $" + dish.getPrice());
        }
        System.out.println("Total Amount: $" + order1.getTotalAmount());
        System.out.println();
        System.out.println("Client 2: " + client2.getName());
        System.out.println("Client 2's Order:");
        for (Dish dish : order2.getDishes()) {
            System.out.println(" - " + dish.getName() + ": $" + dish.getPrice());
        }
        System.out.println("Total Amount: $" + order2.getTotalAmount());
        System.out.println();
        System.out.println("Tables:");
        System.out.println("Table " + table1.getTableNumber() + " - Seats: " + table1.getSeats() + " - Status: " + (table1.isOccupied() ? "Occupied" : "Free"));
        System.out.println("Table " + table2.getTableNumber() + " - Seats: " + table2.getSeats() + " - Status: " + (table2.isOccupied() ? "Occupied" : "Free"));

        // Freeing up table 1
        table1.setOccupied(false);

        // Displaying table status after freeing up
        System.out.println();
        System.out.println("Table " + table1.getTableNumber() + " - Seats: " + table1.getSeats() + " - Status: " + (table1.isOccupied() ? "Occupied" : "Free"));
    }
}
