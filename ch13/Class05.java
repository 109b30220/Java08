package myJava13;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = 12;
			int den[]= {12,6,3,9,44,4};
			for(int i=0;i<10;i++)
				System.out.println("ans="+num/den[i]);
		}
		catch(ArithmeticException e){
			System.out.println("除數為0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("陣列註標超出了範圍");
		}
	}

}
