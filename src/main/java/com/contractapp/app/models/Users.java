package com.contractapp.app.models;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Users {
	@Id
	private ObjectId _id; 
	
	private String firstName;
	private String lastName;
	private Integer age;
	private String sex;
	private Boolean employed;
	private String occupation;
	
	public Users() {}		
	
	public Users(ObjectId _id, String firstName, String lastName, Integer age, String sex, Boolean employed, String occupation) {
		this._id = _id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		this.employed = employed;
		this.occupation = occupation;
	}
	
	
	
	public ObjectId get_id() {
		return _id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getEmployed() {
		return employed;
	}

	public void setEmployed(Boolean employed) {
		this.employed = employed;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void set_id(ObjectId _id) {		
		this._id = _id;
	}
}
