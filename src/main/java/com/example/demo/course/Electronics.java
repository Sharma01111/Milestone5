package com.example.demo.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="electronics_details")
public class Electronics {
	

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int id, String name, String category, String price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Id
	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column(name="name")
	private String name;
	private String category;
	private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price +"]";
	}
	
	

}