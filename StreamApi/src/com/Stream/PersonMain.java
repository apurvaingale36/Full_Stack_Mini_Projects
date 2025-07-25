package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a list of Person objects.
		Use the Stream API to group persons by their age.
		Use Collectors.groupingBy to achieve this.
		*/
		List<Person> per=Arrays.asList(
				new Person("Apurva",22),
				new Person("Vedant",23),
				new Person("Chetan",22),
				new Person("Jaya",22),
				new Person("Amit",23));
		
		
		Map<Integer, List<Person>> groupage=per.stream().collect(Collectors.groupingBy(Person::getAge));
		
		
		groupage.forEach((age,pname) -> {
			System.out.println("age " +age);
			System.out.println("person "+ pname);
		});
	}

}
