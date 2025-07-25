package com.example.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.exapmle.junit.StringHelper;
@RunWith(Parameterized.class)
public class ParameterizedTest {

	StringHelper helper = new StringHelper();

	private String input;
	private String expectedOutput;

	public ParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testCondition() {
		String expectedOutput[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutput);
	}

	@Test
	public void test1() {

		assertEquals(expectedOutput, helper.truncateAI(input));
		System.out.println("Test 2 Done!");

	}

	public void test2() {

		assertEquals(expectedOutput, helper.truncateAI(input));
		System.out.println("Test 2 Done!");

	}
}
