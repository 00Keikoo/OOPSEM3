package base;

public abstract class Component {
    protected double price;

    public Component(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
