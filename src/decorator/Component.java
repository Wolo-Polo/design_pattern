package decorator;

public abstract class Component {
    protected String description;
    protected double price;

    protected Component(String description, double price) {
        super();
        this.description = description;
        this.price = price;
    }

    public abstract String getDescription();
    public abstract double getPrice();
}
