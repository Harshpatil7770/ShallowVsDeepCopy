package com.java.reverse;

import java.util.ArrayList;
import java.util.List;

//class ReverseNum.py
public class ReverseNum {

	//no main method required python
	public static void main(String[] args) {
		
		//no need to create list object
		List<Integer> numLists=new ArrayList<>();
		numLists.add(1);
		numLists.add(2);
		numLists.add(3);
		numLists.add(4);
		numLists.add(5);
		
		//python
		//my_list=[1,2,3,4,5]

		//java
		//the first state will run for start the execution of loop i.e i=0;
		// then second will get execute if it is true then , it will go to for loop 
		// execute the loop
		// third condition will get execute
		// now it will come to condition if it is true then for loop and after that increment
		// initialization , condition , increment
		for(int i=0;i<numLists.size();i++) {
			System.out.println(numLists.get(i));
		}
		
		//java
		for(int i=numLists.size()-1 ; i>=0 ;i--) {
			System.out.println(numLists.get(i));
		}
		
		//
		// for i in range(len(my_list)):
		//   print(my_list[i])
		
		//for i in reversed(my_list):
		// print(i)
		
		// how to print list of size
		//print(len(my_list)
	}
}
