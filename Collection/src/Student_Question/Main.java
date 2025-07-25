package Student_Question;

public class Main {
	public static void main(String[] args) {
		
		Merit obj=new Merit();
		Student s1=new Student("s1", 100);
		Student s2=new Student("s2", 200);
		Student s3=new Student("s3", 400);

		
		System.out.println(obj.newEntry(s1, "IIT BOMBAY"));
		System.out.println(obj.newEntry(s2, "IIT MADRAS"));
		System.out.println(obj.newEntry(s3, "IIT BOMBAY"));
		
		System.out.println(obj.getStudents("IIT BOMBAY"));

	}
}
