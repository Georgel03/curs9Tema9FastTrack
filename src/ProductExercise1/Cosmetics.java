package ProductExercise1;

public class Cosmetics extends Product{

    protected String color;

    protected double weight;
    public Cosmetics(double price, String name, String description, int quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color.equals(color);
    }

    public String getColor() {
        return this.color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
}
