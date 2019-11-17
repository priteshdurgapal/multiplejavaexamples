package Comprtr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClssMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(12, "Pritesh");
		Employee e2=new Employee(2, "Prites");
		Employee e3=new Employee(21, "test");
		Employee e4=new Employee(100, "Atalongrad");
		
		List<Employee> loe=new ArrayList<Employee>();
		loe.add(e4);
		loe.add(e3);
		loe.add(e2);
		loe.add(e1);
		
		//System.out.println("Sort with ID & name");
		Collections.sort(loe, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				int i =0;
				i= o1.getId()-o2.getId();
				if(i==0)
				{
					i = o1.getName().compareTo(o2.getName());
				}
				return i;
				
			}
			
			
			
		});
		
		
		//System.out.println(loe);
		
		Collections.sort(loe, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
			
			
			
		});
		
		Collections.sort();
		System.out.println("id wise comparator");
		System.out.println(loe);
		
		System.out.println("at line 60");
		Collections.sort(loe, (Employee o1,Employee o2) -> o1.getId()-o2.getId());
		System.out.println(loe);
		System.out.println("======");
		
		System.out.println("at line 65");
		Collections.sort(loe, (Employee o1,Employee o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(loe);
		System.out.println("======");
		
		
		Collections.sort(loe);
		System.out.println("comparable");
		System.out.println(loe);
		System.out.println("=======");
		Collections.sort(loe, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
			
		
		
		//after overriding to String method
		//System.out.println("Sort with Name");
		//System.out.println(loe);
		
		//to use class ByName as sorting method
		/*Collections.sort(loe, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
			
			
		});
		
		System.out.println(loe);*/
		System.out.println("after java 8 ID wise");
		loe.sort((Employee o1,Employee o2)->o1.getId()-o2.getId());
		System.out.println(loe);
		loe.sort((Employee o1,Employee o2)->o1.getName().compareTo(o2.getName()));
		System.out.println("after java 8 name wise");
		System.out.println(loe);
	}

}
