package products;

public class Bread implements Products {
    Integer price = 30;
    double weight = 0.5;

    public Bread() {
    }

    public String toString() {
        return "Хлеб";
    }

    public Integer returnPrice() {
        return this.price;
    }

    public double returnWeight() {
        return this.weight;
    }
}
