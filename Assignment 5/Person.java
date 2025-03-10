public class Person {
    private String name;
    private String eyeColor;
    private String hairColor;
    private int age;
    private double height;
    private double weight;

    public Person(String name, String eyeColor, String hairColor, int age, double height, double weight) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + "\nEye Color: " + eyeColor + "\nHair Color: " + hairColor + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight;
    }

    public boolean equals(Person p) {
        return name.equals(p.getName()) && eyeColor.equals(p.getEyeColor()) && hairColor.equals(p.getHairColor()) && age == p.getAge() && height == p.getHeight() && weight == p.getWeight();
    }
}
