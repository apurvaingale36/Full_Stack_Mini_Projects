package com.Stream;

public class Person implements PersonAge {
	
	    private String name;
	    private int age;
	    
	    @Override
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
	 
		
	    //getters setters toString
	
}
