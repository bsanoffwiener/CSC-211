public class Motorcycle extends Vehicle {
    private int wheels;

    public Motorcycle(String brand, Engine engine, int wheels) {
        super(brand, engine);
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Motorcycle: " + brand + ", Wheels: " + wheels + ", Engine: " + engine.getType();
    }
}
