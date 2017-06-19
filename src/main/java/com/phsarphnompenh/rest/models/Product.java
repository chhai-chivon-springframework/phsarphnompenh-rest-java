package com.phsarphnompenh.rest.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="TB_PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID", unique = true, nullable = false)
	private Long id;
	/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CATEGORY",joinColumns = @JoinColumn(name = "PRODUCT_ID"),inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
	private Set<Category> category = new HashSet<Category>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER",joinColumns = @JoinColumn(name = "PRODUCT_ID"),inverseJoinColumns = @JoinColumn(name = "USER_ID"))
	private Set<User> user = new HashSet<User>();
	*/
	@Column(name = "NAME" , nullable = false, length = 250)
	private String name;
	@Column(name = "IMAGE" , nullable = false, length = 250)
	private String image;
	@Column(name = "DESCRIPTION" , nullable = false, length = 250)
	private String description;
	@Column(name = "POST_DATE" , nullable = false, length = 250)
	private Date postDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/*public Set<Category> getCategory() {
		return category;
	}
	public void setCategory(Set<Category> category) {
		this.category = category;
	}
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDated(Date postDate) {
		this.postDate = postDate;
	}
}
