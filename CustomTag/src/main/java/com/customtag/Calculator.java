package com.customtag;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Calculator extends TagSupport {

	int a;
	int b;
	char oprator;

	public char getOprator() {
		return oprator;
	}

	public void setOprator(char oprator) {
		this.oprator = oprator;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int doStartTag() {
		JspWriter out = pageContext.getOut();
		try {
		switch (oprator) {
		case '+':
				out.println(a + b);
				break;
		case '-':
			out.println(a - b);
			break;
		case '*':
			out.println(a * b);
			break;
		case '/':
			out.println(a / b);
			break;
		}
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return SKIP_BODY;
}}
