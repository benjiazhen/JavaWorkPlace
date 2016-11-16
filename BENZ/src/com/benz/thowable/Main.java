package com.benz.thowable;

public class Main {
	public static void main(String[] args) {
		//System.out.println("benjiazhen");
		boolean result = false ;
		try {
			
		result = test();
		System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	public static boolean test() 
	{
		try {
			int i = 1/0;
		} catch (Exception e) {
			throw new RuntimeException("test");
		}finally {
			System.out.println("finally");
		}
		System.out.println("benjiazhen");
		return true;
	}
}
