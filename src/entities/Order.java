package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enum.OrderStatus;

public class Order {
	List<OrderItem> cart = new ArrayList<>();
	private Date moment;
	private OrderStatus status;
	Client client;
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	public Order() {
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public void addItem(OrderItem item) {
		cart.add(item);
	}
	
	public void removeItem(OrderItem item) {
		cart.remove(item);
	}
	
	public Double total() {
		double total = 0;
		for (OrderItem item : cart)
			total += item.subTotal();
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (OrderItem x : cart) {
			sb.append(x + "\n");			
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
