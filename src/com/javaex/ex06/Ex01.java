package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
	
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01 + i02;   //int result = 10 + 7;
		
		
		System.out.println(result);
		//Integer result = new Integer(10) + new Integer(7);

		
		int i10 = 7;
		i01.intValue();     
		
		
		//박싱 
		Integer i11 = 10;            // Integer i11 = new Integer(10)과 같다. 
		

		//언박싱 
		int i101 = i11;
		System.out.println(i101);
		
		System.out.println("문자열-->정수=======================");
		
		
		//"12345" --> 12345예제 
		Integer i999 = new Integer(999);
		int num = i999.parseInt("12345");
		System.out.println(num);
		
		//"12345" --> 12345 실제사용 
		int num2 = Integer.parseInt("12345");
		System.out.println(num2);
		
		
		//정수 --> 문자열로 예제 
		String str = new String("12345");
		String strResult = str.valueOf(123456);            //123456 -> "123456" 
		System.out.println(strResult);
		
		
		//정수 --> 문자열로 예제 
		String strResult2 = String.valueOf(123456);
		System.out.println(strResult2); 
		
		
		//정수 --> 문자열로 많이사용 
		String strResult3 =""+9876;        //9876 --> "9876" 
		System.out.println(strResult3); 
		
		
		String yn = "y";    //사용자가 입력한 값 
		//String yn = new String("y")와 같다. 
		yn = null;
		
		
		//null 포인트 상황이 발생할 수 있음 
		if(yn.equals(yn)) {
			System.out.println("게임다시시작");
		}
		
		//equals() 사용팁 --> null 포인트 상황이 발생하지 않음 
		if("y".equals(yn)) {
			System.out.println("게임다시시작");
		}
		
		
		//다른 기본 자료형
		Byte b = new Byte((byte)1);
		Short s = new Short((short)1);

		
		

	}

}
