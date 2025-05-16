import java.util.*;

class Order {
    private List<Product> cart;
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Product p : cart) {
            subtotal += p.getPrice();
        }
        return subtotal;
    }

    public double calculateTotal() {
        double subtotal = getSubtotal();
        double tax = subtotal * 0.08;
        double shipping = subtotal > 100 ? 0 : 15;
        return subtotal + tax + shipping;
    }

    public List<Product> getCart() {
        return cart;
    }

    public String getCustomerName() {
        return customer.getUsername();
    }
}
