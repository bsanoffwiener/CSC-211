public class Engine {
    private int hp;
    private String type;

    public Engine(int horsepower, String type) {
        this.hp = horsepower;
        this.type = type;
    }

    public String run() {
        return type + " engine with " + hp + " HP is starting.";
    }

    public String getType() {
        return type;
    }
}