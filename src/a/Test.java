package a;

public  class Test {
	{
		System.out.println("non static B");
	}
	
	static {
		System.out.println(" static B");
		//db config
	}
	
	 private  Test() {
		 System.out.println("Test");
	 }
	  
	
	public static void main(String[] args) {
		System.out.println("Main");
		Test.m1();
		Test test =new Test();
		test.testMethod();
		Test test2 =new Test();
	}
	
	private void testMethod() {
		System.out.println("testMethod ");
	}
	
	private static void m1() {
		System.out.println("static Method");
	}

}
/*
 Main
 Test
 testMethod
 -----------
 static B
 Main
 non static B
 Test
 testMethod
 -------------
 
 static Block
 Main
 static mthod
 Non static Block
 contructor
 method
 
 
 
 
*/



