package products;

public class Meat implements Products {
    Integer price = 200;
    double weight = 1.0;

    public Meat() {
    }

    public Integer returnPrice() {
        return this.price;
    }

    public String toString() {
        return "Мясо";
    }

    public double returnWeight() {
        return this.weight;
    }
}
