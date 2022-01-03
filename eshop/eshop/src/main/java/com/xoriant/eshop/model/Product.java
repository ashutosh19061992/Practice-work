package com.xoriant.eshop.model;

import java.time.LocalDate;

public class Product {

	private String id;
	private String name;
	private double price;
	private LocalDate date;
	private String description;

	public Product(String id, String name, double price, LocalDate date, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
		this.description = description;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + ", description="
				+ description + "]";
	}
}
