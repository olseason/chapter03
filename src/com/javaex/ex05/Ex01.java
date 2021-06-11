package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.println(s01==s02); // String 안에 있는 hi가 아니라 각각의 주소가 다르기 때문에 false가 나옴 
		System.out.println(s01.equals(s02)); // 논리적인 비교 
		System.out.println("=========================");
		
		String s03 = "hello";         // 약식으로 사용하면 true가 나옴 
		String s04 = "hello";
		
		System.out.println(s03==s04);
		System.out.println(s03.equals(s04));
		
		System.out.println(s03);
		System.out.println(s04);
		System.out.println("=========================");
		
		
		s03 = "helloo!!!!!!!";
		System.out.println(s03==s04);
		System.out.println(s03);
		System.out.println(s04);
		
		
		
	}
	
}
