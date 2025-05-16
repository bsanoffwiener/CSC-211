import javax.swing.*;
import java.util.*;

public class Final {
    public static void main(String[] args) {
        List<Product> catalog = Arrays.asList(
            new Electronics("Smartphone", 699.99),
            new Electronics("Monitor", 249.99),
            new Clothing("Jeans", 49.99),
            new Grocery("Milk", 3.49),
            new Grocery("Eggs", 2.99)
        );

        String username = JOptionPane.showInputDialog(null, "Enter your name:", "Customer Login", JOptionPane.PLAIN_MESSAGE);
        if (username == null || username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid name. Exiting.");
            return;
        }

        Customer customer = new Customer(username);
        Order order = new Order(customer);

        while (true) {
            String[] options = {"Add Product", "View Cart", "Finish"};
            int action = JOptionPane.showOptionDialog(null, "Choose an action:",
                "Cart Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (action == 2 || action == JOptionPane.CLOSED_OPTION) break;

            if (action == 1) {
                if (order.getCart().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Cart is currently empty.", "Cart", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    StringBuilder cartView = new StringBuilder("Current Cart:\n");
                    for (Product p : order.getCart()) {
                        cartView.append("- ").append(p.getName()).append(": $").append(String.format("%.2f", p.getPrice())).append("\n");
                    }
                    cartView.append("\nSubtotal: $").append(String.format("%.2f", order.getSubtotal()));
                    JOptionPane.showMessageDialog(null, cartView.toString(), "Cart", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            if (action == 0) {
                String[] productNames = catalog.stream().map(Product::getName).toArray(String[]::new);
                String choice = (String) JOptionPane.showInputDialog(null, "Select a product to add to cart:",
                    "Product Catalog", JOptionPane.PLAIN_MESSAGE, null, productNames, productNames[0]);

                if (choice != null) {
                    catalog.stream()
                        .filter(p -> p.getName().equals(choice))
                        .findFirst()
                        .ifPresent(order::addProduct);
                }
            }
        }

        if (order.getCart().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No products selected. Order cancelled.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Submit order for " + order.getCustomerName() + "?",
            "Confirm Submission", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            StringBuilder receipt = new StringBuilder("Order submitted for " + order.getCustomerName() + "\n\nItems:\n");
            for (Product p : order.getCart()) {
                receipt.append("- ").append(p.getName()).append(": $").append(String.format("%.2f", p.getPrice())).append("\n");
            }
            receipt.append("\nTotal: $").append(String.format("%.2f", order.calculateTotal()));
            JOptionPane.showMessageDialog(null, receipt.toString(), "Order Submitted", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Order not submitted.", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
