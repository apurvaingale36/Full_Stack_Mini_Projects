package DoSelectStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Implementation {
	
	public List<Consumer> getNonVegetarianList(List<Consumer> consumer) {
		List<Consumer> nonveg=new ArrayList<Consumer>();
		consumer.stream().forEach((c)-> { if(c.getFoodType().name().equals("NONVEG"))
				nonveg.add(c);
		});
		return nonveg;
	}
	
	public List<Consumer> sortConsumerByAge(List<Consumer> consumer) {
		
		return consumer.stream().sorted(Comparator.comparingInt(Consumer::getAge)).toList();
		
	}
}
