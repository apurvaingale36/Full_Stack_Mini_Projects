package DoSelectStream;

public class Consumer {
	private String name;
	private int age;
	private FoodType foodType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	public Consumer(String name, int age, FoodType foodType) {
		super();
		this.name = name;
		this.age = age;
		this.foodType = foodType;
	}
	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", foodType=" + foodType + "]";
	}
	
	
}
