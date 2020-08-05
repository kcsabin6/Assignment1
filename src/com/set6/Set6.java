package com.set6;
import arrayList5.Employee;
import arrayList5.SortBySalaryComparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set6 {
	public static void main(String[] args) {
		
		Employee e1= new Employee("sabin",21,8000);
		Employee e2= new Employee("ayaush",23,5000);
		Employee e3= new Employee("nick",19,7000);
		Employee e4= new Employee("sam",30,3000);
		
		Set<Employee> set= new TreeSet<Employee>();//default sorting by name
		//Set<Employee> set= new TreeSet<Employee>(new SortBySalaryComparator());
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		System.out.println(set);
		System.out.println("Foreach:");
		for(Employee e:set) {
			System.out.println(e);
		}
		System.out.println("Iterator:");
		Iterator<Employee>ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}

}
