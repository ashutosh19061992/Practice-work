package com.xoriant.innerclass;

public class TestMain {

	public static void main(String[] args) {
		
		Person person = () -> {
			System.out.println(">> Character");
		};
		person.character();
	}
}