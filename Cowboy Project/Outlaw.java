public class Outlaw implements Human {
    private String name;
    private double weight;

    public Outlaw(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}