package ProductExercise1;

public class Product {

    protected double price;

    protected String name;

    protected String description;

    protected int quantity;


    public Product(double price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }


    public void setName(String name) {
        this.name.equals(name);
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.name.equals(description);
    }

    public String getDescription() {
        return this.description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }


}
