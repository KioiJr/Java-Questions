package questionsPractice;

// 		print fibonacci using for loop 

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =0, b=1, c, count = 20;
		System.out.println(a+ " " +b);
		
		for(int i =2; i < count; i++) {
			c = a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		

	}

}
