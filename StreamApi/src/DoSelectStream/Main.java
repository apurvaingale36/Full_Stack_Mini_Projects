package DoSelectStream;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
	
	Implementation imp=new Implementation();
	
	Consumer c1=new Consumer("Apurva", 24, FoodType.NONVEG);
	Consumer c2=new Consumer("Jatan", 22, FoodType.VEG);
	Consumer c3=new Consumer("Anjali", 23, FoodType.VEG);
	
	List<Consumer> consumers=Arrays.asList(c1,c2,c3);
	
	System.out.println(imp.getNonVegetarianList(consumers));
	System.out.println(imp.sortConsumerByAge(consumers));
	}
}
