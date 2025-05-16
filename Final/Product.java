abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getCategory();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    public String getCategory() {
        return "Electronics";
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    public String getCategory() {
        return "Clothing";
    }
}

class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price);
    }

    public String getCategory() {
        return "Grocery";
    }
}
