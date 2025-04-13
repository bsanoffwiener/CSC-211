public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(350, "Gasoline");
        Engine engine2 = new Engine(65, "Jet Fuel");

        Vehicle corvette = new Car("Corvette", engine1, 4);
        Vehicle harleyDavidson = new Motorcycle("Harley-Davidson", engine2, 2);

        Vehicle[] vehicles = { corvette, harleyDavidson };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println(vehicle.turnIgnition());
            System.out.println();
        }
    }
}
