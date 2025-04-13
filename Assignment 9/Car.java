public class Car extends Vehicle {
    private int doors;

    public Car(String brand, Engine engine, int doors) {
        super(brand, engine);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car: " + brand + ", Doors: " + doors + ", Engine: " + engine.getType();
    }
}
