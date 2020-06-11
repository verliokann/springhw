package products;

public class Tomatoes implements Products {
    Integer price = 150;
    double weight = 1.0;

    public Tomatoes() {
    }

    public String toString() {
        return "Помидоры";
    }

    public Integer returnPrice() {
        return this.price;
    }

    public double returnWeight() {
        return this.weight;
    }
}