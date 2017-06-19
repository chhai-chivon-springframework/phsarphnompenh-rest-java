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



@Entity
@Table(name="TB_USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	private Long id;
	@Column(name = "USERNAME" , nullable = false, length = 250)
	private String username;
	@Column(name = "EMAIL" , nullable = true, length = 250)
	private String email;
	@Column(name = "PHONE" , nullable = true, length = 250)
	private String phone;
	@Column(name = "PASSWORD" , nullable = false, length = 250)
	private String password;
	/*@ManyToMany(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST}) 
    @JoinTable( 
                name="USER_ROLE", 
                joinColumns=@JoinColumn(name="USER_ID",referencedColumnName="id"), 
                inverseJoinColumns=@JoinColumn(name="ROLE_ID",referencedColumnName="id") 
                ) */
	 /*@OneToMany
	 @JoinTable(
	            name="USER_ROLE",
	            joinColumns = @JoinColumn( name="USER_ID"),
	            inverseJoinColumns = @JoinColumn( name="ROLE_ID")
	    )*/
	private Set<Role> role;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLE", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
}
