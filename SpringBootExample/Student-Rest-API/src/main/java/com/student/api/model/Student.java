package com.student.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentInfo")
public class Student 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="city")
private String city;

@Column(name="age")
private int age;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Student(int id, String firstName, String lastName, String city, int age) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.city = city;
	this.age = age;
}

public Student() {
	super();
}

@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", age="
			+ age + "]";
}









}
