package com.java.objectclone;

public class Employee implements Cloneable{

	public int id;

	public String name;
	
	public Address address;
	
	public Employee(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	//shallow copy
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	//Deep copy
	public Employee deepClone() throws CloneNotSupportedException {
		Employee employee=(Employee) super.clone();
		employee.address=new Address(this.address.cityName);
	    return employee;
	}
}
