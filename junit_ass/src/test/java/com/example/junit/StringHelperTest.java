package com.example.junit;

import static org.junit.Assert.*;


import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.exapmle.junit.StringHelper;

public class StringHelperTest {
	
	//private static final Class<? extends Throwable> NullPointerExpection = null;
	StringHelper helper;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before Test");
		helper=new StringHelper();
	}
	
	
	@Test
	public void test() {
		
		assertEquals( "CD",helper.truncateAI("AACD"));
		assertEquals( "CD",helper.truncateAI("ACD"));
		System.out.println("Test 1 Done!");

	}
	
	@Test
	public void test2() {
		//StringHelper helper=new StringHelper();
		assertFalse( helper.arefirstandlastsame("ABCD"));
		System.out.println("Test 2 Done!");

				
	}
	@Test
	public void test3() {
		//StringHelper helper=new StringHelper();
		assertTrue(helper.arefirstandlastsame("ABAB"));
		System.out.println("Test 3 Done!");
	}
	
	@Test
	public void sortArray() {
		int[] numbers= {89,23,67,9,3};
		int[] expected= {3,9,23,67,89};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
		
	}
	
	
	@Test(expected=NullPointerException.class)
	public void ArrayExecption() {
		int[] numbers=null;
			Arrays.sort(numbers);		
	}
	
	@Test(timeout = 100)
	public void sort_Performance() {
		int array[]= {12,23,4};
		for(int i=1;i<=10000000;i++) {
			array[0]=i;
			Arrays.sort(array);
		}
	}
	
	@After
	public void teardown() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
