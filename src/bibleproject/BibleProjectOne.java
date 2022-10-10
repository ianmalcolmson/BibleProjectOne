package bibleproject;

public class BibleProjectOne {
	public static void main(String [] args) {
		long ian = 13;
		long malcolmson = 7700000000l;
		int frederick = 0;
		while(ian <= malcolmson) {
			ian = ian * 3;
			frederick = frederick + 3;
		}
		
		System.out.println("it took " + frederick + " years");
	}

}
