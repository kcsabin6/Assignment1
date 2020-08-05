package arrayList5;

import java.util.Comparator;

public class SortBySalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		
		return s1.salary-s2.salary;
	}

}
