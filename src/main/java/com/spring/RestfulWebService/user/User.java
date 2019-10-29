package com.spring.RestfulWebService.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.spring.RestfulWebService.post.Post;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details about the user.")
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2, message="Name should have at least 2 characters")
	@ApiModelProperty(notes="Name should have at least 2 characters")
    private String name;
	
	@Size(min=2, message="Surname should have at least 2 characters")
	@ApiModelProperty(notes="Surname should have at least 2 characters")
    private String surname;
	
	@OneToMany(mappedBy="user")
	private List<Post> posts;

	
	protected User() {
		
	}
	
	public User(Integer id, String name,String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	public List<Post> getPosts(){
		return posts;
	}
	
	
	public String toString() {
		return String.format("User [id=%s, name=%s, surname=%s]", id, name, surname);
	}
	

}
