package com.groupBuy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

	@Id
	private String id;
	private String name;
	private String price;
	private String img;
	private String weight;
	private String company;
	private Category category;

	public Item() {
		super();
	}

	public Item(String id, String name, String price, String img, String weight, String company, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.img = img;
		this.weight = weight;
		this.company = company;
		this.category = category;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
}
