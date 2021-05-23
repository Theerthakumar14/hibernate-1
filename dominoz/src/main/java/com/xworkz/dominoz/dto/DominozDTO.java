package com.xworkz.dominoz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="pizza")
public class DominozDTO {
	public DominozDTO() {
		super();
		}

	@Column(name="PIZZA_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pizzaId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="ISAVAILABLE")
	private boolean isAvailable;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="SIZE")
	private String size;
	
	@Column(name="PRICE")
	private double price;

	public DominozDTO(String name, String location, boolean isAvailable, String type, String size, double price) {
		super();
		System.out.println(this.getClass().getSimpleName() + "created");
		this.name = name;
		this.location = location;
		this.isAvailable = isAvailable;
		this.type = type;
		this.size = size;
		this.price = price;
	}
	
	public int getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DominozDTO [pizzaId=" + pizzaId + ", name=" + name + ", location=" + location + ", isAvailable="
				+ isAvailable + ", type=" + type + ", size=" + size + ", price=" + price + "]";
	}


}
