package com.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Babydriver {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Congurable.class);
		                     Baby b=(Baby) ac.getBean("baby");
		                     b.m1();
	}

}

