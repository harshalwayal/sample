package com.model;

public class Staff {
String id;
String name;
String salary;
String designation;


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
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Staff [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
}

}
