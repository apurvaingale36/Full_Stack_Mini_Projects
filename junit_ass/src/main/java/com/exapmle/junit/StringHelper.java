package com.exapmle.junit;

public class StringHelper {
	
	public String truncateAI(String str) {
		if(str.length()<=2) {
			return str.replace("A", "");
		}
		
		String firstchar=str.substring(0,2);
		String minusfirstchar=str.substring(2);
		
		return firstchar.replace("A","")+minusfirstchar;
	}

	public boolean arefirstandlastsame(String str) {
		if(str.length()<=1) {
			return false;
		}
		if(str.length()==2) {
			return true;
		}
		String firstchar=str.substring(0,2);
		String lastchar=str.substring(str.length()-2);
		
		return firstchar.equals(lastchar);
	}
}

