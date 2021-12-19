package java13;
import java.util.Scanner;
class Exception520 extends Exception{
	
}
class Exceptionelse extends Exception{
	
}
class a520{
	private static int b;
	public void seta(int b) throws Exception520, Exceptionelse{
	if(b==520) 
		throw new Exception520();
	else
		throw new Exceptionelse();
		
	
}
}
public class Class13 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		a520 a1 = new a520();
		int a;
		
		Scanner scanner = new Scanner(System.in);
		a =  scanner.nextInt();
		try {
			a1.seta(a);
			
		}
		catch(Exception520 e){
			System.out.println("這是由字串520所引起的例外");
		}
		catch(Exceptionelse e) {
			System.out.println(a);
		}
		
	}

}
