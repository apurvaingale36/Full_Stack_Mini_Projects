package com.Stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//IntSummaryStatistics even=list.stream().filter(n -> n%2==0).collect(Collectors.summarizingInt(Integer::intValue));
		int even=list.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println(even);
		
	}

}
