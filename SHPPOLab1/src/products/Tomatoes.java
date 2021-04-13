package products;

public class Tomatoes implements Products {
    double price = 150;
    double weight = 1.0;

    public Tomatoes() {
    }

    public Tomatoes (double weight){
        this.weight=weight;
        this.price=this.price*this.weight;
    }

    public String toString() {
        return "Помидоры";
    }

    public double returnPrice() {
        return this.price;
    }

    public void setWeight(double weight) {
        this.price = (150/1.0)*weight;
        this.weight = weight;
    }

    public double returnWeight() {
        return this.weight;
    }
}