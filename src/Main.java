import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add customer");
            System.out.println("2. Serve customer");
            System.out.println("3. Find customer");
            System.out.println("4. Display queue");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            if (choice == 1) {
                System.out.print("Enter customer ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();
                Customer customer = new Customer(id, name);
                restaurant.addCustomer(customer);
            } else if (choice == 2) {
                Customer customer = restaurant.serveCustomer();
                if (customer != null) {
                    System.out.println("Serving customer: " + customer);
                } else {
                    System.out.println("No customers to serve.");
                }
            } else if (choice == 3) {
                System.out.print("Enter customer ID: ");
                String id = scanner.nextLine();
                Customer customer = restaurant.findCustomer(id);
                if (customer != null) {
                    System.out.println("Found customer: " + customer);
                } else {
                    System.out.println("Customer not found.");
                }
            } else if (choice == 4) {
                restaurant.displayQueue();
            } else if (choice == 5) {
                break;
            }
        }

        scanner.close();
    }
}
