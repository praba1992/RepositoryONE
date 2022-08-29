package org.testNg;

import org.testng.annotations.Test;

public class PriorityCheck {
@Test(priority = 1)
	public void uname() {
		System.out.println("username");

	}
@Test(priority = 2)
public void Password() {
		System.out.println("password");

	}
@Test(priority = 3)
	public void Mobile() {
		System.out.println("Mobileno");

	}
@Test(priority = 5)
	public void gender() {
		System.out.println("Gender");

	}
@Test(priority = 4)
	public void id() {
		System.out.println("userid");

	}
@Test(priority = -1)
public void signin() {
		System.out.println("signin");

	}



}
