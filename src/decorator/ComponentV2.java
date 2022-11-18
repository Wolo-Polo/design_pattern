package decorator;

public class ComponentV2 {
    private String description;
    private double price;
    private ComponentV2 component;

    public ComponentV2(String description, double price, ComponentV2 component) {
        this.description = description;
        this.price = price;
        this.component = component;
    }

    public String getDescription() {
        if(component != null) {
            return component.getDescription() + ", " + description;
        }

        return description;
    }

    public double getPrice() {
        if(component != null) {
            return component.getPrice() + price;
        }

        return price;
    }
}
