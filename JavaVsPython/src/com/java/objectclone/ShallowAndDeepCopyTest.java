package com.java.objectclone;
/*
 * There are two way in java , you can copy your object
 * 1) shallow copy
 * 2) Deep copy
 * 
 * 
 * In shallow copy we are coping the reference of original object not a actual original object.
 * will use that will creating another reference variable of same class.
 * To achieve shallow copy we need to implement cloneable Interface, which has clone method.
 * If we make any change in parent object it will not affect in child object and vice versa
 */
public class ShallowAndDeepCopyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address=new Address();
		address.setCityName("Solapur");
		Employee employee=new Employee(1,"A", address);
		
		
		Employee shallowCopyEmployee=(Employee) employee.clone();
		shallowCopyEmployee.address.cityName="ANagar";
		
		Employee deepCopyEmployee=employee.deepClone();
		deepCopyEmployee.address.cityName="Pune";
		
		System.out.println("Original City >> "+employee.getAddress());
		System.out.println("shallowCopyEmployee City >> "+shallowCopyEmployee.getAddress());
		System.out.println("deepCopyEmployee City >> "+deepCopyEmployee.getAddress());
	}
}
