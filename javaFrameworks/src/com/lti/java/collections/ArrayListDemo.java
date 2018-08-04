package com.lti.java.collections;



import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List myList=new ArrayList();
		myList.add("Piyush");
		myList.add("Kanti");
		myList.add("Boss");
		System.out.println("\n myList"+myList);
		
		Iterator iter=myList.iterator();
		while(iter.hasNext())
		{
				System.out.println(iter.next());
				
				
		}
		
	}
}
