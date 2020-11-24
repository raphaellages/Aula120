package entities;

public class Product {
	private String name;
	private Double price;
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public Product() {
	}
public String toString() {
	return name + ", $" + String.format("%.2f", price);
}

}
