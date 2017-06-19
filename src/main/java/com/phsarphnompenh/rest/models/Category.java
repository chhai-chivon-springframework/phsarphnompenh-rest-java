package com.phsarphnompenh.rest.models;

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

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@Table(name="TB_CATEGORY")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	private Long id;
	
	/*@NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "parent_category")
    private Category mainCategory;

    @SuppressWarnings("deprecation")
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)//Avoiding empty json arrays.objects
    @OneToMany(mappedBy = "mainCategory", fetch = FetchType.EAGER)
    private List<Category> subCategory;*/
	
/*	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER",joinColumns = @JoinColumn(name = "CATEGORY_ID"),inverseJoinColumns = @JoinColumn(name = "USER_ID"))
	private Set<User> user = new HashSet<User>();*/
	
	@Column(name = "NAME" , nullable = false, length = 250)
	private String name;
	@Column(name = "CREATED_DATE" , nullable = false, length = 250)
	private String createDate;
	@Column(name = "DESCRIPTION" , nullable = false, length = 250)
	private String description;
	@Column(name = "ICON" , nullable = false, length = 250)
	private String icon;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/*public Category getMainCategory() {
		return mainCategory;
	}
	public void setMainCategory(Category mainCategory) {
		this.mainCategory = mainCategory;
	}
	public List<Category> getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(List<Category> subCategory) {
		this.subCategory = subCategory;
	}*/
	/*public Set<User> getUser() {
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}
