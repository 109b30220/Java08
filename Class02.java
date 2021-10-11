package test08;

class Cbbb{
	double x;
	double y;
	
}

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb avg = new Cbbb();
		avg.x=(5.2+6.5)/2;
		avg.y=(3.9+4.6)/2;
		Cbbb obj2 = new Cbbb();
		obj2.x=6.5;
		obj2.y=4.6;
		Cbbb obj1 = new Cbbb();
		obj1.x=5.2;
		obj1.y=3.9;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(avg);
	}
	
}
