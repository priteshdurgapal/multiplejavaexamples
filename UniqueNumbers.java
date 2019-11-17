import java.util.Collection;
import java.util.Arrays;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
    	
    	int[] res=numbers.stream()
    			.mapToInt(Integer::intValue)
    			.toArray();
    	
    	//int rr=res[0];
    	int rr=0;
    	for(int num:numbers){
            rr=num;
        
    	System.out.println(rr);
    	for(int i=1;i<res.length;i++) {
    		rr ^= res[i];
    		
    	}
    	System.out.println("rr"+rr);
    	}
    	//numbers.add(rr);
    	return numbers;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
