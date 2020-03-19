package com.sagar.aj.entity;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private boolean status;
	
	public Customer() {
		
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", status=" + status + "]";
	}
	public Customer(int id, String name, String email, boolean status) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.status = status;
	}
	
	public String toJson() {
		String json="{";
		json+="\"id\":\""+id+"\",";
		json+="\"name\":\""+name+"\",";
		json+="\"email\":\""+email+"\",";
		json+="\"status\":\""+status+"\"";
		json+="}";
		return json;
	}

}
