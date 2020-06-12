package products;

public class Butter implements Products {
    double price = 100;
    double weight = 0.2;

    public Butter() {
    }

    public String toString() {
        return "Масло";
    }

    public double returnPrice() {
        return this.price;
    }

    public void setWeight(double weight) {
        this.price = (100/0.2)*weight;
        this.weight = weight;
    }

    public double returnWeight() {
        return this.weight;
    }
}
