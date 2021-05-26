package com.xworkz.sewing.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity
@Table(name="sewing_machine")

public class SewingMachineDTO {
	@Column(name="SEWING_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int sewingId;
	
	@Column(name="COLOUR")
	 private String colour;
	
	@Column(name="NAME")
	 private String name;
	
	@Column(name="MODEL")
	 private String model;
	
	@Column(name="size")
	 private int size;
	
	@Column(name="PRICE")
	 private double price;
	
	@Column(name="ISWORKING")
	 private boolean isWorking;
	
	 
	 public SewingMachineDTO() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}


	public SewingMachineDTO(String colour, String name, String model, int size, double price, boolean isWorking) {
		super();
		System.out.println(this.getClass().getSimpleName() + "created");
		this.colour = colour;
		this.name = name;
		this.model = model;
		this.size = size;
		this.price = price;
		this.isWorking = isWorking;
	}


	public int getSewingId() {
		return sewingId;
	}


	public void setSewingId(int sewingId) {
		this.sewingId = sewingId;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isAvailable() {
		return isWorking;
	}


	public void setAvailable(boolean isWorking) {
		this.isWorking = isWorking;
	}


	@Override
	public String toString() {
		return "SewingMachineDTO [sewingId=" + sewingId + ", colour=" + colour + ", name=" + name + ", model=" + model
				+ ", size=" + size + ", price=" + price + ", isWorking=" + isWorking + "]";
	}
	
	
	 
	 
	 
	 

}
