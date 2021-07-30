package questionsPractice;

//	USING WHILE LOOP TO PRINT FIBONACCI SERIES

public class Fibonacci2 {

	public static void main(String[] args) {
		
		int a = 0, b = 1, c;
		System.out.println(a);
		System.out.println(b);
		c = a+b;
		System.out.println(c);
		
//		while loop to print to a certain level
		while(c <150) {
			a = b;
			b = c;
			c= a + b;
			System.out.println(c);
		}

	}

}
