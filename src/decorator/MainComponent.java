package decorator;

import decorator.Component;

public class MainComponent extends Component {
    public MainComponent(String description, double price) {
        super(description, price);
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
