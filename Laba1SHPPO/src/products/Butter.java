package products;

public class Butter implements Products {
    Integer price = 100;
    double weight = 0.2;

    public Butter() {
    }

    public String toString() {
        return "Масло";
    }

    public Integer returnPrice() {
        return this.price;
    }

    public double returnWeight() {
        return this.weight;
    }
}
