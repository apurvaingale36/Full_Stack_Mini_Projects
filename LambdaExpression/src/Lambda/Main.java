package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaInterface ad = (a, b) ->  (a + b);
		System.out.println(ad.add(3, 6));

		// Write a Java program to implement a lambda expression to find the second
		// largest and smallest element in an array.

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(2);
		list.add(37);
		list.add(40);
		//list.add(18);

		int small = (int) Collections.min(list);
		int large = (int) Collections.max(list);
		int secondlarge = Integer.MIN_VALUE;

		SecondSmallest var = (ll, smallest, largest, second) -> {
			for (int i : list) {
				if (i < largest && i > smallest) {
					second = i;
				}
			}
			System.out.println("Second Largest: " + second);
			System.out.println("Largest: " + largest);
			System.out.println("Smallest: " + smallest);
		};
		var.secndsmall(list, small, large, secondlarge);

	}
}