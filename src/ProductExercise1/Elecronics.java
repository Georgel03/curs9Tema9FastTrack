package ProductExercise1;

public class Elecronics extends Product{

    protected String type;

    protected double length;

    protected double width;

    protected double height;

    protected double weight;

    public Elecronics(double price, String name, String description, int quantity, String type, double length,
                      double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;

    }

    public String getType() {
        return  this.type;
    }

    public void setType(String type) {
        this.type.equals(type);
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return  this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return  this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
