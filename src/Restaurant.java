import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {
    private Queue<Customer> queue;

    public Restaurant() {
        queue = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public Customer serveCustomer() {
        return queue.poll();
    }

    public Customer findCustomer(String id) {
        for (Customer customer : queue) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public void displayQueue() {
        for (Customer customer : queue) {
            System.out.println(customer);
        }
    }
}
