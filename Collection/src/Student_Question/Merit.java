package Student_Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Merit {
	HashMap<String,ArrayList<Student>> mlist=new HashMap<String, ArrayList<Student>>();
	
	public String newEntry(Student s, String universityName) {
		
		if(mlist.containsKey(universityName)) {
			ArrayList<Student> list=mlist.get(universityName);
			list.add(s);
			mlist.put(universityName, list);
			return "Student Added";
		}
		else {
			ArrayList<Student> list=new ArrayList<Student>();
			list.add(s);
			mlist.put(universityName, list);
			return "University Added";

		}
	}
	
	public ArrayList<String> getStudents(String universityName) {
		ArrayList<String> list=new ArrayList<>();
		if(mlist.get(universityName) != null) {
			for(int i=0;i<mlist.get(universityName).size();i++) {
		
				list.add(mlist.get(universityName).get(i).stu_name);
			}
			return(list.size()!=0)?list:null;
		}
		else {
		return null;
		
	}
	}
}
