public abstract class Vehicle {
    protected String brand;
    protected Engine engine;

    public Vehicle(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public abstract String toString();

    public String turnIgnition() {
        return engine.run();
    }
}   
