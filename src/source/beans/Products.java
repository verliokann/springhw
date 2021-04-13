package source.beans;

public class Products {
    String type;
    double weight;
    double price;


    public Products(String type, double weight, double price){
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public static Products getProducts(String type, double weight, double price){
        return new Products(type, weight, price);
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.price = this.price * this.weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " " +
                "Вес=" + weight;
    }
}
