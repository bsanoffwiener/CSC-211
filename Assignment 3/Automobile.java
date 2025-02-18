public class Automobile {
    private String model;
    private int year;
    private String brand;

    public Automobile(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public Automobile() {
        this.model = "Unknown";
        this.year = 0;
        this.brand = "Unknown";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is honking");
    }

    public void accelerate() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is accelerating");
    }

    public void stop() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is stop");
    }

    public void reverse() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is reversing");
    }

    public int compareTo(Automobile other) {
        return Integer.compare(this.year, other.year);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        return false;
    }

    public String toString() {
        return "Automobile: " + getYear() + " " + getBrand() + " " + getModel();
    }
}

class Car extends Automobile {
    public Car(String model, int year, String brand) {
        super(model, year, brand);
    }
    @Override
    public String toString() {
        return "Car: " + getYear() + " " + getBrand() + " " + getModel();
    }
}

class SportsCar extends Automobile {
    public SportsCar(String model, int year, String brand) {
        super(model, year, brand);
    }

    @Override
    public void honk() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is obnoxious honking");
    }

    @Override
    public void accelerate() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is rapidly accelerating");
    }

    @Override
    public void stop() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is rapidly stop");
    }

    @Override
    public void reverse() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is rapidly reversing");
    }
    @Override
    public String toString() {
        return "Sports Car: " + getYear() + " " + getBrand() + " " + getModel();
    }
}

class JunkCar extends Automobile {
    public JunkCar(String model, int year, String brand) {
        super(model, year, brand);
    }

    @Override
    public void honk() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is slowly honking");
    }

    @Override
    public void accelerate() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is slowly accelerating");
    }

    @Override
    public void stop() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is slowly stop");
    }

    @Override
    public void reverse() {
        System.out.println(getYear() + " " + getBrand() + " " + getModel() + " is slowly reversing");
    }
    @Override
    public String toString() {
        return "Junk Car: " + getYear() + " " + getBrand() + " " + getModel();
    }
}

class Main {
    public static void main(String[] args) {
        Automobile[] Automobiles = {
                new Car("1500", 2022, "Ram"),
                new SportsCar("C7 Stingray", 2014, "Corvette"),
                new JunkCar("Corolla", 2000, "Toyota")
        };

        for (Automobile auto : Automobiles) {
            System.out.println(auto);
            auto.honk();
            auto.accelerate();
            auto.stop();
            auto.reverse();
            System.out.println();
        }
    }
}