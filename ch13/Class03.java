package myJava13;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = 12,den = 0;
			int ans = num/den;
			System.out.print("ans="+ans);
		}
		catch(ArithmeticException e) {
			System.out.println("除數為0");
		}
		finally {
			System.out.println("end of main() method!!");
		}
	}

}
