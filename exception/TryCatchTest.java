package exception;

public class TryCatchTest {
	public static void main(String[] args) {
		System.out.println("=======================프로그램 시작=======================");
		//arithmenticException();
		//indexException();
		//nullPointerException();
		//numberFormatException();
		System.out.println("=======================프로그램 종료=======================");
	}
	
	public static void arithmenticException() {
		int a= 10;
		int b = 0;
		try {
			int c = a/b;	
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void indexException() {
		int[] array = {0,1,2};
		for (int i = 0; i <= array.length; i++) {
			try {
				System.out.println(array[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// e.printStackTrace();
				System.out.println(e.toString());
	            System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static void nullPointerException() {
		String str = null;
		try {
			str.charAt(1);
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println(e.toString());
	        System.out.println(e.getMessage());
		}
	}
	
	
	public static void numberFormatException() {
	    String str = "123AA";

	    try {
	        int num = Integer.parseInt(str);
	    } catch (NumberFormatException e) {
	        System.out.println(e.toString());
	        System.out.println(e.getMessage());
	    }
	}
		
}
	

