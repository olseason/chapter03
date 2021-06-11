package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String (" abcd");
		String b = new String (",efg ");
		
		System.out.println(a.concat(b));   //가상으로 합쳐준다 
		System.out.println(a);
		System.out.println(b);
		System.out.println("=========================");
		
		
		a = a.concat(b);        // 문자열 붙이기 
		System.out.println(a);
		 
		
		a = a.trim();           // 공백을 삭제 
		System.out.println("------"+a+"-----");
		System.out.println(a);
		
		a = a.replace("ab", "12");  // 대체할 수 있게 해주는 
		System.out.println(a);
		
		System.out.println("=========================");
		
		String[] sArray = a.split(",");         // 제거해주는 
		for(int i = 0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println("=========================");
		
		
		String str = "Hello java!";
		System.out.println(str.charAt(6));
		
		
		System.out.println("=========================");
		
		
		String result = str.substring(3); // 내가 쓴 문자열의 넘버만 출력 
		System.out.println(result);
		
		String result2 = str.substring(3,7);  //내가 쓴 문자열부터 마지막 문자열 전까지 출력 
		System.out.println(result2);

	}

}
