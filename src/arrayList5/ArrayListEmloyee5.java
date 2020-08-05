package arrayList5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEmloyee5 {

	public static void main(String[] args) {
		
		Employee e1= new Employee("sabin",21,8000);
		Employee e2= new Employee("ayaush",23,5000);
		Employee e3= new Employee("nick",19,7000);
		Employee e4= new Employee("sam",30,3000);
		
		
		List<Employee> list= new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println("For each :");
		for(Employee e:list) {
			System.out.println(e);
		}
		
		System.out.println("Iterator :");
		Iterator<Employee>ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());		}
		
		
		Collections.sort(list);
		System.out.println("Default : "+list);
		
		Collections.sort(list,new SortBySalaryComparator());
		System.out.println("By salary : "+list);
	}

}
