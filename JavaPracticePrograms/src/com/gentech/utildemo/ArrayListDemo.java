package com.gentech.utildemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElementsByIterator();
		withOutGenerics();
	}
	
	private static void addElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1,"Pineapple");
		obj.add("Mango");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Blue");
		obj1.add("Green");
		obj1.add("Red");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}

	private static void removeElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		obj.remove(1);
		System.out.println("Elements :"+obj);
		obj.remove("Pineapple");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		for(String s1:obj)
		{
			System.out.println(s1);
		}
	}
	
	private static void readElements2()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElementsByIterator()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void withOutGenerics()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(true);
		obj.add(450);
		obj.add(12.99);
		obj.add('W');
		obj.add("Mango");
		System.out.println("Elements :"+obj);
	}
	
}
