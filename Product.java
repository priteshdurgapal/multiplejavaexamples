import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
//import com.java2novice.lambda.Employee;
 
public class Product {
	
	public static List<String> getdesired(Stream<Employee> streamm, int score){
		
		return (
		streamm.filter(e->e.getSalary()>score)
		
        //.sorted((emp1, emp2)->emp1.getSalary().compareTo(emp2.getSalary()))
        
       .sorted (Comparator.comparing(Employee::getSalary).reversed())
	//	.map(emp1, emp2)->emp1.getSalary().compareTo(emp2.getSalary())
        .map(Employee::getName)
        //.map(p->ComparabcompareTo (p.getSalary()) )
        .collect(Collectors.toList()));
        //.forEach(System.out::println)
        
		
		
	}
 
    public static void main(String a[]) {
 
       /* Stream.of("bus", "car", "bicycle", "flight", "train")
                .sorted()
                .forEach(System.out::println);
 
        System.out.println("-------------------------");*/
 
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Zmar", "Entertainment", 12500));
 
        Stream<Employee> streamm=empList.stream();
        getdesired(streamm,2500).forEach(System.out::println);
        
        
    }
}