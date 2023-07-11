package ProductExercise1;

public class Fridge extends Elecronics{

    protected double temperature;
    public Fridge(double price, String name, String description, int quantity, String type, double length, double width, double height, double weight, double temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return this.temperature;
    }


}
