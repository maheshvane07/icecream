package com.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Vanela implements Icecream{

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("baby is eating vanela");
	}

}
