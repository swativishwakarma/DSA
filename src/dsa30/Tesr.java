package dsa30;

public class Tesr {

	public static void main(String[] args) {

		System.out.println("===============Static=============");
		CountFactor.m2();
		CountFactor.m4();
		CountFactor.m7();
		//CountFactor.ms();
		System.out.println("==============Non Static ============");
		CountFactor a=new CountFactor();
		//a.m1();
		a.m3();
		a.m5();
		a.m6();
		System.out.println("==============obj ref Static(should not do) ============");
		a.m2();
		a.m4();
		a.m7();
		//a.ms();
	}

}
