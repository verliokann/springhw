package products;

public class Bread implements Products {
    double price = 30;
    double weight = 0.5;

    public Bread() {
    }

    public String toString() {
        return "Хлеб";
    }

    public double returnPrice() {
        return this.price;
    }

    public void setWeight(double weight) {
        this.price = (30/0.5) * weight;
        this.weight = weight;
    }

    public double returnWeight() {
        return this.weight;
    }
}
