package products;

public class Meat implements Products {
    double price = 200;
    double weight = 1.0;

    public Meat() {
    }

  public Meat (double weight){
        this.weight=weight;
        this.price=this.price*this.weight;
    }
    public double returnPrice() {
        return this.price;
    }

    public void setWeight(double weight) {
        this.price = (200/1) * weight;
        this.weight = weight;
    }

    public String toString() {
        return "Мясо";
    }

    public double returnWeight() {
        return this.weight;
    }
}
