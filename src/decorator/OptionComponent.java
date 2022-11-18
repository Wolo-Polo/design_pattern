package decorator;

import decorator.Component;

public class OptionComponent extends Component {
    private Component mainComponent;

    public OptionComponent(String description, double price, Component component) {
        super(description, price);
        this.mainComponent = component;
    }

    @Override
    public String getDescription() {
        return this.mainComponent.getDescription() + ", " + this.description;
    }

    @Override
    public double getPrice() {
        return this.mainComponent.getPrice() + this.price;
    }
}