package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private Integer id;
	private Category category;
	private String name;
	private Double price;
	private Integer quantity;
	private String description;
	private String details;
	private Byte status;
	private Byte featured;
	private Set photos = new HashSet(0);

	public Product() {
	}

	public Product(Category category, String name, Double price, Integer quantity, String description, String details,
			Byte status, Byte featured, Set photos) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.details = details;
		this.status = status;
		this.featured = featured;
		this.photos = photos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Byte getFeatured() {
		return this.featured;
	}

	public void setFeatured(Byte featured) {
		this.featured = featured;
	}

	public Set getPhotos() {
		return this.photos;
	}

	public void setPhotos(Set photos) {
		this.photos = photos;
	}

}